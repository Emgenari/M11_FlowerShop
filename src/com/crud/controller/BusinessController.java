package com.crud.controller;

import com.crud.service.*;

import java.util.List;

public final class BusinessController {

	private final StockManager manager;

	//constructor
	public BusinessController() {
		manager = new StockManager();
	}

	//create store
	public void createFlowerShop(String name) {
		manager.createFlowerShop(name);
	}

	//get all stores
	public List<?> getAllFlowerShops() {
		return manager.getAllFlowerShops();
	}

	//find 1 store
	public Object getFlowerShop(String store) {
		return manager.findFlowerShop(store);
	}

	//create decoration
	public void createDecoration(String name, Material material, double price, String Store) {
		manager.createDecoration(name, material.toString(), price, Store);
	}

	//create flower
	public void createFlower(String name, Color colour, double price, String Store) {
		manager.createFlower(name, colour.toString(), price, Store);
	}

	//create tree
	public void createTree(String name, double height, double price, String Store) {
		manager.createTree(name, height, price, Store);
	}

	//read stock
	public void showStock(String Store) {
		manager.showStock(Store);
	}

	//enum material
	public enum Material {
		Plastic, Wood;
	}

	//enum color
	public enum Color {
		Red, Green, Blue, Yellow;
	}
}