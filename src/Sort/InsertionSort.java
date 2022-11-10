/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author admin
 */
public class InsertionSort {
    // O(n^2)

    public int[] insertion(int[] arr, int n) {
        int i, j, x;
        for (i = 1; i < n; i++) {
            x = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > x) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = x;
        }
        return arr;
    }
}
