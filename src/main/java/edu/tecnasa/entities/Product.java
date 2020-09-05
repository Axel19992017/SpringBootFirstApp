package edu.tecnasa.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="E_PRODUCT")
public class Product implements Identifiable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PRODUCTO")
	private Long id;
	
	@Column(length=30, nullable = false)
	private String title;
	
	@Column(nullable = false, precision=19, scale=19)
	private BigDecimal price;
	
	@Column(length=255)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORY", nullable = false)
	private Category category;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private boolean special;
}
