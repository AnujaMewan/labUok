package BookDetails;

/**
 * OOP Class representing a Book entity.
 * This class stores data and contains the core business logic[cite: 215, 216].
 * * @author Anuja Mewan
 */
public class Book {
    // Private attributes for data encapsulation [cite: 426]
    private String title;
    private String author;
    private int pages;

    /**
     * Constructor to initialize the Book object[cite: 427].
     * * @param title  The title of the book
     * @param author The author of the book
     * @param pages  The total number of pages
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Getter methods to access encapsulated data safely [cite: 428]
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    /**
     * Business logic method to classify the book type based on page count[cite: 429].
     * Separates backend logic entirely from the User Interface[cite: 19, 394].
     * * @return "Short Book" if pages are less than 100, otherwise "Regular Book" [cite: 430, 431]
     */
    public String getBookType() {
        if (this.pages < 100) {
            return "Short Book"; // Less than 100 pages [cite: 430]
        } else {
            return "Regular Book"; // 100 pages or more [cite: 431]
        }
    }
}