package com.springBoot.Learning;

public class ArrayL {

    public int firstLargeNumber(int[] value) {
        int largeNumber = Integer.MIN_VALUE;
        for (int j : value) {
            if (j > largeNumber) {
                largeNumber = j;
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

    public int smallestElement(int [] value){
        int smallest = value[0];
        for (int i : value){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public int secondSmallestNumber(int [] value){
        int secondSmallestNumber = Integer.MAX_VALUE;
        int smallestNumber = value[0];
        for(int i: value){
            if (i < smallestNumber){
                secondSmallestNumber = smallestNumber;
                smallestNumber = i;
            }
            else if(i > smallestNumber && i < secondSmallestNumber){
                secondSmallestNumber = i;
            }
        }
        return secondSmallestNumber;
    }
}
