package com.springBoot.Learning;

public class LearningApplication {

    public static void main(String[] args) {
        ArrayL arrayL = new ArrayL();
        int[] arr = {1, 2, 3, 4, 5, 7, 18};
        System.out.println("First Largest number in Array" + arrayL.firstLargeNumber(arr));
    }

}
