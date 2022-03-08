package com.careerdevs;

import java.util.HashMap;

public class PermMissingElem {

    public static void solution(int[] nums){
        // Attempt 1 - HashMap
//        HashMap<Integer, Integer> foundNums = new HashMap<>();
//
//        for(int x : nums)
//            foundNums.put(x, 1);
//
//        for(int x = 1; x < nums.length + 1; x++){
//            if(!foundNums.containsKey(x)){
//                System.out.println(x);
//                return;
//            }
//        }

        // Attempt 2 - math
        int sum = 0;
        for(int x : nums)
            sum += x;

        int trueSum = 0;
        for(int i = nums.length + 1; i > 0; i--){
            trueSum += i;
        }

        System.out.println(trueSum - sum);
    }

    public static void main(String[] args) {
        solution(new int[]{2, 3, 1, 5});
    }
}
