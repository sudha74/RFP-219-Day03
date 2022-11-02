package com.bl;

public class EvenPosition {
    int printElementsInEvenPosition() {
        System.out.println("Printing the elements at even position : ");
        int[] ar= {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 1; i < ar.length; i = i + 2){
            System.out.println(ar[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        EvenPosition evenPosition = new EvenPosition();
        evenPosition.printElementsInEvenPosition();
    }
}
