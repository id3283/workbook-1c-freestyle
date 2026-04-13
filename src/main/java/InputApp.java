import java.util.Scanner;

public class InputApp {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What do you want to do (1-add, 2= subtract) ?");
        int command = myScanner.nextInt();
        if (command == 1) {
            doAdd(myScanner);
        } else if (command == 2) {
            doSubtract();
        } else {
            System.out.printf("%d -- Invalid command!", command);
        }
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        Scanner myScanner = new Scanner(System.in);

        String responseString = myScanner.nextLine();
        double responseDouble = Double.parseDouble(responseString);
        return responseDouble;
    }

    public static void doAdd(Scanner scannerParam) {
        double num1 = getDouble("Enter 1st number: ");


        System.out.print("Enter 2nd number: ");
        double num2 = scannerParam.nextDouble();
        double sum = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, sum);
    }

    public static void doSubtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double difference = num1 - num2;
        System.out.printf("%f + %f = %f", num1, num2, difference);
    }
}