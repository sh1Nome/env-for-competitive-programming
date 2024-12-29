import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out, false);) {
            new Main().run(scanner, out);
        }
    }

    private void run(Scanner scanner, PrintWriter out) {
        out.println(scanner.nextLine());
    }

}
