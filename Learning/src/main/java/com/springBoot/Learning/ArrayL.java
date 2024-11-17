package com.springBoot.Learning;

public class ArrayL {

    public int firstLargeNumber(int[] value){
        int largeNumber = 0;
        for(int i = 0; i<value.length; i++){
            largeNumber = value[i];
            if(value[i] > largeNumber){
                largeNumber = value[i];
            }
        }
        return largeNumber;
    }
}
