package M1_Recursion.Re3;

import java.util.Scanner;

public class Parameterised_Way {
    public static void main(String[] args) {

// Sum of N Numbers...

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of N: ");
        int N = input.nextInt();

        System.out.println(SumofN_Number(N));
        // SumofN_Number(N,0);
        input.close();
    }

    private static int SumofN_Number(int n) {

        if (n == 0) {
            return 0;
        }
        return n + SumofN_Number(n-1);
        
    }
}
