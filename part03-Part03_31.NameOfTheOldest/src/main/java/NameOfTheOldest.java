
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, nu = 0;
        String name = null;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            
            age = Integer.valueOf(parts[1]);
            
            if (age > nu) {
                nu = age;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
