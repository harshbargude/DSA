import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class pythag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit = input.nextInt();

        HashMap<Integer,Double> hypots = new HashMap<>();
        for (int i = 1; i <= limit; i++) {
            int num = i;
            double squ = num * num;
            hypots.put(i,squ);
        }
        System.err.println(hypots);
        int p = 0;
        int q = p + 1;
        for (p = 2; p < limit; p++) {
            for (q = p + 1; q <= limit; q++){
                double search = Math.sqrt((q*q)+(p*p));
                if (hypots.containsValue(search)) {
                    System.err.println(p + " " + q + " " + hypots.get(search));
                }
            }
                
        }
    }
}
