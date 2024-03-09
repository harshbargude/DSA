package M2_Sorting;

public class bubble_Sort {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 5, 7, 5, 8, 6 };
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
