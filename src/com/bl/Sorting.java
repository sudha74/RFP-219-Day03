package com.bl;

public class Sorting {
    static void SortElementsInAscendingOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int temp = 0;
        //Dispaly the elements of original array
        System.out.println("Elements of Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Dispaly the elements of array after sorting
        System.out.println("Elements of array sorted in ascending order : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        SortElementsInAscendingOrder();
    }
}
