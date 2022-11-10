/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Sort.BubbleSort;
import Sort.InsertionSort;
import Sort.MergeSort;
import Sort.QuickSort;
import Sort.SelectionSort;
import java.util.Random;

/**
 *
 * @author admin
 */
public class Main {
    public static String toStringfromArray(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + ", "+arr[i];
            
        }
        return s;
    }

    public static void main(String[] args) {
        //Test Sort Function
        int n = 20;
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(n);
        }
        System.out.println("Start");
        System.out.println("Array : "+toStringfromArray(arr));;
        System.out.println("Bubble Sort : "+toStringfromArray(new BubbleSort().bubble(arr, n))); 
        System.out.println("Merge Sort : "+toStringfromArray(new MergeSort().mergesort(arr, 0,n-1)));
        System.out.println("Quick Sort : "+toStringfromArray(new QuickSort().quicksort(arr, 0,n-1)));
        System.out.println("Selection Sort : "+toStringfromArray(new SelectionSort().selection(arr, n)));
        System.out.println("Insertion Sort : "+toStringfromArray(new InsertionSort().insertion(arr, n)));
        //Finish Test
    }
}
