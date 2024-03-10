package M1_RecursionHashing.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 6, 4, 5, 8, 32, 4, 1, 54, 2, 3, 5, 4 };
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (Integer ele : arr) {
            hash.put(ele, hash.getOrDefault(ele, 0) + 1);
        }


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number TO Search it's occurrences: ");
        int searchnumber = input.nextInt();

        if(hash.containsKey(searchnumber)){
            System.out.println("Number " + searchnumber + " occurs " + hash.get(searchnumber) + " times.");
        }else{
            System.out.println("Number " + searchnumber + " does not exist in the array.");
        }

        System.out.println(hash);
        
        input.close();
    }
}