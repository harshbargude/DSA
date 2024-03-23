public class revArr {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,7};
        int p = 0;
        int q = arr.length-1;
        System.out.println("before reverse");
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        reverceArr(p,q,arr);
        System.out.println("after reverse");
        for (int ele: arr){
            System.out.print(ele+" ");
        }
     }

    private static void reverceArr(int p, int q,int[] arr) {
        if(p>=q){
            return;
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        p+=1;
        q-=1;
        reverceArr(p, q, arr);
    }

}
