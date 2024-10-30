
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scan.next());
        int n = 1;
        for (int i = 1; i <= input; i++) {
            n = n*i;
        }
        System.out.println("Factorial: " + n);

    }
}
