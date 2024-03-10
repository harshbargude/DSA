package M1_RecursionHashing.Re3;

import java.util.Scanner;

public class Parameterised_Way {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = input.nextInt();
        sum(N,0);
        input.close();
    }

    private static void sum(int n, int i) {
        if (n < 1) {
            System.err.println(i);
            return;
        }
        sum(n-1,i+n);
    }
}
