class DivisionbyZeroException extends Exception
{
    public DivisionbyZeroException(String message) {
        super(message);
    }
}
class Main {
    static int computeDivision(int a, int b) throws DivisionbyZeroException {
        int res = 0;
        try {
            res = a / b;
            System.out.println("Division operation completed successfully.");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        return res;
    }

    public static void main(String[] args) {
        // Task 1: Handling ArithmeticException
        int a = 10;
        int b = 0;
        try {
            int result = computeDivision(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionbyZeroException ex) {
            System.out.println("DivisionbyZeroException: " + ex.getMessage());
        }

        // Task 2: Handling IndexOutOfBoundsException
        int[] numbers = { 1, 2, 3 };
        int index = 5;
        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException: " + ex.getMessage());
        }
    }
}