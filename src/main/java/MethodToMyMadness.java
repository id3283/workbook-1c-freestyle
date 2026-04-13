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

        String formatedName = formatName("Ben", "Franklin");
        System.out.println( formatedName );
    }

    public static String formatName(String firstName, String lastName) {
        String result = firstName + " " + lastName;
        return result;
    }

    public static void printGreeting(String name) {
        System.out.println("Hey, " + name);
    }
}
