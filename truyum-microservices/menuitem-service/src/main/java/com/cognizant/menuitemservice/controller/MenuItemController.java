package com.cognizant.menuitemservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.menuitemservice.model.MenuItem;
import com.cognizant.menuitemservice.service.MenuItemService;


@RestController
public class MenuItemController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);
	
	@Autowired
	private MenuItemService menuItemService;
	
	@GetMapping("/show-menu-list-admin")
	public Iterable<MenuItem> showMenuItemListAdmin() {
		LOGGER.info("Start ");
		Iterable<MenuItem> menuItemList = menuItemService.getMenuListAdmin();
		LOGGER.debug("Menu Items: {}", menuItemList);
		LOGGER.info("End");
		return menuItemList;
	}
	
	@GetMapping("/show-menu-list-customer")
	public Iterable<MenuItem> showMenuItemListCustomer() {
		LOGGER.info("Start ");
		Iterable<MenuItem> menuItemList = menuItemService.getMenuListCustomer();
		LOGGER.debug("Menu Items: {}", menuItemList);
		LOGGER.info("End");
		return menuItemList;
	}
	
	@PutMapping("/show-edit-menu-item")
	public MenuItem editMenuItem(@RequestBody MenuItem menuItem) {
		LOGGER.info("Start");
		MenuItem menuItemRet=menuItemService.modifyMenuItem(menuItem);
		LOGGER.debug("Menu Item: {}",menuItemRet);
		LOGGER.info("End");
		return menuItemRet;
	}
}
