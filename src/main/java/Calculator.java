public class Calculator {

    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        int max = madMax(i, j);
        System.out.println(max);
    }

    public static int madMax(int a, int b) {
        int maxValue;

        if (a > b) {
            maxValue = a;
        }
        else {
            maxValue = b;
        }

        return maxValue;
    }
}
