package com.careerdevs;

import java.util.Queue;
import java.util.Stack;

public class Fish {

    public static int solution(int[] direction, int[] fish){
        int fishLeft = fish.length;

        // Attempt 1
        for(int i = 0; i < direction.length; i++){
            if(direction[i] == 1 && fish[i + 1] != 0){
                if(fish[i] > fish[i + 1])
                    fish[i + 1] = 0;
                else
                    fish[i] = 0;

                fishLeft--;
            }
            else if(i > 0 && fish[i - 1] != 0){
                if(fish[i - 1] < fish[i])
                    fish[i - 1] = 0;
                else
                    fish[i] = 0;

                fishLeft--;
            }
        }

        // Attempt 2 - Stack
//        Stack<Integer> fishies = new Stack<>();
//
//        for(int i = 0; i < fish.length; i++){
//            if(direction[i] == 1)
//                fishies.push(fish[i]);
//            else{
//                int weight;
//                do{
//                    weight = fishies.isEmpty() ? 0 : fishies.pop();
//                } while(weight != 0 && weight < fish[i]);
//
//                if(weight = 0)
//
//            }
//        }

        return fishLeft;
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{0, 1, 0, 0, 0},
                new int[]{4, 3, 2, 1, 5}
        ));
    }
}
