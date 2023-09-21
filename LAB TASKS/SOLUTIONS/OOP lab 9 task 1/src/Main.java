public class Main {
    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            System.out.println("Before division: a = " + a + ", b = " + b);
            res = a / b;
            System.out.println("After division: res = " + res);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException occurred: " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException occurred: " + ex.getMessage());
        }
        return res;
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException: " + ex.getMessage());
        }
    }
}