package function;

import java.util.Scanner;

public class CountDigits {
    static int count(int n) {
        int c = 0;

        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Digits = " + count(n));
    }
}
