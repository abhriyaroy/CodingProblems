package org.example;

/**
 * Given an array A, find the maximum number of consecutive 1s in the array.
 * <p>
 * Examples
 * A: [1, 1, 3, 2, 3, 1, 1, 1]
 * Max consecutive 1s: 3
 * <p>
 * Testing
 * Input Format
 * First line contains an integer ‘T’ denoting the number of test cases.
 * <p>
 * For each test case, the input has two lines:
 * <p>
 * An integer ‘n’ denoting the size of the array.
 * n space-separated integers denoting the elements of the array.
 * Output Format
 * For each test case, the output has a line with an integer denoting the maximum continuous 1s in the array A.
 * <p>
 * Sample Input
 * 3
 * 5
 * 1 1 1 2 2
 * 6
 * 1 2 1 1 1 2
 * 8
 * 1 1 3 2 3 1 1 1
 * Expected Output
 * 3
 * 3
 * 3
 */

public class MaxConsecutiveOnes {

    public void main() {
        int[] arr = {1, 1, 3, 2, 3, 1, 1, 1};

        System.out.println();
        System.out.println("====MaxConsecutiveones====");
        System.out.println(getMaxConsecutiveOnes(arr));
    }

    int getMaxConsecutiveOnes(int[] A) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 1){
                count++;
            } else  {
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

}
