package com.bl;

import java.util.Arrays;

public class Frequency {
    static void findFrequencyOfEachElement(int arr[], int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        //Traverse through array elememnts and count frequencies
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            //counting the frequencies
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "occurs" + count + "times");
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        findFrequencyOfEachElement(arr, n);
    }
}
