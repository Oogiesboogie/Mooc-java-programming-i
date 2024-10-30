
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.valueOf(scan.nextLine());
        for (int i = start; i <= 100; i++){
            System.out.println(i);
        }
    }
}
