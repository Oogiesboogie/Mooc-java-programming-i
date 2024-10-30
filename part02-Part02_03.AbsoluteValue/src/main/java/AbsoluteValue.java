
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = Integer.valueOf(scanner.nextLine());
        if (user < 0) {
            System.out.println(user * -1);
        } else {
            System.out.println(user);
        }

    }
}
