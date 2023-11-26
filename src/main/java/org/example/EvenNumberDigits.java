package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, find the elements which have an even number of digits.
 * <p>
 * Example
 * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
 * Answer: 42, 5775, 34, 45, 3556
 * The order of the returned elements should be the same as the order of the initial array.
 */
public class EvenNumberDigits {
    void main() {
        int[] arr = new int[10];
        arr[0] = 42;
        arr[1] = 5775;
        arr[2] = 34;
        arr[3] = 123;
        arr[4] = 454;
        arr[5] = 1;
        arr[6] = 5;
        arr[7] = 45;
        arr[8] = 3556;
        arr[9] = 23442;

        List<Integer> output = getEvenDigitNumbers(arr);

        System.out.println("====EvenNumberDigits====");
        for(int i =0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
    }

    List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> itemsList = new ArrayList<>();
        for(int i =0; i < arr.length; i++) {
            String item = String.valueOf(arr[i]);
            if(item.length() % 2 == 0){
                itemsList.add(arr[i]);
            }
        }
        return itemsList;
    }
}
