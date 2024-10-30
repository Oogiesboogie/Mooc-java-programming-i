import java.util.Scanner;

class Symbol {
    public char symbol;
    public int uses;
    public double frequency;
    public Symbol(char symbol) {
        this.symbol = symbol;
        this.uses = 0;
        this.frequency = 0.0;
    }
}

public class Sandbox {
    public static void updateFrequencies(Symbol[] symbols) {
        int total = 0;

        for (Symbol emoji : symbols) {
            total += emoji.uses;
        }

        for (Symbol emoji : symbols) {
            if (total > 0) {
                emoji.frequency = (double) emoji.uses / total;
            } else {
                emoji.frequency = 0.0;
            }
        }
    }

    public static void sortSymbols(Symbol[] symbols) {
        int num = symbols.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (symbols[j].frequency < symbols[j+1].frequency ||
                        (symbols[j].frequency == symbols[j+1].frequency &&
                                symbols[j].symbol > symbols[j + 1].symbol)) {
                    Symbol temp = symbols[j];
                    symbols[j] = symbols[j + 1];
                    symbols[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Symbol[] symbols = {
                new Symbol('\u221E'),
                new Symbol('\u263A'),
                new Symbol('\u2640'),
                new Symbol('\u2642'),
                new Symbol('\u2660'),
                new Symbol('\u2663'),
                new Symbol('\u2665'),
                new Symbol('\u2666'),
                new Symbol('\u266B')
        };

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Here are all available symbols");
            for (int i = 0; i < symbols.length; i++) {
                System.out.println((i + 1) + " - " + symbols[i].symbol);
            }
                System.out.println("0 - Exit");

            System.out.print("Please select a symbol to print: ");
            int choice = scan.nextInt();
            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= symbols.length) {

                symbols[choice - 1].uses++;
                updateFrequencies(symbols);
                sortSymbols(symbols);

                System.out.println(" ");
                System.out.println("You selected the " + symbols[choice - 1].symbol + " symbol.");
                System.out.println(" ");
                } else {
                System.out.println(" ");
                System.out.println("Invalid option!");
                System.out.println(" ");
            }
        }

        scan.close();
        System.out.println("Shutting off...");
    }
}
