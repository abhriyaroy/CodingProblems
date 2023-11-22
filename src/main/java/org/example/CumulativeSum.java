package org.example;

import java.util.Arrays;


/**
 * The cumulative sum of an array at index i is defined
 * as the sum of all elements of the array from index 0
 * to index i.
 *
 * Examples
 * Initial Array: [1, 2, 3, 4]
 * Cumulative Sum: [1, 3, 6, 10]
 * Initial Array: [1, 1, 1, 1, 1]
 * Cumulative Sum: [1, 2, 3, 4, 5]
 * Initial Array: [1, 3, 5, 7, 9]
 * Cumulative Sum: [1, 4, 9, 16, 25]
 *
 *
 * Given an array, return its cumulative sum.
 */

public class CumulativeSum {

    public void main() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int[] output = getCumulativeSum(arr);
        System.out.println("====CumulativeSum====");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

    int[] getCumulativeSum(int[] arr) {
        // add your logic here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = arr[i] + count;
            arr[i] = count;
        }
        return arr;
    }
}
