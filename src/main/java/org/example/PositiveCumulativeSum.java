package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.
 *
 * Examples
 * Initial Array: [1, -2, 3, 4, -6]
 * Cumulative Sum: [1, -1, 2, 6, 0]
 * Initial Array: [1, -1, -1, -1, 1]
 * Cumulative Sum: [1, 0, -1, -2, -1]
 * Initial Array: [1, 3, 5, 7]
 * Cumulative Sum: [1, 4, 9, 16]
 * The positive cumulative sum of an array is a list of only those cumulative sums which are positive.
 *
 */
public class PositiveCumulativeSum {
    public void main(){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = -2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = -6;
        List<Integer> output = getPositiveCumulativeSum(arr);
        System.out.println();
        System.out.println("====PositiveCumulativeSum====");
        output.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    List<Integer> getPositiveCumulativeSum (int[] arr) {
        // add your logic here
        List<Integer> outputArray = new ArrayList();
        int tempCount = 0;
        for(int i = 0; i< arr.length; i++){
            tempCount = tempCount + arr[i];
            if(tempCount > 0){
                outputArray.add(tempCount);
            }
        }
        return outputArray;
    }
}
