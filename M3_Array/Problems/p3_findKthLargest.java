package M3_Array.Problems;

import java.util.Collection;
import java.util.Collections;
// import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

import javax.print.attribute.standard.PrintQuality;

public class p3_findKthLargest {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        // Arrays.sort(nums);
        int k = 4;
        int KthLargerNo = Solution.KthlargNo(nums, k);
        System.out.println(KthLargerNo);

    }

    class Solution {

        public static int KthlargNo(int[] nums, int k) {

            // sortarray(nums);   using normal sort brut force

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele: nums){
                pq.offer(ele);
            }
            
            int i = 1;

            while(i<k){
                pq.poll();
                i++;
            }
            return pq.peek();
        }

        // private static void sortarray(int[] nums) {
        //     int low = 0;
        //     int high = nums.length - 1;
        //     qs(nums, low, high);
        // }

        // private static void qs(int[] nums, int low, int high) {
        //     if (low < high) {
        //         int poivot_Point = pp(nums, low, high);
        //         qs(nums, low, poivot_Point - 1);
        //         qs(nums, poivot_Point + 1, high);
        //     }
        // }

        // private static int pp(int[] nums, int low, int high) {
        //     int i = low;
        //     int j = high;
        //     int pNum = nums[low];

        //     while (i < j) {
        //         while (nums[i] <= pNum && i <= high - 1) {
        //             i++;
        //         }
        //         while (nums[j] > pNum && j >= low + 1) {
        //             j--;
        //         }

        //         if (i < j) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        //     int temp = nums[low];
        //     nums[low] = nums[j];
        //     nums[j] = temp;
        //     return j;
        // }

    }
}
