package BookDetails;

public class Book {
    // Private attributes for data encapsulation [cite: 426]
    private String title;
    private String author;
    private int pages;

   
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

    
    public String getBookType() {
        if (this.pages < 100) {
            return "Short Book"; // Less than 100 pages [cite: 430]
        } else {
            return "Regular Book"; // 100 pages or more [cite: 431]
        }
    }
}