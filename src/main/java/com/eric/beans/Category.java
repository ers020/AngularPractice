package com.eric.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Table for categories being added (or removed) from stock
 * @author Eric
 *
 */

@Entity
@Table(name="STOCK_CATEGORY")
public class Category {

	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoryId")
	@SequenceGenerator(name="categoryId", sequenceName="CATEGORY_ID_SEQUENCE", initialValue=1, allocationSize=1)
	private long id;
	
	@Column(name="CATEGORY_CATEGORY")
	private String category;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Category() {
		super();
	}

	public Category(String category) {
		super();
		this.category = category;
	}

	public Category(long id, String category) {
		super();
		this.id = id;
		this.category = category;
	}
	
	
	
}
