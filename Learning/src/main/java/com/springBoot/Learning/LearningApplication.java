package com.springBoot.Learning;

public class LearningApplication {

    public static void main(String[] args) {
        ArrayL arrayL = new ArrayL();
        int[] arr = {1, -2, 3, 4, 5, 7, 9, 18};
        System.out.println("First Largest number in Array = " + arrayL.firstLargeNumber(arr));
        System.out.println("Second Largest number in Array = " + arrayL.secondLargestNumber(arr));
        System.out.println("First Smallest number in Array = " + arrayL.smallestElement(arr));
        System.out.println("Second Smallest number in Array = " + arrayL.secondSmallestNumber(arr));
    }

}
