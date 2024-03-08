package Sorting;

import java.io.File;
import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
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
