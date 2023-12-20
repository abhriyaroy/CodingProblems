package org.example;

/**
 *
 * In this triangle, the value at a position is equal to the sum of values of the 2 elements just above it.
 *
 * Examples
 * The 2nd element of 5th row is 1+3 => 4
 * The 3rd element of 5th row is 3+3 => 6
 * The 4th element of 5th row is 3+1 => 4
 * For the leftmost and the rightmost position in each row, the value is 1. The element in the first row is also 1.
 *
 * Given a number n, find the nth row of pascal’s triangle.
 *
 * Testing
 * Input Format
 * The first line contains ‘T’ denoting the no. of test cases.
 *
 * Next T lines contains a number 'n' denoting the row number of pascal’s triangle.
 *
 * Output Format
 * For each test case, a line containing ‘n’ space-separated integers denoting the elements in the nth row.
 *
 * Examples
 * Sample Input
 * 3
 * 4
 * 5
 * 6
 * Expected Output
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 *
 */
public class PascalsTriangle {

    void main(){
        System.out.println();
        System.out.println("====PascalsTriangle====");
        int[] output = pascalTriangleRow(30);
        for(int i = 25; i<output.length; i++){
            System.out.print(output[i] + ",");
        }
        System.out.println();
    }

    int[] pascalTriangleRow(int rowNo) {
        int[] row = new int[rowNo + 1];
        row[0] = 1;
        for (int i = 1; i <= rowNo; i++) {
            row[i] = (int)((long)row[i - 1] * (rowNo - i + 1) / i);
        }

        return row;

    }
}
