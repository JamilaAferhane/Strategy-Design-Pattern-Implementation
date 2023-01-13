package com.company;

import java.util.Arrays;
import java.util.List;

public class BubbleSort implements Strategy{
    public int[] sort (int[] numbers){
        int j = numbers.length - 1;
        int s ;
        boolean  sort = true;
        while (sort && j>0) {
            sort = false;
            for ( int k = 0; k<j; k++){
                if (numbers[k]>numbers[k+1]){
                    s= numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = s;
                    sort = true;
                }
            }
            j = j-1;
        }
        return numbers;
    }
}
