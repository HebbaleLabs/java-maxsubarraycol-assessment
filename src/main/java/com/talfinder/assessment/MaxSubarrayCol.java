package com.talfinder.assessment;

public class MaxSubarrayCol {

    public static int maxSubarrayCol(int[][] matrix) {
        /*
         * NOTE:
         * 1. Write your solution within this method
         * 2. Do not make changes to the Class Name, Method Name or Method Signature
         * 3. Use the Run-Java command to run main method
         * 4. Use the BuildAndRunTests command to evaluate your solution
         */
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0,  1,  2},
                { 2,  4, -1},
                { 3,  6, -2},
                {-1, -1,  6},
        };
        int rowWithMaxSubArray = maxSubarrayCol(matrix);
        System.out.println("Column with maximum subarray is:" + rowWithMaxSubArray);
    }
}
