package com.crud.service;

import com.crud.domain.*;
import com.crud.persistence.ShopsRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//controller class for both created shops and products

public final class StockController {

    //instantiation of a shop repository
    final private ShopsRepository shopsRepository = new ShopsRepository();

    //basic constructor
    public StockController() {};

    //method for creating new flowershops
    void createNewFlowershop(FlowerShop newFlowerShop) {
        shopsRepository.addNewFlowerShop(newFlowerShop);
    }

    //method for listing all created shops
    public List<FlowerShop> getAllShops() {
        return ShopsRepository.getAllShops();
    }

    //method for searching shops
    FlowerShop findShop(String searchedShop) {
        FlowerShop shop = null;												    //instantiates the variable to be returned
        try {																		//try
            Stream<FlowerShop> s = ShopsRepository.getAllShops().stream();		    //instantiate a stream from the database list
            s = (searchedShop.chars().allMatch(Character::isDigit))				    //ternary checks whether the string entered with only numbers
                    ? s.filter(b -> b.getId() == Integer.parseInt(searchedShop))	//true: search store by id code
                    : s.filter(b -> b.getName().equalsIgnoreCase(searchedShop));	//false: true: search store by name
            shop = s.findFirst().get();											//assigns the store the variable that will be returned
        } catch (Exception e) {														//catch
            System.out.println("NoSuchElementException: Store not found!");		//print the error
        }
        return shop;
    }

    //method for create decoration
    void createDecoration(String name, String material, double price, String shop) {
        FlowerShop store = findShop(shop);
        if (store != null) {
            store.addStock(Factory.createDecoration(name, material, price));
        }
    }
    //method for create flowers
    void createFlower(String name, String color, double price, String shop) {
        FlowerShop store = findShop(shop);
        if (store != null) {
            store.addStock(Factory.createFlower(name, color, price));
        }
    }
    //method for creating trees
    void createTree(String name, double height, double price, String shop) {
        FlowerShop store = findShop(shop);
        if (store != null) {
            store.addStock(Factory.createTree(name, height, price));
        }
    }
    //method to print out all products in a stock
    void showStock(String searchedShop) {
        FlowerShop shop = findShop(searchedShop);										//store instance
        if (searchedShop !=  null) {													//check if not null
            System.out.println("Stock of " + shop.getName() + 							//header printing
                    " | Total amount Items: " + shop.getStock().size());

            printItemsList("Decoration", shop, new Decoration("", "", 0));	//product stock printing decoration
            printItemsList("Flowers", shop, new Flower("", "", 0));		    //product stock printing flowers
            printItemsList("Tree", shop, new Tree("", 0, 0));				    //product stock printing trees

            System.out.println("\n______________________________________________________\n");//footer printing
        }
    }
    //method for
    private void printItemsList(String type, FlowerShop store, Product item) {
        List<Product> stock = store.getStock().stream()				        //list from the store object stream
                .filter(x -> x.getClass().equals(item.getClass()))			//stock filtering from the item class
                .collect(Collectors.toList());								//string to list conversion
        System.out.println("\n" + type + ": " + stock.size() + " items");	//header print
        stock.forEach(System.out::println);									//stock print
    }


    //internal and private class for object creation to be used as parameters by other methods
    private static class Factory {

        static FlowerShop createBusiness(String name) {
            return new FlowerShop(name);
        }

        static Decoration createDecoration(String name, String material, double price) {
            return new Decoration(name, material, price);
        }

        static Flower createFlower(String name, String colour, double price) {
            return new Flower(name, colour, price);
        }

        static Tree createTree(String name, double height, double price) {
            return new Tree(name, height, price);
        }
    }
}
