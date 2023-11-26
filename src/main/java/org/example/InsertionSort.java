package org.example;


/**
 *
 * Given an array, sort it using insertion sort.
 *
 * Testing
 * Input Format
 * The first line contains 'T' denoting the no. of test cases.
 *
 * Next T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting the array elements.
 *
 * Output Format
 * T lines contain n numbers denoting the sorted array.
 *
 * Sample Input
 * 2
 * 5 4 2 5 3 1
 * 3 11 4 200
 * Expected Output
 * 1 2 3 4 5
 * 4 11 200
 *
 */
public class InsertionSort {
    void main(){
        int arr[] = new int[4];
        arr[0] = 3;
        arr[1] = 11;
        arr[2] = 4;
        arr[3] = 200;
        insertionSort(arr);
        System.out.println();
        System.out.println("====InsertionSort====");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

    void insertionSort (int[] arr) {
        for (int i = 1; i<arr.length; ++i){
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j + 1] = key;
        }
    }
}
