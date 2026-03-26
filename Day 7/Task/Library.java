import java.util.ArrayList;
import java.util.List;


// Library management system
public class Library {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Added Successfully");
    }

    public void removeItem(LibraryItem item) {
        items.remove(item);
        System.out.println("Removed Successfully");
    }


    // Main method for demonstration
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", 2020, "1234567890");
        Book book2 = new Book("Data Structures", "Jane Smith", 2019, "0987654321");
        Magazine mag1 = new Magazine("Tech Today", "Alice Brown", 2023, 45);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(mag1);

       book1.displayInfo();
        book2.displayInfo();
        mag1.displayInfo();

        library.removeItem(book2);
        book1.displayInfo();
        mag1.displayInfo();

}}

// Base class for library items
class LibraryItem {
    protected String title;
    protected String author;
    protected int year;
    protected boolean isAvailable;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

}

// Book class inheriting from LibraryItem
class Book extends LibraryItem {
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        super(title, author, year);
        this.isbn = isbn;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ISBN: " + isbn);
        System.out.println("Type: Book");
        System.out.println("-------------------");
    }

    public String getIsbn() {
        return isbn;
    }
}

// Magazine class inheriting from LibraryItem
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Type: Magazine");
        System.out.println("-------------------");
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}

