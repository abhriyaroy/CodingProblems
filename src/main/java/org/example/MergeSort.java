package org.example;

/**
 *
 * Given an array, sort it using merge sort.
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

public class MergeSort {

    void main() {
        int[] arr = {-5, 4, 2, 100, 5, 3, 1};

        mergeSort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println("====MergeSort====");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i++;
        }
    }

    void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r) {
        int arraySize1 = m-l+1;
        int arraySize2 = r-m;

        int L[] = new int[arraySize1];
        int R[] = new int[arraySize2];

        for (int i = 0; i < arraySize1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < arraySize2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < arraySize1 && j < arraySize2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<arraySize1){
            arr[k++] = L[i++];
        }

        while(j<arraySize2){
            arr[k++] = R[j++];
        }

    }
}
