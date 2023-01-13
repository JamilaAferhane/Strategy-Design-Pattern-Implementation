package com.company;

import java.util.Arrays;

public class InsertionSort implements Strategy{

    public int[] sort (int[] numbers){
        int k,x;
        for (int i=1 ; i<numbers.length ; i++){
            k = i-1;
            x=numbers[i];
            while(k>=0 && numbers[k]>x){
                numbers[k+1] = numbers[k];
                k = k-1;
            }
            numbers[k+1]=x;

        }
        return numbers;

    }
}
