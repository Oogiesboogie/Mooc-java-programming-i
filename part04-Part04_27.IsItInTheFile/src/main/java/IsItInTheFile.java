
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        int lines = 0;
        try (Scanner lineReader = new Scanner(Paths.get(file))) {
            while (lineReader.hasNextLine()) {
                String line = lineReader.nextLine();
                if (!line.equals(searchedFor)) {
                    continue;
                } // end of if
                lines++;
            } // end of while
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        } // end of try catch
        if (lines == 1) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        } // end of if else
    } // end of main
} // end of class
