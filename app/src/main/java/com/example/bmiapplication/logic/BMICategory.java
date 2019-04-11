package com.example.bmiapplication.logic;

public class BMICategory {
    public String getCategory(double result) {
        String category;
        if (result < 18.5) {
            category = "underweight";
        } else if (result >= 15 && result <= 16) {
            category = "severely underweight";
        } else if (result > 18.5 && result <= 24.9) {
            category = "normal (healthy weight)";
        } else if (result > 25 && result <= 29.9) {
            category = "overweight";
        } else if (result > 30 && result <= 35) {
            category = "moderately obese";
        } else if (result > 35 && result <= 40) {
            category = "severely obese";
        } else {
            category = "very severely obese";
        }
        return category;
    }


}
