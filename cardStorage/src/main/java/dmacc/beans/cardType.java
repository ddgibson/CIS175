/**
 * @author froda - ddgibson
 * CIS175 - Fall 2021
 * Nov 4, 2021
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
public class cardType {
	@Id
	@GeneratedValue
	private long id;
	private String color;
	private String type;
	private String name;
	@Autowired
	private cardText ct;
	
	public cardType() {
		super();
		// TODO Auto-generated constructor stub
		this.color = "red";
	}
	
	public cardType(String name) {
		super();
		this.name = name;
	}

	public cardType(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public cardType(long id, String name, String type, String color) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public cardText getCardText() {
		return ct;
	}

	public void setCardText(cardText ct) {
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", name=" + name + ", color=" + color + ", type=" + type
				+ ", Info:" + ct + "]";
	}

	
}