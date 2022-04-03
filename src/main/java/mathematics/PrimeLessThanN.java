package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeLessThanN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeLessThanN(n);
    }
    /*
      Sieve of eratosthenes
     */
    private static void primeLessThanN(int n) {
        if (n <= 1)
            return;
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int j = 2; j <= n; j++) {
            if (prime[j])
                System.out.print(j + " ");
        }
    }
}
