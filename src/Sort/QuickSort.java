/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author admin
 */
public class QuickSort {
    // Swap function to swap two elements in an array
    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // Partition function to partition the array
    public int partition(int[] arr, int low, int high) {
        int i = low, j = high, pivot;
        pivot = arr[i];
        while (i < j) {
            while (i < high && arr[i] <= pivot) {
                i++;
            }
            while (j > low && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    // Quick sort function
    public int[] quicksort(int[] arr, int low, int high) {
        if (low <= high) {
            int k = partition(arr, low, high);
            // Recursively sort the left and right subarrays
            quicksort(arr, low, k - 1);
            quicksort(arr, k + 1, high);
        }
        return arr;
    }
}
