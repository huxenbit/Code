public class MathUtils {
    public double divide (int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        } else {
            return (double) a / b;
        }
    }
}
