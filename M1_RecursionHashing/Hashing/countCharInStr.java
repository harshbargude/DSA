package M1_RecursionHashing.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class countCharInStr {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 3, 6, 4, 5, 8, 32, 4, 1, 54, 2, 3, 5, 4 };
        String strArr = "abcdefgmmvkznbcvsgbzjsdchgacwctrdcasdic";
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < strArr.length(); i++) {
            char ele = strArr.charAt(i);
            hash.put(ele, hash.getOrDefault(ele, 0) + 1);
        }

        Scanner input = new Scanner(System.in);
        // System.out.print("Enter Number TO Search it's occurrences: ");
        System.out.print("Enter Character TO Search it's occurrences: ");
        String searchnumber = input.nextLine();
        char[] cA = searchnumber.toCharArray();
        char SC = cA[0];

        if (hash.containsKey(SC)) {
            System.out.println("Character " + SC + " occurs " + hash.get(SC) + " times.");
        } else {
            System.out.println("Character " + SC + " does not exist in the array.");
        }
        
        System.out.println(hash);

        input.close();
    }
}
