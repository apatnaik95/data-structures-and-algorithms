package mathematics;

import java.util.Scanner;

public class ComputingPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(calculatePower(number, power));
        System.out.println(calculatePowerIterative(number, power));
    }

    private static int calculatePowerIterative(int number, int power) {
        int result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result = result * number;
            }
            number *= number;
            power /= 2;
        }
        return result;
    }

    private static int calculatePower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        int temp = calculatePower(number, power/2);
        temp = temp * temp;
        if (power % 2 == 0) {
            return temp;
        } else {
            return temp * number;
        }
    }
}
