/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.cardText;
import dmacc.beans.cardType;

/**
 * @author froda
 *
 */
@Configuration 
public class beanConfiguration { 
  
 @Bean 
 public cardType contact() { 
	 cardType bean = new cardType("Lightning Bolt"); 
	  bean.setColor("Red"); 
	  bean.setType("Instant"); 
	  return bean; 
 } 
 
 @Bean 
 public cardText ct() { 
  cardText bean = new cardText(5, 5, "Vigilance"); 
  return bean; 
 }
 
}