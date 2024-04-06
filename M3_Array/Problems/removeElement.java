package M3_Array.Problems;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int num = removeElement1(nums, 3);
        System.out.println(num);
    }

    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        int count = 0;
        for (int ele = 0; ele < nums.length; ele++) {
            if (nums[ele] == val) {
                continue;

            }
            nums[i] = nums[ele];
            i++;
            count++;
        }
        return count;
    }

}
