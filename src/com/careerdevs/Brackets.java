package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Brackets {

    public static int solution(String a){
        if(a.length() % 2 == 1)
            return 0;

        Stack<Character> brackets = new Stack<>();

        for(char c : a.toCharArray()){
            switch(c){
                case '(', '[', '{' -> brackets.push(c);

                case ')' -> {
                    if(brackets.isEmpty() || brackets.pop() != '(')
                        return 0;
                }

                case ']' -> {
                    if(brackets.isEmpty() || brackets.pop() != '[')
                        return 0;
                }

                case '}' -> {
                    if(brackets.isEmpty() || brackets.pop() != '{')
                        return 0;
                }
            }
        }

        return brackets.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("[()()]"));
        System.out.println(solution("[(}()]"));
        System.out.println(solution("[{()}]"));
        System.out.println(solution("]["));
        System.out.println(solution("()[]{}()[]{}"));
        System.out.println(solution("[({})]()"));
    }
}
