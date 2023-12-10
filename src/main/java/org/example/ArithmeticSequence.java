package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * An Arithmetic progression (AP) or arithmetic sequence is a sequence of numbers such that the difference between the consecutive terms is constant. For instance, the sequence 5, 7, 9, 11, 13, 15, . . . is an arithmetic progression with a common difference of 2.
 *
 * Given an unsorted array, find if it can be reordered to form an arithmetic sequence.
 *
 * Examples
 * Array: [9, 13, 5, 15, 7, 11]
 * Answer: true
 * Explanation: This can be reordered to [5, 7, 9, 11, 13, 15] or [15, 13, 11, 9, 7, 5] both of which are arithmetic sequences.
 * Array: [1, 1, 1]
 * Answer: true
 * Explanation: This is an arithmetic sequence with a difference 0.
 * Array: [4, 1, 2]
 * Answer: false
 * Explanation: This cannot be reordered to form an arithmetic sequence.
 * Testing
 * Input Format
 * The first line contains 'T' denoting the no. of test cases.
 *
 * Next T lines each contain a number 'n' denoting the number of elements, followed by n space-separated numbers denoting the array elements.
 *
 * Output Format
 * T lines each contain true or false denoting whether the array for that test case can be used to form an arithmetic sequence.
 *
 * Sample Input
 * 3
 * 6 9 13 5 15 7 11
 * 3 1 1 1
 * 3 4 1 2
 * Expected Output
 * true
 * true
 * false
 *
 */

public class ArithmeticSequence {

    public void main(){
//        int[] arr = {9, 13, 5, 15, 7, 11};
        int[] arr = {4, 1, 2};
        System.out.println();
        System.out.println("=====ArithmeticSequence=====");
        System.out.println(isArithmeticSequence(arr));
    }

    boolean isArithmeticSequence (int[] arr) {
        if(arr.length < 2){
            return true;
        }
        Arrays.sort(arr);
        int i;
        int diff = arr[1] - arr[0];
        for(i = 1; i< arr.length-1; i++){
            if(arr[i+1] - arr[i] == diff){

            } else  {
                break;
            }
        }
        if(i==(arr.length -1)){
            return true;
        }
        return false;
    }
}
