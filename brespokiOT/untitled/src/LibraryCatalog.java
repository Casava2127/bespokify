//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class LibraryCatalog {
//    private List<Book> books;
//
//    public LibraryCatalog() {
//        this.books = new ArrayList<>();
//    }
//
//    // Add sig
//    public void addBook(Book book) {
//        books.add(book);
//        System.out.println("Book added: " + book.getTitle());
//    }
//
//    // Add mul
//    public void addBooks(List<Book> newBooks) {
//        books.addAll(newBooks);
//        System.out.println(newBooks.size() + " books added to the catalog.");
//    }
//
//    // Remove a book by ISBN
//    public boolean removeBook(String isbn) {
//        Book book = findBookByIsbn(isbn);
//        if (book != null) {
//            books.remove(book);
//            System.out.println("Book removed: " + book.getTitle());
//            return true;
//        }
//        System.out.println("Book with ISBN " + isbn + " not found.");
//        return false;
//    }
//
//    // Remove multiple books by ISBNs
//    public void removeBooks(List<String> isbns) {
//        int removedCount = 0;
//        for (String isbn : isbns) {
//            if (removeBook(isbn)) {
//                removedCount++;
//            }
//        }
//        System.out.println(removedCount + " books removed from the catalog.");
//    }
//
//    // Find a book by ISBN
//    public Book findBookByIsbn(String isbn) {
//        for (Book book : books) {
//            if (book.getIsbn().equals(isbn)) {
//                return book;
//            }
//        }
//        return null;
//    }
//
//    // List all books
//    public List<Book> listAllBooks() {
//        return new ArrayList<>(books);
//    }
//
//    // Find books by genre
//    public List<Book> findBooksByGenre(String genre) {
//        return books.stream()
//                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
//                .collect(Collectors.toList());
//    }
//}