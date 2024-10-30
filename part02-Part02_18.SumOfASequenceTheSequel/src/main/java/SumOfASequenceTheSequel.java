
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number? ");
        int start = Integer.valueOf(scan.next());
        System.out.println("Last number? ");
        int end = Integer.valueOf(scan.next());
        int sum = 0;
        
        for (int i = start; i <= end; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);

    }
}
