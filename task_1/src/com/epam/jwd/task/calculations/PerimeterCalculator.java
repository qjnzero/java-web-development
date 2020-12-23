package com.epam.jwd.task.calculations;

import com.epam.jwd.task.view.Figure;

@FunctionalInterface
public interface PerimeterCalculator<T extends Figure> {
    double calculatePerimeter(T figure);
}
