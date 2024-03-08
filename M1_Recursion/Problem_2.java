package M1_Recursion;

import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        // Q2. Print (1-N) Linearly

        Scanner input = new Scanner(System.in);
        System.out.print("Enter No: ");
        int N = input.nextInt();
        int start = 1;
        printToN(N, start);
    }

    private static void printToN(int N, int start) {

        if(start > N){
            return;
        }

        System.out.println(start);
        printToN(N, start+1);

    }
    
}
