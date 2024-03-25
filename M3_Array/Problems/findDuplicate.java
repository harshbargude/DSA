package M3_Array.Problems;

import java.util.HashMap;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int duplicate = findDuplicate1(arr);
        System.out.println(duplicate);
    }

    private static int findDuplicate1(int[] arr) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            result.put(arr[i], result.getOrDefault(arr[i], 0)+1);
        }
        
        for(int ele: result.keySet()){
            if(result.get(ele) > 1){
                return ele;
            }
        }
        // boolean[] taken = new boolean[arr.length];
        // for(int ele: arr){
        //     if(taken[ele]){
        //         return ele;
        //     }
        //     taken[ele]=true;
        // }
        return -1;
    }
}
