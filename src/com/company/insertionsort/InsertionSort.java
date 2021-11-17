package com.company.insertionsort;

public class InsertionSort {
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1 ; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
