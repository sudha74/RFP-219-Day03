package com.bl;

public class OddPosition {
    static void printElementsInOddPosition() {
        int[] ar = {1, 2, 3, 4, 5};
        System.out.println("Printing the elements in odd position");
        for (int i = 0; i < ar.length; i = i + 2) {
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        printElementsInOddPosition();
    }
}
