package assigment2;

//BookstoreInventory class for managing the inventory of books
import java.util.LinkedList;

class BookstoreInventory {
    public LinkedList<Book> getInventory() {
        return inventory;
    }

    private LinkedList<Book> inventory;

 public BookstoreInventory() {
     inventory = new LinkedList<>();
 }

 public void addBook(String title, String author, double price) {
     Book book = new Book(title, author, String.valueOf(inventory.size()) , price);
     inventory.add(book);
     System.out.println("Book added successfully!");
 }

 public void removeBook(String ISBN) {
     Book bookToRemove = null;
     for (Book book : inventory) {
         if (book.getISBN().equals(ISBN)) {
             bookToRemove = book;
             break;
         }
     }
     if (bookToRemove != null) {
         inventory.remove(bookToRemove);
         System.out.println("Book removed successfully!");
     } else {
         System.out.println("Book not found in the inventory.");
     }
 }

 public void displayInventory() {
     if (inventory.isEmpty()) {
         System.out.println("Inventory is empty.");
     } else {
         System.out.println("Inventory:");
         for (Book book : inventory) {
             System.out.println(book.toString());
         }
     }
 }

 public Book searchBook(String title) {
     for (Book book : inventory) {
         if (book.getTitle().equalsIgnoreCase(title)) {
             return book;
         }
     }
     return null;
 }

 public void updatePrice(String ISBN, String newPrice) {
     Book bookToUpdate = null;
     for (Book book : inventory) {
         if (book.getISBN().equals(ISBN)) {
             bookToUpdate = book;
             break;
         }
     }
     if (bookToUpdate != null) {
         bookToUpdate.setPrice(Double.parseDouble(newPrice));
         System.out.println("Price updated successfully!");
     } else {
         System.out.println("Book not found in the inventory.");
     }
 }
}

