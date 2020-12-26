package com.epam.jwd.task.calculation.impl;

import com.epam.jwd.task.model.factory.impl.square.Square;
import com.epam.jwd.task.calculation.AreaCalculator;
import com.epam.jwd.task.calculation.PerimeterCalculator;
import com.epam.jwd.task.service.SquareService;

import java.util.List;

public final class SquareCalculatorSingleton implements AreaCalculator<Square>, PerimeterCalculator<Square> {

    private static SquareCalculatorSingleton instance;

    private SquareCalculatorSingleton() {
    }

    public static SquareCalculatorSingleton getInstance() {
        if (instance == null) {
            instance = new SquareCalculatorSingleton();
        }
        return instance;
    }

    @Override
    public double calculatePerimeter(Square square) {
        List<Double> sides = SquareService.calculateAllSidesForSquare(
                square.getPoint(0), square.getPoint(1),
                square.getPoint(2), square.getPoint(3));
        return sides.get(0) * 4;
    }

    @Override
    public double calculateArea(Square square) {
        List<Double> sides = SquareService.calculateAllSidesForSquare(
                square.getPoint(0), square.getPoint(1),
                square.getPoint(2), square.getPoint(3));
        return sides.get(0) * sides.get(0);
    }
}
