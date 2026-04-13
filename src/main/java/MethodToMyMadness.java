/**
 * This class demonstrates the basics of static methods:
 *  - input: parameters
 *  - output: return values
 *
 */
public class MethodToMyMadness {

    public static void main(String[] args) {

        String kat = "Kat";
        String zo = "Zo";

        printGreeting("Ahmad");
        printGreeting(zo);
    }

    public static void printGreeting(String name) {
        System.out.println("Hey, " + name);
    }
}
