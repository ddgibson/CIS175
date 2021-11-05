/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author froda
 *
 */
@Embeddable
public class cardText {
	private int power;
	private int toughness;
	private String description;
	public cardText() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cardText(int power, int toughness, String description) {
		super();
		this.power = power;
		this.toughness = toughness;
		this.description = description;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getToughness() {
		return toughness;
	}
	public void setToughness(int toughness) {
		this.toughness = toughness;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "[P/T:" + power + "/" + toughness + ", " + description + "]";
	}

}