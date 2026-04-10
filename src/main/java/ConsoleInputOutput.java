public class ConsoleInputOutput {

    public static void main(String[] args) {

        System.out.print("ABC");
        System.out.println();

        System.out.print("DEF");
        System.out.println();

        System.out.print("GHI");

        double subtotal = 22.87;
        double tax = subtotal * 0.0825;
        double totalDue = subtotal + tax;
//        System.out.println("Total due is: " +  totalDue);

//        String roundedTotalDue = String.format("%.4f", totalDue);
//        System.out.println("Total due is: " + roundedTotalDue);

        System.out.printf("The total %d due is:  %.2f", 4, 42.4222435234);

        String name = "Dave";

        System.out.println("Hi my name is "+ name + ".");

        System.out.printf("Hi my name is %s. Have a nice day.", name);

    }
}
