package com.company.lab4;

import java.util.*;
import java.lang.String;

public class Validator {
    public static Boolean parenthesesValidator(String expression) {

        Stack<String> stackOfParentheses = new Stack<>();

        for (char c : expression.toCharArray()){
            if (c == '(') {
                stackOfParentheses.push("(");
            }
            if (c == ')'){
                try {
                    stackOfParentheses.pop();
                } catch (Exception e){
                    System.out.println("Enclosing  parentheses has nothing to close");
                    return false;
                }
            }
        }

        return stackOfParentheses.isEmpty();
    }
}
