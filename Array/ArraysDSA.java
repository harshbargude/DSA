package Array;

import java.util.Arrays;

class ArraysDSA{

    public static void main(String[] args) {
        int[] a = {9,9,9,9,9,14,7};


        // Selection Sort

        for(int i=0; i<=a.length-2; i++){
            for(int j=i; j<=a.length-1; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                continue;
            }
        }  
        for(int ele: a){
            System.out.print(ele);
        }

        //////////////////


    }    
    
}