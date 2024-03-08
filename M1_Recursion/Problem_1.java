package M1_Recursion;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        // Q. Print Name N times using Recursion
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number, to print that many times your name");
        int num = input.nextInt();
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("");
        
        System.out.println("Print "+name+" "+num+" Times");
        printName(name,num);

        input.close();
    }

    private static void printName(String name, int num) {
        if(num == 0){
            return;
        }
        System.out.println(name);
        printName(name, num-1);
    }
}
