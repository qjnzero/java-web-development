package com.epam.jwd.task.calculations;

import com.epam.jwd.task.view.Figure;

@FunctionalInterface
public interface AreaCalculator<T extends Figure> {
    double calculateArea(T figure);
}