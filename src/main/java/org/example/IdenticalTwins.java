package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.
 *
 * Examples
 * Array: [1, 2, 3, 2, 1]
 * Number of Identical Twins: 2
 * Explanation:
 * Identical Twins: [[1, 1], [2, 2]]
 * Indexes: (0, 4), (1, 3)
 * Array: [1, 2, 2, 3, 2, 1]
 * Number of Identical Twins: 4
 * Explanation:
 * Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
 * Indexes: (0, 5), (1, 2), (1, 4), (2, 4)
 * Array: [1, 1, 1, 1]
 * Number of Identical Twins: 6
 * Explanation:
 * Identical Twins: [[1, 1], [1, 1], [1, 1], [1, 1], [1, 1], [1, 1]]
 * Indexes: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)
 * Given an array nums, find the number of identical twins.
 *
 */
public class IdenticalTwins {
    void main(){
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        System.out.println("====IdenticalTwins====");
        System.out.println("the number of identical twins are " + getIdenticalTwinsCount(arr));
    }

    int getIdenticalTwinsCount (int[] arr) {
        HashMap<Integer, ArrayList<Integer>> identicalValues = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(identicalValues.containsKey(arr[i])){
                identicalValues.get(arr[i]).add(i);
            } else {
                identicalValues.put(arr[i], new ArrayList<>(i));
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            if(identicalValues.containsKey(value)){
                ArrayList<Integer> indices = identicalValues.get(value);
                for (int j = 0; j < indices.size(); j++){
                    if(i < indices.get(j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
