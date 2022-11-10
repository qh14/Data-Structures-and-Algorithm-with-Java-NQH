/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author admin
 */
public class SelectionSort {
    public void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    //O(n^2)

    public int[] selection(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            //min in [i+1,n]
            int min = arr[i + 1], k = i + 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    k = j;
                }
            }
            if (arr[i] > arr[k]) {
                swap(arr, i, k);
            }
        }
        return arr;
    }
}
