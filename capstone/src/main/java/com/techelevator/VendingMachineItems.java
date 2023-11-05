package com.techelevator;

import com.techelevator.view.Menu;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineItems extends VendingMachine {
//PRIVATE VARIABLES
    private String name;

    private double price;

    private String type;

    private int quantity;

    private String slot;

//CONSTRUCTOR
    public void VendingMachineItems(String name, double price,String type, int quantity, String slot){
    this.name = name; //name of item
    this.price = price; //price of item
    this.type = type; // type of item "GUM, Chips, Drink"
    this.quantity = quantity; //how many of the item
    this.slot = slot;       //Where its stored
}
//THESE ARE THE GETTERS
    public String getName() {
        return name;
    }

    public String getType(){
    return type;
    }

    public double getPrice(){
    return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getSlot(){
        return slot;
    }


    //THESE ARE THE SETTERS
    public void setName(String name){
        this.name = name;
    }

public void setQuantity(int quantity){
        this.quantity = quantity;
}




}
