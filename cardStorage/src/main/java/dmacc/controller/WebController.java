/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.cardType;
import dmacc.repository.CardRepository;

/**
 * @author froda
 *
 */
@Controller 
public class WebController { 
 @Autowired 
 CardRepository repo; 
 
 	@GetMapping({ "/", "viewAll" }) 
 	public String viewAllCards(Model model) { 
 		if(repo.findAll().isEmpty()) { 
 		   return addNewCard(model); 
 		  } 
 		   
 		  model.addAttribute("cards", repo.findAll()); 
 		  return "results";
 	}
 	
 	@GetMapping("/inputContact") 
 	 public String addNewCard(Model model) { 
 	     cardType c = new cardType(); 
 	     model.addAttribute("newCard", c); 
 	     return "input"; 
 	 } 
 	
 	@GetMapping("/delete/{id}") 
 	 public String deleteCard(@PathVariable("id") long id, Model model) { 
 	  cardType c = repo.findById(id).orElse(null); 
 	     repo.delete(c); 
 	     return viewAllCards(model);
 	}
 	
 	@PostMapping("/inputContact") 
 	 public String addNewCard(@ModelAttribute cardType c, Model model) { 
 	  repo.save(c); 
 	  return viewAllCards(model); 
 	 }
 	
 	@PostMapping("/update/{id}") 
 	 public String reviseCard(cardType c, Model model) { 
 	  repo.save(c); 
 	  return viewAllCards(model); 
 	 } 
}
