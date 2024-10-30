
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
        Scanner scan = new Scanner(System.in);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int num = beginning; num <= end; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }

}
