public class Book {
    private String title;
    private String author;
    private int year;
    private String bookId;

    // Parameterized constructor
    public Book(String title, String author, int year, String bookId) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.bookId = bookId;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Book ID: " + bookId);
    }

    public static void main(String[] args) {
        // Create a Book object using the constructor
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "ISBN123456");
        
        // Display the book's information using the displayInfo method
        book1.displayInfo();
    }
}
