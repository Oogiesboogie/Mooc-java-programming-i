
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            } // end of if loop

            System.out.print("Pages: ");
            int page = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int pub = Integer.valueOf(scan.nextLine());

            books.add(new Book(title, page, pub));
        } // end of while loop
        System.out.print("What information will be printed? ");
        String input = scan.nextLine();

        for (Book dis : books) {
            if (input.equals("everything")) {
                System.out.println(books);
            } // end of if loop
            if (input.equals("name")) {
                System.out.println(dis.getName());
            }
        } // end of for loop
    }
}
