package com.company;

import java.util.Arrays;

public class QuickSort implements Strategy{

   public int[] sort(int[] numbers){
    return quickSort(numbers,0, numbers.length);
   }
   public int partition(int[] numbers, int i,int j){
       int pivot = numbers[j];
       int a = i;
       int permutation ;
       for (int b=i; b<j ; i++){
           if (numbers[b] < pivot){
               permutation = numbers[a];
               numbers[a] = numbers[b];
               numbers[b] = permutation ;
               a++;
           }
       }
       permutation = numbers[a];
       numbers[a] = numbers[j];
       numbers[j] = permutation;
       return a;
   }
   public int[] quickSort (int[] numbers, int i, int j){
       int a;
       if (i<j){
           a= partition(numbers,i,j);
           quickSort(numbers, i, a-1);
           quickSort(numbers, a+1, j);
       }
       return numbers;
   }
}