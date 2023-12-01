package org.example;

/**
 * Consider an array that is divided into two parts and both of the parts are sorted individually. Given the mentioned array and the end index of the first part, merge them to create a sorted array. Update the same array with the merged elements. You can use extra auxiliary space.
 * <p>
 * Expected Time Complexity: O(n) where n denotes the size of the array.
 * <p>
 * Example
 * Array: [1, 3, 5, 7, 9, 11, 0, 4, 6, 8]
 * End Index: 5
 * Array after merging: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11]
 */
public class MergeSortedSubArrays {
    void main() {
        int arr[] = new int[10];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 11;
        arr[6] = 0;
        arr[7] = 4;
        arr[8] = 6;
        arr[9] = 8;

        merge(arr, 5);
        System.out.println();
        System.out.println("====MergeSortedSubArrays====");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ", ");
            i++;
        }
    }

    void merge(int[] arr, int endIndex) {
        if (endIndex < 0 || endIndex >= arr.length - 1) {
            return;
        }

        int n = arr.length;
        int[] aux = new int[n];
        int i = 0;
        int j = endIndex + 1;
        int k = 0;

        while (i <= endIndex && j < n) {
            if (arr[i] < arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }

        while (i <= endIndex) {
            aux[k++] = arr[i++];
        }

        while (j < n) {
            aux[k++] = arr[j++];
        }

        System.arraycopy(aux, 0, arr, 0, n);

    }
}
