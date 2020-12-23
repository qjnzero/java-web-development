package com.epam.jwd.task.model.factories;

import com.epam.jwd.task.exception.FigureException;
import com.epam.jwd.task.model.Figure;
import com.epam.jwd.task.model.Point;
import com.epam.jwd.task.model.Color;

import java.util.List;

public interface FigureFactory<T extends Figure> {
    T createFigure(List<Point> points, String name, Color color) throws FigureException;
}