
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where? ");
        int begin = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int end = Integer.valueOf(scanner.nextLine());
        for (int i = begin; i <= end; i++) {
            int list = numbers.get(i);
            System.out.println(list);
        }

    }
}
