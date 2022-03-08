package com.careerdevs;

public class Equilibrium {

    public static void solution(int[] nums){
        int sum1 = nums[0], sum2 = 0;
        for(int i = 2; i < nums.length; i++)
            sum2 += nums[i];

        int minDiff = Math.abs(sum1 - sum2);

        for(int eq = 1; eq < nums.length - 1; eq++){
            sum1 += nums[eq - 1];
            sum2 -= nums[eq];

            int thisSum = Math.abs(sum1 - sum2);

            if(thisSum < minDiff)
                minDiff = thisSum;
        }

        System.out.println(minDiff);
    }

    public static void main(String[] args) {
        solution(new int[]{3, 1, 2, 4, 3});
    }
}
