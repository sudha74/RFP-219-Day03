package com.bl;

public class DuplicateElements {
    int printDuplicateElementsOfArray() {
        int[] ar1 = {9, 4, 9, 0, 3, 3, 1, 2, 6, 5};
        System.out.println("Duplicate Elements are : ");
        for (int i = 0; i < ar1.length; i++) {
            for (int j = i + 1; j < ar1.length; j++) {
                if (ar1[i] == ar1[j]) {
                    System.out.println(ar1[j]);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        DuplicateElements duplicateElements = new DuplicateElements();
        duplicateElements.printDuplicateElementsOfArray();
    }
}
