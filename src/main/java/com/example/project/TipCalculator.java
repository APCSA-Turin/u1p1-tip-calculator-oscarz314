package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        // Define

        // Base costs
        double tipPercentage = (percent / 100.0);
        double costTotal = (cost + (cost * tipPercentage));
        double tipTotal = (costTotal - cost);

        // Person costs
        double personBaseCost = (cost / people);
        double personTipCost = (tipTotal / people);
        double personTotalCost = (costTotal / people);

        //I learned Math.round from https://www.w3schools.com/java/ref_math_round.asp
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + ((Math.round(cost * 100)) / 100.0) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + ((Math.round(tipTotal * 100)) / 100.0) + "\n");
        result.append("Total Bill with tip: $" + ((Math.round(costTotal * 100)) / 100.0) + "\n");
        result.append("Per person cost before tip: $" + ((Math.round(personBaseCost * 100)) / 100.0) + "\n");
        result.append("Tip per person: $" + ((Math.round(personTipCost * 100)) / 100.0) + "\n");
        result.append("Total cost per person: $" + ((Math.round(personTotalCost * 100)) / 100.0) + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;        
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
