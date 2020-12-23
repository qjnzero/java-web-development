package com.epam.jwd.task.calculations.impl;

import com.epam.jwd.task.view.Point;
import com.epam.jwd.task.view.factories.impl.triangle.Triangle;
import com.epam.jwd.task.calculations.AreaCalculator;
import com.epam.jwd.task.calculations.PerimeterCalculator;

public enum TriangleCalculator implements AreaCalculator<Triangle>, PerimeterCalculator<Triangle> {
    INSTANCE;

    @Override
    public double calculatePerimeter(Triangle triangle) {
        double side1 = calculateSide(triangle.getPoint(0), triangle.getPoint(1));
        double side2 = calculateSide(triangle.getPoint(1), triangle.getPoint(2));
        double side3 = calculateSide(triangle.getPoint(0), triangle.getPoint(2));

        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea(Triangle triangle) {
        double side1 = calculateSide(triangle.getPoint(0), triangle.getPoint(1));
        double side2 = calculateSide(triangle.getPoint(1), triangle.getPoint(2));
        double side3 = calculateSide(triangle.getPoint(0), triangle.getPoint(2));

        double p = (side1 + side2 + side3) / 2;
        return  Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    private static double calculateSide(Point point1, Point point2) {
        return Math.hypot(
                point1.getX() - point2.getX(),
                point1.getY() - point2.getY());
    }
}
