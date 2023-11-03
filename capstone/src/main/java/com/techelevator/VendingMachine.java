package com.techelevator;

import java.io.File;
import java.util.*;

public class VendingMachine {


    private Map<String, VendingMachineItems> itemList; //Created a map holding all our values

    public VendingMachine() {
        itemList = new LinkedHashMap<>();

        //We implemented a scanner to read a file, then the file goes to the next line, splits it on the pipe
        //With a .split method, parses the double, WE STILL NEED TO PARSE THE INT FOR QUANTITY, then started a loop
        //To go through the new string array to read the file and print out new string.

        String fileName = "C:\\Users\\Student\\workspace\\oct-blue-capstone-1-team-3\\capstone\\vendingmachine.csv";
        //Reads the file we passed in

        File file = new File(fileName);

        try (Scanner fileReader = new Scanner(file)) {

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine(); //Holds value of line read

                String[] lineParts = line.split("\\|"); //Holds new array storing all values

                Double price = Double.parseDouble(lineParts[2]); // Gets the price in numerical vale not String

                String slot = lineParts[0]; //Holds the Vending machine slot

                String itemName = lineParts[1]; //Holds the item name

                String itemType = lineParts[3]; //Holds the item type "Chip, Drink, etc"

                int quantityAmount = Integer.parseInt(lineParts[4]);
                itemList.put(slot, new VendingMachineItems( slot, itemName, price , itemType, quantityAmount ));
            }


        } catch (Exception ex) {
            System.out.println("File not found");
        }



//This is hardcoding, However, we ended up dynamically coding and displaying with map.
    /*
    itemName.add(new VendingMachineItems("Potato Crisps", 3.05 , "Chip" ));
    itemName.add(new VendingMachineItems("Stackers", 1.45 , "Chip"));
    itemName.add(new VendingMachineItems("Grain Waves", 2.75 , "Chip"));
    itemName.add(new VendingMachineItems("Cloud Popcorn", 3.65 , "Chip"));
    itemName.add(new VendingMachineItems("Moonpie", 1.80 , "Candy"));
    itemName.add(new VendingMachineItems("Cowtales", 1.50 , "Candy"));
    itemName.add(new VendingMachineItems("Wonka Bar", 1.50 , "Candy"));
    itemName.add(new VendingMachineItems("Crunchie", 1.75 , "Candy"));
    itemName.add(new VendingMachineItems("Cola", 1.25 , "Drink"));
    itemName.add(new VendingMachineItems("Dr. Salt", 1.50 , "Drink"));
    itemName.add(new VendingMachineItems("Mountain Melter", 1.50 , "Drink"));
    itemName.add(new VendingMachineItems("U-Chews", 0.85 , "Gum"));
    itemName.add(new VendingMachineItems("Little League Chew", 0.95 , "Gum"));
    itemName.add(new VendingMachineItems("Chiclets",  0.75, "Gum"));
    itemName.add(new VendingMachineItems("Triplemints", 0.75 , "Gum"));
*/
    }

    public Map<String, VendingMachineItems> getItemList() {
        return itemList;
    }

    public void display() {       //To be able to display our Map
        for(Map.Entry<String, VendingMachineItems>entry:itemList.entrySet()){  //For each loop, to go through each item

            VendingMachineItems item = entry.getValue();    //Holds the entirety of our Maps Value

            System.out.println(item.getSlot() + "|" + item.getName() + "|" + item.getPrice() + "|" + item.getType() + "|" + item.getQuantity());
            //Displays our items
        }

    }

    public void purchase(String slot){
       VendingMachineItems items = itemList.get(slot); //Now we can call on the Slot which pulls up entire value list.

    }

  /*  public void restock() {//The vending machine reads its inventory from an input file when the vending machine starts.
        for (VendingMachineItems restockItem : itemList) {
            restockItem.setQuantity(5);

        }
        //    public void checkItems (List<VendingMachineItems> itemName) {

        //     }
        // now we are displaying item that are left in quantity or "sold out"
        public void checkItems(){
            System.out.println("Slot Name Price Quantity");
            for(VendingMachineItems restockItem: itemName){
                if(restockItem.setQuantity() == 0 ){
                    System.out.println("Sold Out");
                }
            }
        }
*/

}
