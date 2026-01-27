public class MathUtilsTestDrive {
    public static void main(String[] args) {
        try {
            System.out.println(MathUtils.divide(3, 2));
            System.out.println(MathUtils.divide(893, 8));
            System.out.println(MathUtils.divide(1, 0));
        } catch (IllegalArgumentException e) {
            System.err.println("Parameter 'b' should not be zero!");
        }
    }
}
