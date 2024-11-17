package com.springBoot.Learning;

public class ArrayL {

    public int firstLargeNumber(int[] value) {
        int largeNumber = 0;
        for (int i = 0; i < value.length; i++) {
            largeNumber = value[i];
            if (value[i] > largeNumber) {
                largeNumber = value[i];
            }
        }
        return largeNumber;
    }

    public int secondLargestNumber(int[] value) {
        int largest = value[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < value.length; i++) {
            if (value[i] > largest) {
                secondLargest = largest;
                largest = value[i];
            } else if (value[i] < largest && value[i] > secondLargest) {
                secondLargest = value[i];
            }
        }
        return secondLargest;
    }
}
