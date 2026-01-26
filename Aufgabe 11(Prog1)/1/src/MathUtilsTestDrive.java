public class MathUtilsTestDrive {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();

        try {
            System.out.println(m.divide(3, 2));
            System.out.println(m.divide(893, 8));
            System.out.println(m.divide(1, 0));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
