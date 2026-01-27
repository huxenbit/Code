public class MathUtils {
    public static double divide (int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Parameter 'b' should not be zero!");
        } else {
            return (double) a / b;
        }
    }
}
