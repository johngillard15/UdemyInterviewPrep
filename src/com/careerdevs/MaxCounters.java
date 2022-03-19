package com.careerdevs;

import java.util.Arrays;

public class MaxCounters {

    public static int[] solution(int length, int[] instructions){
        int[] counters = new int[length];

        int max = 0;
        int newMin = 0;
        for(int c : instructions){
            int i = c - 1;

            if(c > length)
                newMin = max;
            else
                counters[i] = Math.max(counters[i], newMin) + 1;

            if(c <= length && counters[i] > max) {
                max = counters[i];
                System.out.println("max " + max);
            }
        }

        for(int count : counters){
            if(count < newMin)
                count = newMin;
        }

        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 6, 1, 4, 4})));
    }
}
