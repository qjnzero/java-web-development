package com.epam.jwd.strategy;

import com.epam.jwd.model.pentagon.Pentagon;
import com.epam.jwd.model.Point;

public enum PentagonStrategy implements AreaCalculator<Pentagon>, PerimeterCalculator<Pentagon> {
    INSTANCE;

    @Override
    public double calculatePerimeter(Pentagon figure) {
        return 0;
    }

    @Override
    public double calculateArea(Pentagon figure) {
        return 0;
    }

    private static double calculateSide(Point point1, Point point2) {
        return Math.hypot(
                point1.getX() - point2.getX(),
                point1.getY() - point2.getY());
    }
}
