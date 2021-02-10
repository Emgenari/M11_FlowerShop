package com.crud.controller;

import java.util.List;

import com.crud.service.StockManager;

public final class BusinessController {

	private final StockManager manager;

	//constructor
	public BusinessController() {
		manager = new StockManager();
	}

	//create 1 store
	public void createNewFlowerShop(String name) {
		manager.createNewFlowerShop(name);
	}

	//read all stores
	public List<?> getAllShops() {
		return manager.getAllShops();
	}

	//find 1 sotre
	public Object getStore(String store) {
		return manager.findShop(store);
	}

	//create decoration and add to a store
	public void createDecoration(String name, Material material, double price, String Store) {
		manager.createDecoration(name, material.toString(), price, Store);
	}

	//create flower and add to a store
	public void createFlower(String name, Color colour, double price, String Store) {
		manager.createFlower(name, colour.toString(), price, Store);
	}

	//create tree and add to a store
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