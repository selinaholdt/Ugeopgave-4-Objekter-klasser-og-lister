import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("Tilføjet bog: " + book.getTitle());
        }
    }

    public ArrayList<Book> findAvailableBooks() {
        ArrayList<Book> available = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                available.add(book);
            }
        }
        return available;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void printAllBooks() {
        System.out.println("\n=== " + libraryName + " ===");
        System.out.println("Alle bøger:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }



}
