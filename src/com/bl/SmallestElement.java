package com.bl;

public class SmallestElement {
    void printSmallestElement() {
        int[] ar = {12, 96, 474, 2022};
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min)
                min = ar[i];
        }
        System.out.println("Smallest Element in the given array is : " + min);

    }

    public static void main(String[] args) {
        SmallestElement smallestElement = new SmallestElement();
        smallestElement.printSmallestElement();
    }
}
