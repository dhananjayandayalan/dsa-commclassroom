package com.company.bubblesort;

public class BubbleSort {
    private static void sort(int[] arr) {
        boolean swap = false;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 1 ; j < arr.length - i ; j++) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
