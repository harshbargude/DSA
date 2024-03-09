package M1_Recursion.Re1;

public class Recur_1 {

    private static void print1to5(int a) {
        if (a == 6) {
            return;
        }
        System.out.print(a);
        a++;
        print1to5(a);

    }

    public static void main(String[] args) {
        int a = 1;
        print1to5(a);
    }
}
