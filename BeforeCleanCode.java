public class BeforeCleanCode {
    public static void main(String[] args) {
        int number = 5;
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Faktorial dari " + number + " adalah " + result);
    }
}
