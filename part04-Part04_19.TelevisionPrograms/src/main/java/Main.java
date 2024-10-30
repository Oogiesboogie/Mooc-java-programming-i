import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            } // end of if loop
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        } // end of while loop
        
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int input = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram show : programs) {
            if (show.getDuration() <= input) {
                System.out.println(show);
            } // end of if loop
        } // end of for loop

    }
}
