package M1_Recursion.Re5;

public class RecousionCall_fibonacci {
    public static void main(String[] args) {
        int n = 4;
        int ele = fibonacci(n);
        System.out.println(ele);
    }

    private static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last + slast;
    }
}
