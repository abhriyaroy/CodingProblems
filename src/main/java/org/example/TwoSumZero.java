package org.example;


import java.util.HashSet;

/**
 *
 * Given a sorted array, check if there exist two numbers whose sum is zero.
 *
 * Example
 * A: [-3, 1, 3, 4]
 * Answer: true
 * A: [-2, 1, 3, 4]
 * Answer: false
 * Testing
 * Input Format
 * The first line contains an integer ‘T’ denoting the number of test cases.
 *
 * For each test case, the input has two lines:
 *
 * An integer ’n’ denoting the length of the array.
 * n space-separated integers denoting the elements of the array.
 * Output Format
 * For each test case, the output has true or false denoting the answer.
 *
 * Sample Input
 * 2
 * 4
 * -3 1 3 4
 * 4
 * -2 1 3 4
 * Expected Output
 * true
 * false
 *
 */
public class TwoSumZero {

    void main(){
        int[] arr = {-3, 1, 3, 4};
        System.out.println();
        System.out.println("====TwoSumZero====");
        System.out.println(hasTwoSumZero(arr));
    }


    boolean hasTwoSumZero (int[] A) {
        HashSet<Integer> hashset = new HashSet();
        boolean isAvailable = false;
        for(int i = 0; i< A.length; i++){
            int num = 0 - A[i];
            if(hashset.contains(num)){
                isAvailable = true;
                break;
            } else {
                hashset.add(A[i]);
            }
        }
        return isAvailable;
    }
}
