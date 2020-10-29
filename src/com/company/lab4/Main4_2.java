package com.company.lab4;

public class Main4_2 {
    public static void main(String[] args) {

        String[] expressions = ReadFile.readFromFile("src/com/company/lab4/three_expressions.txt");
 //     String[] expressions = ReadFile.readFromFile("src/com/company/lab4/one_expression.txt");

        for(String expression : expressions){
            System.out.println(expression + " : " + Validator.parenthesesValidator(expression));
        }
    }
}
