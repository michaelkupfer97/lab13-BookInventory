package assigment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BookstoreInventory bookstore = new BookstoreInventory();
		Scanner scanner = new Scanner(System.in);

		MenuOption[] options = MenuOption.values();

		System.out.println("Welcome to the Online Bookstore Inventory Management!\n");

		while (true) {
			System.out.println("Menu:");
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i].getDescription());
			}

			System.out.print("\nEnter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			if (choice < 1 || choice > options.length) {
				System.out.println("Invalid choice. Please try again.\n");
				continue;
			}

			if (options[choice - 1] == MenuOption.EXIT) {
				break;
			}

			switch (options[choice - 1]) {
				case ADD_BOOK:
					System.out.println("\nEnter the book details:");
					System.out.print("Title: ");
					String title = scanner.nextLine();
					System.out.print("Author: ");
					String author = scanner.nextLine();
					System.out.print("Price: ");
					double price = scanner.nextDouble();
					scanner.nextLine(); // Consume the newline character
					bookstore.addBook(title, author, price);
					break;

				case REMOVE_BOOK:
					System.out.print("\nEnter the ISBN of the book to remove: ");
					String removeISBN = scanner.nextLine();
					bookstore.removeBook(removeISBN);
					break;

				case DISPLAY_INVENTORY:
					bookstore.displayInventory();
					break;

				case SEARCH_BOOK:
					System.out.print("\nEnter the title to search: ");
					String searchTitle = scanner.nextLine();
					Book searchResult = bookstore.searchBook(searchTitle);
					if (searchResult != null) {
						System.out.println("\nBook found:");
						System.out.println(searchResult.toString());
					} else {
						System.out.println("\nBook not found in the inventory.");
					}
					break;

				case UPDATE_PRICE:
					System.out.print("\nEnter the ISBN of the book to update: ");
					String updateISBN = scanner.nextLine();
					System.out.print("Enter the new price: ");
					String newPrice = scanner.nextLine();
					bookstore.updatePrice(updateISBN, newPrice);
					break;
			}

			System.out.println();
		}

		System.out.println("Thank you for using the Online Bookstore Inventory Management!");
	}
}
