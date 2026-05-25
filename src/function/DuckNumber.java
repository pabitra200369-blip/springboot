package function;

import java.util.Scanner;

public class DuckNumber {
    static boolean isDuck(String n) {
        return n.contains("0") && n.charAt(0) != '0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (isDuck(n))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
