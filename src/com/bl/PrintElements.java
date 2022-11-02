package com.bl;

public class PrintElements {
    int printElementsInArray() {
        int[] array = {1, 2, 3, 4};
        System.out.println("Printing  the elements of an array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        return 0;
    }

    public static void main(String[] args) {
        PrintElements printElements = new PrintElements();
        printElements.printElementsInArray();
    }
}
