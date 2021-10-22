package dmacc;

/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Ingredient;
import dmacc.beans.menuItems;
import dmacc.controller.beanConfiguration;
import dmacc.repository.myRepository;

@SpringBootApplication
public class menuItemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(menuItemApplication.class, args);
		
	}
	
	@Autowired
	myRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(beanConfiguration.class);
		
		//Using an existing bean
		menuItems m = appContext.getBean("menuItems", menuItems.class);
		m.setPrice(13);
		repo.save(m);
		
		//Create a bean to use - not managed by Spring
		//public menuItems(String name, String category, int price, Ingredient ingredients)
		menuItems i = new menuItems("Spaghetti and Meatballs", "Entree", 11);
		Ingredient s = new Ingredient("Italian Sauce", "Spaghetti Noodles", "Meatballs");
		i.setIngredient(s);
		repo.save(i);
		
		List<menuItems> allItems = repo.findAll();
		for(menuItems items: allItems) {
			System.out.println(allItems.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
		((AbstractApplicationContext) appContext).close();
	
	}

}