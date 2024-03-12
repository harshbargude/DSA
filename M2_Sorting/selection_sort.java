package M2_Sorting;

public class selection_sort {
    public static void main(String[] args) {

        int a[] = { 6, 3, 5, 1, 8, 7, 9 };
        // Selection Sort, in this sorting method select the shortest element and put it in orderwise(increasingly)

        for (int i = 0; i <= a.length - 2; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                continue;
            }
        }
        for (int ele : a) {
            System.out.print(ele);
        }
    }

}
