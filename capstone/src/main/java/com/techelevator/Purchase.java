package com.techelevator;

import com.techelevator.view.Menu;

import java.util.Scanner;

public class Purchase {

    private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";

    private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";

    private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

    private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};

    private Menu purchaseMenu;

    private VendingMachine options = new VendingMachine();

    private double moneyProvided = 0.00;

    Scanner scanner = new Scanner(System.in);
    String amountPutIn = scanner.nextLine(); //holds the amount typed in STRING FORM

    double moneyPutIn = Double.parseDouble(amountPutIn);

    //CONSTRUCTOR
    public Purchase(Menu purchaseMenu){
        this.purchaseMenu = purchaseMenu;
    }

    public void run() {
        while (true) {
            String choice = (String) purchaseMenu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);

            //Display current amount of money in the Purchase Menu
            System.out.println("Current Money Provided: $"+ moneyProvided);

            if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
                //select amount to feed into the vending machine
                moneyProvided += moneyPutIn;
                //
            }
            if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
                //Get the product, print out string with product quote, and update quantity left.
            }
            if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
                //Returns customers input money, balance updates to 0, return main menu

            }
        }
    }


}
