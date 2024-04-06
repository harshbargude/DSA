package M3_Array.Problems;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int num = removeElement1(nums, 3);
    }

    public static int removeElement1(int[] nums, int val) {
        int[] temp = { nums.length };
        int i =0;
        for (int ele : nums) {
            System.out.println(temp[i]);
            i++;
            if (ele == val) {
                ele++;
            }
        }
        return 3;
    }

}
