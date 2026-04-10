import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) throws InterruptedException {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter an integer. ");

        // Using type-specific scanner method
        int i = myScanner.nextInt();
        System.out.println("here's the number plus one: " + (i + 1) );

        System.out.print("Enter an integer. ");

        // Using my conversion (parsing) trick
            // Read the next line as a string
        String userInput = myScanner.nextLine();
            // Convert the string into whatever we need
        i = Integer.parseInt(userInput);

        // Could be one line: i = Integer.parseInt(myScanner.nextLine());

        System.out.println("here's the number plus one: " + (i + 1));
    }
}
