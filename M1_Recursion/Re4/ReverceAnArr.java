package M1_Recursion.Re4;

public class ReverceAnArr {
    static int[] arr = {2,5,4};
                     
    public static void main(String[] args) {
        int l = 0;
        int r = arr.length-1;
        // reverce_arr(l,r);
        reverceM2_arr(l);
        for(int ele: arr){
            System.out.print(ele);
        }
    }
    private static void reverceM2_arr(int l) {
        if(l>=arr.length/2){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[(arr.length)-l-1];
        arr[(arr.length)-l-1] = temp;
        reverceM2_arr(l+1);

    }

    // private static void reverce_arr(int l, int r) {
    //     if(l>=r){
    //         return;
    //     }
    //     int temp = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = temp;
    //     reverce_arr(l+1, r-1);
    // }

}
