package M2_Sorting;

public class bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,5,4};
                //   j       i
        // in bubble sort, grater ele pushes to right and sorting take place in remaining array generating 2nd largenst number and so on. 
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele);
        }
    }
}
