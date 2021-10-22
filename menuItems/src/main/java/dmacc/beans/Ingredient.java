/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author froda
 *
 */
@Embeddable
public class Ingredient {
	 private String sauce;
	 private String ingredientOne; 
	 private String ingredientTwo; 
	 
	 public Ingredient() {
		 super();
	 }
	 
	 public Ingredient(String sauce, String ingredientOne, String ingredientTwo) {
		 this.sauce = sauce;
		 this.ingredientOne = ingredientOne;
		 this.ingredientTwo = ingredientTwo;
	 }
	 
	 public void setIngredients(String ingredientOne, String ingredientTwo) {
		 this.ingredientOne = ingredientOne;
		 this.ingredientTwo = ingredientTwo;
	 }
	 
	 public void setSauce(String sauce) {
		 this.sauce = sauce;
	 }
	 
	 public String getSauce() {
		 return sauce;
	 }
	 
	 public String getIngredients() {
		 return ingredientOne + " and "  + ingredientTwo;
	 }
	 
	 @Override 
	 public String toString() { 
		 return "[Sauce=" + sauce + ", with: " + ingredientOne + " and " + ingredientTwo + "]"; 
	 } 
}
	 

