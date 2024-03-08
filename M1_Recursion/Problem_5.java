package M1_Recursion;

import java.util.Scanner;

public class Problem_5 {
    // Print from N to 1 (Using Backtracking)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input N:");
        int N = input.nextInt();
        int c = 1;
        NumPrint_N_to_1(N, c);

        input.close();
    }

    private static void NumPrint_N_to_1(int N, int c) {

        if (c > N) {
            return;
        }
        NumPrint_N_to_1(N, c + 1);
        System.out.println(c);

    }
}
