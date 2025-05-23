import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LibraryCatalog1 {
  //BOOK
    // isbn
    // title
    //author
    //genre
    //quantity
    //
    //Library Catalog
    // add a book/multiple books
    // Remove a book/multiple books
    // FInd a book bu isbn
    // list all book
    // finds by genre
    // use ArrayList

    private List<Book> books;

    public LibraryCatalog1(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addBooks(List<Book> newBooks){
        books.addAll(newBooks);
        System.out.println(newBooks.size() + " books added to the catalog.");
    }
    public void removeBook(String isbn){
        Book book = findBookByIsbn(isbn);
        if (book != null){
            books.remove(book);
            System.out.println("Book removed: " + book.getTitle());
        }
    }

    public Book findBookByIsbn(String isbn){
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public List<Book> listAllBooks(){
        return new ArrayList<>(books);
    }


//    arraylist
    public List<Book> findBooksByGenre(String genre){
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books){
            if (book.getGenre().equals(genre)){
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }




}
