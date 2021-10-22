/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author froda
 *
 */
@Entity 
public class menuItems {
	@Id 
	@GeneratedValue
	private long id; 
	private String name; 
	
	//appetizer, entree, dessert... etc
	private String category;
	
	private int price;
	@Autowired
	private Ingredient ingredients;
	
	public menuItems(String name) { 
		 this.name = name;
	} 
	 
	public menuItems(int id, String name, String category, int price, Ingredient ingredients) { 
		 this.id = id;
		 this.name = name;
		 this.category = category;
		 this.price = price;
		 this.ingredients = ingredients;
	}
	
	public menuItems(String name, String category, int price) { 
		 this.name = name;
		 this.category = category;
		 this.price = price;
	}
	 
	 
	public menuItems( ) { 
		 super(); 
	} 
	 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCategory(String category) {
		
		this.category = category;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setIngredient(Ingredient ingredients) {
		this.ingredients = ingredients;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Ingredient getIngredients() {
		return ingredients;
	}
	public String toString() { 
		  return "Category: " + category + ", Item: " + name + ", Price: " + price + ", Ingredients: " + ingredients; 
	} 
}
