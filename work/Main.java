import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            new Main().run(scanner);
        }
    }

    private void run(Scanner scanner) {
        System.out.println(scanner.nextLine());
    }

}
