import java.util.Scanner;

public class primeNumUnder100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 100;

        for (int i = 2; i < num ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");

            }
        }
    }

}
