/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author admin
 */
public class MergeSort {

    public void merge(int[] arr, int low, int mid, int high) {
        int i, j, k;
        // create arr temporary array b and copy arr to b
        int[] b = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        i = low;
        j = mid + 1;
        k = low;
        while (i <= mid && j <= high) {
            if (b[i] > b[j]) {
                arr[k++] = b[j++];
            } else {
                arr[k++] = b[i++];
            }
        }
        while (i <= mid) {
            arr[k++] = b[i++];
        }
        while (j <= high) {
            arr[k++] = b[j++];
        }
    }

    public int[] mergesort(int[] arr, int low, int high) {
        // recursion
        if (low < high) {
            int k = (low + high) / 2;
            mergesort(arr, low, k);
            mergesort(arr, k + 1, high);
            merge(arr, low, k, high);
        }
        return arr;
    }
}
