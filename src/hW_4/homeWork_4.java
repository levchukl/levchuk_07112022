package hW_4;

import java.util.Arrays;

public class homeWork_4 {
    public static int factorial(int number) {
        int res = 1;
        for (int i = 1; 1 <= number; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        double result = (2.0 * factorial(5) + 3 * factorial(8)) / (factorial(6) + factorial(4));
        System.out.println(result);
    }
}