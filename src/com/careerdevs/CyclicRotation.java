package com.careerdevs;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] a, int k){
        int[] aNew = new int[a.length];

        for(int i = 0; i < a.length; i++)
            aNew[(i + k) % a.length] = a[i];

        return aNew;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 3, 4, 1, 2}, 2)));
    }
}
