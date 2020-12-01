package com.epam.jwd.strategy;

import com.epam.jwd.model.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum SquareCalculator implements AreaCalculator, PerimeterCalculator {
    INSTANCE;

    @Override
    public double calculatePerimeter(List<Point> points) {
        List<Double> sides = calculateAllSides(
                points.get(0), points.get(1),
                points.get(2), points.get(3));
        return sides.get(0) * 4;
    }

    @Override
    public double calculateArea(List<Point> points) {
        List<Double> sides = calculateAllSides(
                points.get(0), points.get(1),
                points.get(2), points.get(3));
        return sides.get(0) * sides.get(0);
    }

    private static double calculateSide(Point point1, Point point2) {
        return Math.hypot(
                point1.getX() - point2.getX(),
                point1.getY() - point2.getY());
    }

    private static List<Double> calculateAllSides(Point point1, Point point2,
                                                  Point point3, Point point4) {
        double side1 = calculateSide(point1, point2);
        double side2 = calculateSide(point2, point3);
        double side3 = calculateSide(point3, point4);
        double side4 = calculateSide(point1, point4);
        double side5 = calculateSide(point2, point4);
        double side6 = calculateSide(point1, point3);

        List<Double> sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
        sides.add(side5);
        sides.add(side6);
        Collections.sort(sides);
        return sides;
    }


}