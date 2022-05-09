public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println();

        String primeNumbers = "";
        System.out.println("Printing prime numbers between 0-1000 ");
        for (int i = 1; i <= 1000;i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}