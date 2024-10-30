
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, nu = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            
            age = Integer.valueOf(parts[1]);
            
            if (age > nu) {
                nu = age;
            }
        }
        System.out.println("Age of the oldest: " + nu);
    }
}
