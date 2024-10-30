
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            
            list.add(input);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        System.out.println("");
        int small = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (small > num) {
                small = num;
            }
        }
        System.out.println("Smallest number: " + small);
        int index = 0;
        while (index < list.size()) {
            if (small == list.get(index)) {
                System.out.println("Found at index: " + index);
            }
            index++;
        }  
    }
}
