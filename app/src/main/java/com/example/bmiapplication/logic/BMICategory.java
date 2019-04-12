package com.example.bmiapplication.logic;

public class BMICategory {
    public String getCategory(double result) {
        String category;
        if (result < 18.5) {
            category = "underweight";
            return category;
        } else if (result >= 15 && result <= 16) {
            category = "severely underweight";
            return category;
        } else if (result > 18.5 && result <= 24.9) {
            category = "normal (healthy weight)";
            return category;
        } else if (result > 25 && result <= 29.9) {
            category = "overweight";
            return category;
        } else if (result > 30 && result <= 35) {
            category = "moderately obese";
            return category;
        } else if (result > 35 && result <= 40) {
            category = "severely obese";
            return category;
        } else {
            category = "very severely obese";
            return category;
        }
    }


}
