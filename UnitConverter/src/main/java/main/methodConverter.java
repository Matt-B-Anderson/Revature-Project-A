package main;

import java.util.Scanner;

public class methodConverter {
	static int menuSelection;
	static Scanner scanner = new Scanner(System.in);
	static methodConverter cv = new methodConverter();

	public static void main(String[] args) {

		cv.menu();

	}

	public void menuOptions() {
		scanner = new Scanner(System.in);
		System.out.println("Please select an option: ");
		System.out.println("1. Cups to Teaspoons ");
		System.out.println("2. Miles to Kilometers ");
		System.out.println("3. US Gallons to Imperial Gallons ");
		System.out.println("4 Quit ");

		menuSelection = scanner.nextInt();

	}

	public void reuseMenu() {
		System.out.println("Would you like to use another converter or quit?");
		System.out.println("Please type converter or quit");

		scanner = new Scanner(System.in);

		String userAnswer = scanner.nextLine();

		if (userAnswer.equals("converter")) {
			cv.menuOptions();
		} else {
			menuSelection = 4;
		}
	}

	public void menu() {
		cv.menuOptions();

		if (menuSelection == 4) {
			System.out.println("Thank you for your time!");
		} else {

			while (menuSelection != 4) {
				String menuString;
				switch (menuSelection) {
				case 1: {

					System.out.println("Please enter the number of cups");
					int nmbCups;
					nmbCups = scanner.nextInt();
					System.out.println("That is " + nmbCups * 48 + " Teaspoons.");
					cv.reuseMenu();

				}
					break;
				case 2: {
					System.out.println("Please enter the number of miles");
					float nmbMiles;
					nmbMiles = scanner.nextInt();
					System.out.println("That is " + nmbMiles * 1.60934 + " Kilometers.");
					cv.reuseMenu();
				}
					break;
				case 3: {
					System.out.println("Please enter the number of US Gallons");
					float nmbGallons;
					nmbGallons = scanner.nextInt();
					System.out.println("That is " + nmbGallons * 0.832674 + " Imperial Gallons.");
					cv.reuseMenu();
				}
					break;
				default: {
					menuString = "Invalid menu selection, please select another option.";
					System.out.println(menuString);
					menuSelection = scanner.nextInt();
				}
					break;
				}
			}

		}
		scanner.close();
	}

}
