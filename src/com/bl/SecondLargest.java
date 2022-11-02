package com.bl;

public class SecondLargest {
    void findSecondLargestElement(){
        int[] arr = {10, 20, 30, 40, 50};
        int temp;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Number is : " + arr[size - 3]);
    }

    public static void main(String[] args) {
        SecondLargest secondLargest=new SecondLargest();
        secondLargest.findSecondLargestElement();
    }
}
