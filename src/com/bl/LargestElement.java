package com.bl;

public class LargestElement {
    void printLargestElement(){
        int[]ar={12,96,474,2022};
        int max=ar[0];
        for (int i=0;i<ar.length;i++){
            if (ar[i]>max)
                max=ar[i];
        }
        System.out.println("Largest Element in the given array is : "+max);
    }

    public static void main(String[] args) {
        LargestElement largestElement=new LargestElement();
        largestElement.printLargestElement();
    }
}
