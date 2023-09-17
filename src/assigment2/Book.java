package assigment2;

// Book class representing a book with title, author, ISBN, and price
class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
		this.price=newPrice;	
	}
    
    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + ISBN + " | Price: $" + price;
    }
}
