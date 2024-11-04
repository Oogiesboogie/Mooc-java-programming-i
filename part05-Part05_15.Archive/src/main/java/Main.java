
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identity = scanner.nextLine();
            
            if (identity.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive item = new Archive(identity, name);
            
            if (!(items.contains(item))) {
                items.add(item);
            }
            
        } // end of while loop
        System.out.println("==Items==");
        for (Archive archive: items) {
            System.out.println(archive);
        }

    }
}
