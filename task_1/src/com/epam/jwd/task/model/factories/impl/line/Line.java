package com.epam.jwd.task.model.factories.impl.line;

import com.epam.jwd.task.model.Figure;
import com.epam.jwd.task.model.Point;

import java.util.List;

public final class Line extends Figure {

    static List<Line> linesPool;

    Line(List<Point> points) {
        super(points);
    }
}
