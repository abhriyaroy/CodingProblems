package org.example;

/**
 *
 * Given two sorted arrays A and B, find the merged sorted array C by merging A and B.
 *
 * Example:
 * A: [1, 2, 3, 4, 4]
 * B: [2, 4, 5, 5]
 * C: [1, 2, 2, 3, 4, 4, 4, 5, 5]
 * Testing
 * Input Format
 * First-line contains an integer ‘T’ denoting the number of test cases.
 *
 * For each test case the input has three lines:
 *
 * Two space-separated integers ‘n’ and ‘m’ denoting the length of the array A and B respectively.
 * n space-separated integers denoting the elements of the array A.
 * m space-separated integers denoting the elements of the array B.
 * Output Format
 * For each test-case, the output has a line with n+m space separated integers denoting the elements of the array C.
 *
 * Sample Input
 * 2
 * 5 2
 * 1 3 3 4 4
 * 5 6
 * 6 2
 * 1 3 3 3 3 4
 * 9 11
 * Expected Output
 * 1 3 3 4 4 5 6
 * 1 3 3 3 3 4 9 11
 *
 */

public class MergeTwoSortedArrays {

    void main() {
        int[] A = new int[5];
        int[] B = new int[2];
        A[0] = 1;
        A[1] = 3;
        A[2] = 3;
        A[3] = 4;
        A[4] = 4;

        B[0] = 5;
        B[1] = 6;

        int[] result = mergeSortedArrays(A, B);
        System.out.println();
        System.out.println("====MergeTwoSortedArrays====");
        int i =0;
        while(i<result.length){
            System.out.print(result[i] + ", ");
            i++;
        }
    }

    int[] mergeSortedArrays(int[] A, int[] B) {
        int pointerA = 0;
        int pointerB = 0;
        int[] mergedArray = new int[A.length + B.length];
        int pointerC = 0;
        while(pointerA < A.length && pointerB < B.length){
            if(A[pointerA] > B[pointerB]){
                mergedArray[pointerC++] = B[pointerB++];
            } else {
                mergedArray[pointerC++] = A[pointerA++];
            }
        }
        while(pointerA < A.length){
            mergedArray[pointerC++] = A[pointerA++];
        }
        while(pointerB < B.length){
            mergedArray[pointerC++] = B[pointerB++];
        }
        return mergedArray;
    }
}
