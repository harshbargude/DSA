package M1_RecursionHashing.Re2;

import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        // Q3. Print in terms of N to 1

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number:");

        int N = input.nextInt();
        printN_to_1(N);

        input.close();
    }

    private static void printN_to_1(int N) {

        if (N == 0) {
            return;
        }
        System.out.println(N);

        printN_to_1(N - 1);
    }

}
