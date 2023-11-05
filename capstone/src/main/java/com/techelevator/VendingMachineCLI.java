package com.techelevator;

import com.techelevator.view.Menu;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;



public class VendingMachineCLI extends VendingMachine {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";

	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_OPTIONS_HIDDEN_SALES_REPORT = "";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};





	private Menu menu;

	private VendingMachine options = new VendingMachine();

	private Purchase purchase = new Purchase(new Menu(System.in, System.out), options); // This allows us to access Purchase class.



	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				//display item list;


				File file = new File("C:\\Users\\Student\\workspace\\oct-blue-capstone-1-team-3\\capstone\\vendingmachine.csv");

				try (Scanner fileReader = new Scanner(file)) {

					while (fileReader.hasNextLine()) {

						String line = fileReader.nextLine();

						System.out.println(line);

					}


				} catch (Exception ex) {
					System.out.println("File not found");
				}

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
			} else {



				options.display();

			} if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				purchase.run();
			}else {
				System.out.println("Thank you for using the: Vendo-Matic 800 and supporting UMBRELLA CORP! We hope to see you again!");

				break;

			}
			if (choice.equals("4")){
				/*File file = new File(LocalDate.now().txt);

				try(PrintWriter writer = new PrintWriter(new FileOutputStream(file, true))){

					for(int i = 10; i < 20; i++){
						writer.println("This is line " + i);
					}

				} catch(Exception ex){
					System.out.println("Something went wrong writing to the file");
				} */
			}


		}
	}

		public static void main (String[]args){
			Menu menu = new Menu(System.in, System.out);
			VendingMachineCLI cli = new VendingMachineCLI(menu);
			cli.run();
		}
	}

