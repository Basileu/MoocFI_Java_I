
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> myList = new ArrayList<Book>();

        while (true) {
            System.out.println("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int nrPages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int yearPub = Integer.valueOf(scan.nextLine());

            myList.add(new Book(title, nrPages, yearPub));

        }

        System.out.println("What information will be printed? ");
        String response = scan.nextLine();
        if (response.equals("everything")) {
            for (Book book : myList) {
                System.out.println(book);
            }
        } else if (response.equals("name")) {
            for (Book book : myList) {
                System.out.println(book.getTitle());
            }
        }

    }
}
