/**
 * @author Derek Gibson- ddgibson
 * CIS175 - Fall 2021
 * September 15, 2021
 */

import java.util.List;
import java.util.Scanner;

import controller.ListItemHelper;
import model.ListItem;

public class StartProgram {

		static Scanner in = new Scanner(System.in);
		static ListItemHelper lih = new ListItemHelper();

		private static void addAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter a car model: ");
			String car = in.nextLine();
			System.out.print("Enter its year: ");
			int year = in.nextInt();
			ListItem toAdd = new ListItem(car,year);
			lih.insertItem(toAdd);

		}

		private static void deleteAnItem() {
			// TODO Auto-generated method stub
			System.out.print("Enter the car to delete: ");
			String car = in.nextLine();
			System.out.print("Enter the year to delete: ");
			int year = in.nextInt();
			ListItem toDelete = new ListItem(car,year);
			lih.deleteItem(toDelete);

		}

		private static void editAnItem() {
			// TODO Auto-generated method stub
			System.out.println("How would you like to search? ");
			System.out.println("1 : Search by Car");
			System.out.println("2 : Search by Year");
			int searchBy = in.nextInt();
			in.nextLine();
			List<ListItem> foundItems;
			if (searchBy == 1) {
				System.out.print("Enter the car model: ");
				String carName = in.nextLine();
				foundItems = lih.searchForItemsByCar(carName);
				
			} else {
				System.out.print("Enter the year: ");
				int year = in.nextInt();
				foundItems = lih.searchForItemByYear(year);
				

			}

			if (!foundItems.isEmpty()) {
				System.out.println("Found Results.");
				for (ListItem l : foundItems) {
					System.out.println(l.getID() + " : " + l.toString());
				}
				System.out.print("Which ID to edit: ");
				int idToEdit = in.nextInt();

				ListItem toEdit = lih.searchForItemById(idToEdit);
				System.out.println("Retrieved " + toEdit.getYear() + " from " + toEdit.getCar());
				System.out.println("1 : Update Car");
				System.out.println("2 : Update Year");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Car: ");
					String newCar = in.nextLine();
					toEdit.setCar(newCar);
				} else if (update == 2) {
					System.out.print("New Year: ");
					int newYear = in.nextInt();
					toEdit.setYear(newYear);
				}

				lih.updateItem(toEdit);

			} else {
				System.out.println("---- No results found");
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean goAgain = true;
			System.out.println("--- Welcome to our Car lot list! ---");
			while (goAgain) {
				System.out.println("*  Select an item:");
				System.out.println("*  1 -- Add a car");
				System.out.println("*  2 -- Edit an item");
				System.out.println("*  3 -- Delete an item");
				System.out.println("*  4 -- View the car list");
				System.out.println("*  5 -- Exit");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addAnItem();
				} else if (selection == 2) {
					editAnItem();
				} else if (selection == 3) {
					deleteAnItem();
				} else if (selection == 4) {
					viewTheList();
				} else {
					lih.cleanUp();
					System.out.println("   Program Ended   ");
					goAgain = false;
				}

			}

		}

		private static void viewTheList() {
			// TODO Auto-generated method stub
			List<ListItem> allItems = lih.showAllItems();
			
			for(ListItem singleItem : allItems) {
				System.out.println(singleItem.returnItemDetails());
			}
			

		}

	}
