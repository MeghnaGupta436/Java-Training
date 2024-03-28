package Feb14;
import java.lang.reflect.Array;
import java.util.*;
public class Book {
    private String title;
    private String author;
    private String ISBN;
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
            return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void addBook(ArrayList<Book> bookCollection) {
        bookCollection.add(new Book(getTitle(),getAuthor(),getISBN()));
    }
    public void removeBook() {
    }
    public void showDetails(){
        System.out.println("book title : "+getTitle());

        System.out.println("book author : "+getAuthor());
        System.out.println("book ISBN : "+getISBN());
    }
}
class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<Book>();

        System.out.println("Enter book title");
        String t=sc.next();
        System.out.println("Enter book author");
        String a=sc.next();
        System.out.println("Enter book ISBN\n");
        String isbn=sc.next();
        if(isbn.length()==12) {
            Book obj = new Book(t, a, isbn);
            obj.addBook(bookCollection);
            System.out.println("Book details: ");
            obj.showDetails();
        }
        else
            System.out.println("Please enter a valid ISBN");
    }
}
