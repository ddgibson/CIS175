package model;
/**
 * @author ddgibson
 * CIS175 - Fall 2021
 * Oct 14, 2021
 */
/**
 * @author froda
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="CARMODEL")
	private String car;
	@Column(name="YEAR")
	private int year;

	public ListItem(){
		super();
	}
	
	public ListItem(String car, int year) {
		super();
		this.car = car;
		this.year = year;
	}
	
	public String returnItemDetails() {
		return this.year + ": " + this.car;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	public void setCar(String car) {
		this.car= car;
	}
	
	public String getCar() {
		return this.car;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	
}
