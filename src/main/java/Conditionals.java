import java.io.PrintStream;

public class Conditionals {

    public static void main(String[] args) {
        int age = 25;

        double price;
        if (age < 18) {
            price = 18;
        } else if (age < 65) {
            price = 25;
        } else {
            price = 18;
        }

        System.out.println("Price of admission: " + price);



    }
}
