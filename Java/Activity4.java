package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {

        int[] numArr = {9, 5, 1, 4, 3};
        System.out.println("original Array in Ascending Order: " + Arrays.toString(numArr));
        ascendingSort(numArr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(numArr));

    }

    static void ascendingSort(int array[]) {
        int size = array.length, i;
        for (i = 1; i < size; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = temp;
        }
    }
}