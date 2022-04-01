package mathematics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateLCM(a, b));
    }

    static int calculateLCM(int a, int b) {
        return (a * b)/GCD.calculateGCD(a, b);
    }
}
