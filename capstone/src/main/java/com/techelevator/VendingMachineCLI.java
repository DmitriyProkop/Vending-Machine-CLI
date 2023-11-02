package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class VendingMachineCLI extends VendingMachine{

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";

	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };

	private Menu menu;

	private VendingMachine options = new VendingMachine();

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				//display item list;

				File file = new File("C:\\Users\\Student\\workspace\\oct-blue-capstone-1-team-3\\capstone\\vendingmachine.csv");

				try(Scanner fileReader = new Scanner(file)){

					while(fileReader.hasNextLine()){

						String line = fileReader.nextLine();

							System.out.println(line);

					}


				}catch(Exception ex) {
					System.out.println("File not found");
				}

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
			}else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
