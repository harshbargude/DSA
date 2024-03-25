package M2_Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1};
        int low = 0;
        int high = arr.length-1;
        qs(arr,low,high);
    }

    private static void qs(int[] arr, int low, int high) {
        if (low<high) {
            int pivot = PP(arr,low,high);
            System.out.println(pivot);
        }
    }

    private static int PP(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int povr = arr[low];

        while(i<j){
            while (arr[i] <= povr && i <= high) {
                i++;
            }
            while (arr[j] > povr && j>= low) {
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return j;
    }
}