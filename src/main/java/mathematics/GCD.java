package mathematics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateGCDBasicApproach(a, b));
        System.out.println(calculateGCD(a, b));
        System.out.println(calculateGCDOptimal(a, b));
    }

    static int calculateGCDBasicApproach(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    /*
      Euclidean algo
     */
    static int calculateGCD(int a, int b) {
        while (a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static int calculateGCDOptimal(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCDOptimal(b, a%b);
    }
}
