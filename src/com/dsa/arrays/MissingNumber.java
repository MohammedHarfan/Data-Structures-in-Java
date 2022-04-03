package com.dsa.arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 5};

        //Calling missingNumber method
        int result = missingNumber(arr, n);

        //Printing the result
        System.out.println("Missing Number is : " + result); //Output- 4
    }

    static int missingNumber(int[] array, int n) {
        Arrays.sort(array);
        for(int i = 0; i < n - 1; i++) {
            if(array[i] != i + 1)
                return i+1;
        }
        return n;
    }
}
