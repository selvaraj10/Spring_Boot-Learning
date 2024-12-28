package com.springBoot.Learning;

public class PatternPrinting {
    public void bigPattern(){
        int n = 4;
        for(int i = 1; i <= 4;i++){
            for (int j = 1; j<= i; j++){
                System.out.print(j);
            }
            for (int j = 1; j<=2*(n-1); j++){
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            n= n-1;
            System.out.println();
        }
    }
}
