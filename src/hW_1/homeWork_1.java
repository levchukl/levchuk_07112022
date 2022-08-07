package hW_1;

import java.util.Scanner;


public class homeWork_1 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        System.out.println(sum(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(division(a, b));
    }

}