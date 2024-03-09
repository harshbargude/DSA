package M1_Recursion.Re4;

public class Palandrome_recur {
    static String str = "MADSM";

    public static void main(String[] args) {
        int i = 0;
        // System.err.println(str.charAt(0));
        if (Paland(i)) {
            System.out.println("It is Palandrome");
        } else {
            System.out.println("It's not Palandrome");
        }
    }

    private static boolean Paland(int l) {
        if(l > str.length()/2){
            return true;
        }else if(str.charAt(l) != str.charAt(str.length()-l-1)){
            return false;
        }
        return Paland(l+1);
    }
}




