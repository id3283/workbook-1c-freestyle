import java.util.Scanner;

public class PayRateCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("How many hours did you work (really!!)?");
        double hoursWorked = Double.parseDouble(myScanner.nextLine());

        System.out.println("What's your pay rate (don't lie!)?");

        String s = myScanner.nextLine();
        double payRate = Double.parseDouble(s);

        double totalPay = Math.min(40, hoursWorked) * payRate;

        // Add additional hours at higher rate
        if(hoursWorked > 40) {
            totalPay = totalPay + (hoursWorked -40) * payRate * 1.5;
        }

        System.out.printf("Employee %s, Gross pay: %.2f", name, totalPay);
    }
}
