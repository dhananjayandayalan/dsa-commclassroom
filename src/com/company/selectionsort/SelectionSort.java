package com.company.selectionsort;

public class SelectionSort {

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, last);
            swap(arr, last, maxIndex);
        }
    }

    private static int getMax(int[] arr, int last) {
        int max = 0;
        for(int i = 0 ; i <= last ; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
