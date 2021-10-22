/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import dmacc.beans.menuItems;
import dmacc.beans.Ingredient;

/**
 * @author froda
 *
 */
@Configuration 
public class beanConfiguration { 
  
	@Bean 
	public menuItems menuItems( ) { 
		menuItems bean = new menuItems();
		return bean;
	}
	
	@Bean 
	public Ingredient ingredient() { 
		Ingredient bean = new Ingredient();
		return bean;
	}
 
}
