package com.cognizant.menuitemservice.model;

import java.util.HashSet;
import java.util.Set;

public class Cart {
	private Set<MenuItem> menuItemList;
	Double total;

	public Cart() {
		super();
		menuItemList=new HashSet<MenuItem>();
	}

	public Cart(Set<MenuItem> menuItemList, Double total) {
		super();
		this.menuItemList = menuItemList;
		this.total = total;
	}

	public Set<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(Set<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
