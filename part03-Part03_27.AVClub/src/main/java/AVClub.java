
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] pieces;
            if (input.equals("")) {
                break;
            }
            
            pieces = input.split(" ");
            
            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
