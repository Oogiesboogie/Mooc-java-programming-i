
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.valueOf(scan.nextLine());
        int sec = Integer.valueOf(scan.nextLine());
        if (first > sec) {
            System.out.println(first + " is greater than " + sec + ".");
        } else if (first < sec) {
            System.out.println(first + " is smaller than " + sec + ".");
        } else {
            System.out.println(first + " is equal to " + sec + ".");
        }

    }
}
