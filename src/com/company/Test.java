package com.company;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        int[] array = {234567891,2,788,0,5};
        Context ctx = new Context (new BubbleSort());
        ctx.arrange(array);
        System.out.println(Arrays.toString(array));

        ctx = new Context (new InsertionSort());
        ctx.arrange(array);

        ctx = new Context (new MergeSort());
        ctx.arrange(array);
        System.out.println(Arrays.toString(array));

    }
}
