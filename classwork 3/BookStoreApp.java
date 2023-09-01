import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String bookTitle;
    private String bookAuthor;
    private int numOfCopies;

    public Book(String bookTitle, String bookAuthor, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.numOfCopies = numOfCopies;
    }

    public void display() {
        System.out.println(bookTitle + " - " + bookAuthor + " - " + numOfCopies);
    }

    @Override
    public String toString() {
        return bookTitle + " - " + bookAuthor + " - " + numOfCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }
}

class BookStore {
    private String name;
    private ArrayList<Book> books;

    public BookStore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void sell(String bookTitle, String author, int noOfCopies) {
        Book book = findBook(bookTitle, author);
        if (book != null) {
            int currentCopies = book.getNumOfCopies();
            if (currentCopies >= noOfCopies) {
                book.setNumOfCopies(currentCopies - noOfCopies);
                System.out.println("Sold " + noOfCopies + " copies of " + bookTitle + " by " + author);
            } else {
                System.out.println("Not enough copies of " + bookTitle + " by " + author + " available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void order(String bookTitle, String author, int noOfCopies) {
        Book book = findBook(bookTitle, author);
        if (book != null) {
            book.setNumOfCopies(book.getNumOfCopies() + noOfCopies);
            System.out.println("Ordered " + noOfCopies + " more copies of " + bookTitle + " by " + author);
        } else {
            // If the book is not found, add a new book entry
            Book newBook = new Book(bookTitle, author, noOfCopies);
            books.add(newBook);
            System.out.println("Ordered " + noOfCopies + " copies of a new book: " + bookTitle + " by " + author);
        }
    }

    public void display() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            book.display();
        }
    }

    private Book findBook(String bookTitle, String author) {
        for (Book book : books) {
            if (book.getBookTitle().equals(bookTitle) && book.getBookAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }
}

public class BookStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore bookstore = new BookStore("My Bookstore");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display all available books");
            System.out.println("2. Order books");
            System.out.println("3. Sell books");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookstore.display();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String orderTitle = scanner.next();
                    System.out.print("Enter book author: ");
                    String orderAuthor = scanner.next();
                    System.out.print("Enter the number of copies to order: ");
                    int orderCopies = scanner.nextInt();
                    bookstore.order(orderTitle, orderAuthor, orderCopies);
                    break;
                case 3:
                    System.out.print("Enter book title: ");
                    String sellTitle = scanner.next();
                    System.out.print("Enter book author: ");
                    String sellAuthor = scanner.next();
                    System.out.print("Enter the number of copies to sell: ");
                    int sellCopies = scanner.nextInt();
                    bookstore.sell(sellTitle, sellAuthor, sellCopies);
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
