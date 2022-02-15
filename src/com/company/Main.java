package com.company;

public class Main {

    public static void main(String[] args) {
	double height = 2;
    double width = 2;

    Calculator shapeCalculator = new Calculator();


    shapeCalculator.setHeightOfShape(4);
    shapeCalculator.setWidthOfShape(4);
        double area = shapeCalculator.calculateArea();

        System.out.println(area);
    }
}
