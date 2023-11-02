package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine  {


private static List <VendingMachineItems>  itemName;

public void vendingMachine(){
    itemName = new ArrayList<>();

    //We implemented a scanner to read a file, then the file goes to the next line, splits it on the pipe
    //With a .split method, parses the double, WE STILL NEED TO PARSE THE INT FOR QUANTITY, then started a loop
    //To go through the new string array to read the file and print out new string.

 String fileName = "C:\\Users\\Student\\workspace\\oct-blue-capstone-1-team-3\\capstone\\vendingmachine.csv";

 File file = new File(fileName);

 try(Scanner fileReader = new Scanner(file)){

     while(fileReader.hasNextLine()){

         String line = fileReader.nextLine();

         String[] lineParts = line.split("|"); //Holds new array storing all values

         Double price = Double.parseDouble(lineParts[2]);

         for(int i = 0; i < lineParts.length; i++) {

             System.out.println(lineParts);
         }
     }


 }catch(Exception ex){
     System.out.println("File not found");
 }




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
public static List <VendingMachineItems> getItemName(){
    return itemName;
}

    public void restock(){//The vending machine reads its inventory from an input file when the vending machine starts.
        for(VendingMachineItems restockItem: itemName){
           restockItem.setQuantity(5);

        }
    //    public void checkItems (List<VendingMachineItems> itemName) {

   //     }
        // now we are displaying item that are left in quantity or "sold out"
    /*    public void checkItems(){
            System.out.println("Slot Name Price Quantity");
            for(VendingMachineItems restockItem: itemName){
                if(restockItem.setQuantity() == 0 ){
                    System.out.println("Sold Out");
                }
            }
        }
*/
}}
