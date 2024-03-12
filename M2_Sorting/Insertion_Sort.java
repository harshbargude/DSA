package M2_Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
// in insertion sort, insert the element and sort that sub array
        int[] arr = {4,7,3,6,1};
        for (int i = 0; i <= arr.length - 2; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
