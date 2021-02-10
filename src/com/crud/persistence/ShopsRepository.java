package com.crud.persistence;

import com.crud.domain.FlowerShop;

import java.util.ArrayList;
import java.util.List;

public class ShopsRepository {

    private static List<FlowerShop> flowerShops;

    //Constructor
    public ShopsRepository() {
        flowerShops = new ArrayList<>();
    }
    //Getter
    public static List<FlowerShop> getAllShops() {
        return new ArrayList<>(flowerShops);
    }
    //adds the new flowershop to the flowershops list
    public void addNewFlowerShop(FlowerShop newFlowerShop) {
            flowerShops.add(newFlowerShop);
    }
    
}
