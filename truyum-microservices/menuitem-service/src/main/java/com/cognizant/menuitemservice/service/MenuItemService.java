package com.cognizant.menuitemservice.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.menuitemservice.exception.ResourceNotFoundException;
import com.cognizant.menuitemservice.model.MenuItem;
import com.cognizant.menuitemservice.repository.MenuItemRepository;

@Service
public class MenuItemService {
	
	@Autowired
	private MenuItemRepository menuItemRepository;
	
	@Transactional	
	public Iterable<MenuItem> getMenuListAdmin(){
		return menuItemRepository.findAll();
	}

	@Transactional
	public Iterable<MenuItem> getMenuListCustomer() {
		return menuItemRepository.getMenuItemListCustomer();
	}

	@Transactional
	public MenuItem getMenuItem(Long menuItemId) {
		return menuItemRepository.findById(menuItemId).get();
	}

	@Transactional
	public MenuItem modifyMenuItem(MenuItem menuItem) {
		Optional<MenuItem> menuItemDb=menuItemRepository.findById(menuItem.getId());
		if(menuItemDb==null) {
			throw new ResourceNotFoundException("Menu Item not found");
		}
		menuItemRepository.save(menuItem);
		return menuItem;
	}

}
