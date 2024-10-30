
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> no = new ArrayList<>();
        no.add(3);
        no.add(2);
        no.add(6);
        no.add(-1);
        no.add(5);
        no.add(1);
        
        System.out.println("The numbers in the range [0,5]");
        printNumbersInRange(no, 0, 5);
        
        System.out.println("The numbers in the range [3,10]");
        printNumbersInRange(no, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int num : numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }

}
