class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative number not allowed!");
    }
}

class MathUtils {
    public static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException();
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class userdefinedexp {
    public static void main(String[] args) {
        try {
            int n = -5;
            int fact = MathUtils.factorial(n);
            System.out.printf("%d! = %d\n", n, fact);
        } catch (NegativeNumberException e) {
            System.err.println(e.getMessage());
            System.err.println("Please enter a non-negative integer.");
            System.exit(1);
        }
    }
}