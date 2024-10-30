
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("Give a number: ");
            int dis = Integer.valueOf(scan.next());
            if (dis == 4) {
                break;
            }
        }

    }
}
