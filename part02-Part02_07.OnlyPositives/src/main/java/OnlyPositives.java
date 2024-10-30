
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number: ");
            int dis = Integer.valueOf(scan.nextLine());
            int num = dis * dis;
            
            if (dis < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            if (dis == 0) {
                break;
            }
            
            System.out.println(num);
            
            
        }

    }
}
