package com.eric.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Table to items added (or removed) from stock
 * @author Eric
 *
 */

@Entity
@Table(name="STORE_STOCK")
public class Stock {
	
	@Id
	@Column(name="ITEM_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="itemId")
	@SequenceGenerator(name="itemId", sequenceName="ITEM_ID_SEQUENCE", initialValue=1, allocationSize=1)
	private long id;
	
	@Column(name="ITEM_NAME")
	private String name;
	
	@Column(name="ITEM_DESC")
	private String description;
	
	@Column(name="ITEM_PRICE")
	private double price;
	
	/**
	 * Relationship Mapping
	 */
	
	@ManyToOne
	@JoinColumn(name="ITEM_CATEGORY")
	private Category category;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Stock() {
		super();
	}

	public Stock(String name, String description, double price, Category category) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public Stock(long id, String name, String description, double price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}
	
	

}
