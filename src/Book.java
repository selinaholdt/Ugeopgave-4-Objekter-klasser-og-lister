public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        // Validering (ekstra udfordring)
        if (title == null || title.isEmpty()) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }

        if (author == null || author.isEmpty()) {
            this.author = "Unknown";
        } else {
            this.author = author;
        }

        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Du har lånt: " + title);
        } else {
            System.out.println(title + " er ikke tilgængelig");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Returneret: " + title);
    }

    public String toString() {
        String status = available ? "Tilgængelig" : "Udlånt";
        return title + " af " + author + " - " + status;
    }


}
