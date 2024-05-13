package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] dataToSort = {9, 5, 1, 4, 3};
        insertionSort(dataToSort);
        System.out.println("Sorted Data is ::::"+ Arrays.toString(dataToSort));

    }

    static void insertionSort(int[] array){
        int size = array.length;

        for(int i = 0; i<size; i++){
            int key = array[i];
            int j = i-1;

            while(j>=0 && key<array[j]){
                array[j+1] = array[j];
                --j;
            }
            array[j+1] = key;
        }
    }
}
