import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String toString(String key) {
        if(key.equals("everything")){
            return (title + ", " + numberOfPages + " pages, " + publicationYear);
        }
        else{
            return (title);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Enter book details: (Press enter to stop)");
        while(true) {
            System.out.print("Enter title: ");
            String title = reader.nextLine();
            int numberOfPages;
            int yop;
            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("Enter the number of pages: ");
                numberOfPages = Integer.parseInt(reader.nextLine());
                System.out.print("Enter the publication year: ");
                yop = Integer.parseInt(reader.nextLine());
            }
            books.add(new Book(title, numberOfPages, yop));
        }
            System.out.println("Enter key for what information will be printed?");
            String key = reader.nextLine();

            for(Book book: books){
                System.out.println(book.toString(key));
            }
        }
    }

