class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int quantity;

    public Book(String isbn, String title, String author, String genre, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
    }
    // Getters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getQuantity() { return quantity; }

    // Setter
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Book{ISBN=" + isbn + ", Title=" + title + ", Author=" + author +
                ", Genre=" + genre + ", Quantity=" + quantity + "}";
    }
}
