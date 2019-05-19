package net.pafgroup.sellnbuygroup.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.pafgroup.sellnbuygroup.models.Seller;
import net.pafgroup.sellnbuygroup.services.SellerService;

@Controller
public class AppController {
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Seller> listSellers = sellerService.listAll();
		model.addAttribute("listSellers", listSellers);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewSellerForm(Model model) {
		Seller seller = new Seller();
		model.addAttribute("seller", seller);
		
		return "new_seller";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveSeller(@ModelAttribute("seller") Seller seller) {
		sellerService.save(seller);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditSellerForm(@PathVariable(name = "id") Long id) {
		ModelAndView modelAndView = new ModelAndView("edit_seller");
		
		Seller seller = sellerService.get(id);
		modelAndView.addObject("seller", seller);
		
		return modelAndView;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteSeller(@PathVariable(name = "id") Long id) {
		sellerService.delete(id);
		
		return "redirect:/";
	}
}