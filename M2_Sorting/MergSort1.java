package M2_Sorting;

import java.util.ArrayList;

public class MergSort1 {
    public static void main(String[] args) {
        // Divide and Merge
        int[] arr = { 3, 2, 7, 4, 5, 8, 1 };
        // int low = 0;
        int high = arr.length - 1;
        solution.sort(arr, 0, high);

        for (int ele : arr) {
            System.out.println(ele);
        }

    }

    class solution {
        private static void sort(int[] arr, int low, int high) {
            if (low >= high) {
                return;
            }
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            mergeSort(arr, low, mid, high);
        }

        private static void mergeSort(int[] arr, int low, int mid, int high) {
            ArrayList<Integer> temp = new ArrayList<>();
            int p = low;
            int q = mid + 1;
            while (p <= mid && q <= high) {
                if (arr[p] <= arr[q]) {
                    temp.add(arr[p]);
                    p++;
                } else {
                    temp.add(arr[q]);
                    q++;
                }
            }
            while (p <= mid) {
                temp.add(arr[p]);
                p++;
            }
            while (q <= high) {
                temp.add(arr[q]);
                q++;
            }

            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }

        }
    }

}
