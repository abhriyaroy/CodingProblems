package org.example;

public class LargestContiguous {

    void main() {
        int[] arr = {4, -6, 2,5};
        System.out.println();
        System.out.println("====LargestContiguous====");
        System.out.println(largestContiguousSum(arr));
    }

    int largestContiguousSum(int[] arr){
        int maxSoFar = arr[0];
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
