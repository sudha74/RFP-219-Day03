package com.bl;

public class ReverseOrder {
    static void printElementsInReverseOrder() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("Print Original Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Original Array Printed into Reverse Order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printElementsInReverseOrder();
    }
}
