package M3_Array.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class p2_allDubNo {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> Dn = solution.findDuplicates(nums);
        System.out.println(Dn);
    }

    class solution {

        public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> D_Nums = new ArrayList<Integer>();
            HashMap<Integer,Integer> hash = new HashMap<>();
            for(int ele =0 ; ele<nums.length; ele++){
                hash.put(nums[ele],hash.getOrDefault(nums[ele], 0)+1);

            }
            for(int num: hash.keySet()){
                if(hash.get(num)>1){
                    D_Nums.add(num);
                }
            }
            return D_Nums;
        }
        
    }
}
