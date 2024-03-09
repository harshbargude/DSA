package M1_Recursion.Re2;

import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args) {
        // Q4. PRint 1 to N (But not to use i+1)
        // with the Magic of back tracking

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Nummber: ");
        int N = input.nextInt();

        print1_to_N(N);

        input.close();

    }

    private static void print1_to_N(int N) {

        if(N == 0){
            return;
        }

        print1_to_N(N-1);
        System.err.println(N);

    }
    
}
