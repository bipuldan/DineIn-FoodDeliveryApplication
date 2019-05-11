package com.cts.dinein.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartId;
	
	private Integer itemId;
	private String name;
	private Integer price;
	private Integer quantity;
	
	public Cart(){}
	

	public Cart(Integer itemId, String name, Integer price, Integer quantity) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Integer getCartId() {
		return cartId;
	}


	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", itemId=" + itemId + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	
}
