package assigment2;

//Enum for menu options
public enum MenuOption {
	     ADD_BOOK("Add a book to the inventory"),
	     REMOVE_BOOK("Remove a book from the inventory"),
	     DISPLAY_INVENTORY("Display inventory"),
	     SEARCH_BOOK("Search for a book by title"),
	     UPDATE_PRICE("Update the price of a book"),
	     EXIT("Exit");

	     private final String description;

	     MenuOption(String description) {
	         this.description = description;
	     }

	     public String getDescription() {
	         return description;
	     }
	 }