package M2_Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,8,3,5,7,3,1,8,4};
        int low = 0;
        int high = arr.length-1;
        qs(arr,low,high);
        for(int ele: arr){
            System.out.print(ele); //5427
        }
    }

    private static void qs(int[] arr, int low, int high) {
        if (low<high) {
            int pivot = PP(arr,low,high);
            // System.out.println(pivot);
            qs(arr, low, pivot-1);
            qs(arr,pivot+1,high);
        }
    }

    private static int PP(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int povr = arr[low];

        while(i<j){
            // 4 2 5 7

            while (arr[i] <= povr && i <= high-1) {
                i++;
            }
            while (arr[j] > povr && j>= low+1) {
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}