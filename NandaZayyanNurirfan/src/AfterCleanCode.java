public class AfterCleanCode {

    // Menghitung faktorial dari sebuah angka
    public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Angka harus tidak negatif");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        try {
            int factorial = calculateFactorial(number);
            System.out.println("Faktorial dari " + number + " adalah " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
