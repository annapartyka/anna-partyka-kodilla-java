package com.kodilla.steam;

import com.kodilla.steam.beatifier.PoemBeautifier;
import com.kodilla.steam.iterate.NumbersGenerator;
import com.kodilla.steam.lambda.ExpressionExecutor;
import com.kodilla.steam.reference.FunctionalCalculator;


public class SteamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b)-> a + b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a - b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a * b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC ", " " , "ABC");


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}