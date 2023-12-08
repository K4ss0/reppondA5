package com.coderscampus.arraylist;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userInput = "yes";

		CustomArrayList<String> customList = new CustomArrayList<>();

		while (userInput.equalsIgnoreCase("yes")) {
			System.out.println("Please Enter a name.");
			String name = scanner.nextLine();

			customList.add(name);
			System.out.println(name + " added to the list.");

			System.out.println("There are now " + customList.getSize() + " names in the list.");

			System.out.println("Would you like to enter another name? (yes/no)");
			userInput = scanner.nextLine();

			if (userInput.equalsIgnoreCase("no")) {
				System.out.println("Would you like to find a name on the list?");
				String nameHunt = scanner.nextLine();
				if (nameHunt.equalsIgnoreCase("yes")) {
					System.out.println("Pick a number between 0 and " + (customList.getSize() - 1));
					int index = Integer.parseInt(scanner.nextLine());
					if (index >= 0 && index < customList.getSize()) {
						String foundName = customList.get(index);
						System.out.println("Name is " + foundName);
					} else {
						System.out.println("Number not in range please try again.");
					}
				} else if (nameHunt.equalsIgnoreCase("no")) {
					System.out.println("Exiting Program.");

					if (nameHunt.equalsIgnoreCase("no"))
						;
					System.out.println("Exiting Program");
				}
			}
		}
		scanner.close();
	}
}
