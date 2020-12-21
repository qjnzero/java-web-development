package com.epam.jwd.task.model.factories.impl.triangle;

import com.epam.jwd.task.calculations.impl.TriangleCalculator;
import com.epam.jwd.task.model.Figure;
import com.epam.jwd.task.model.Point;
import com.epam.jwd.task.model.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Triangle extends Figure {

    private List<Point> points;

    Triangle(List<Point> points, String name, Color color) {
        super(name, color);
        checkAndAdd(points);
    }

    private void checkAndAdd(List<Point> points) {
        if (points != null) {
            this.points = points.subList(0, 3);
        }
    }

    public Point getPoint(int ind) {
        return points.get(ind);
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(points, triangle.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return "Triangle: " + points.get(0) + ", " + points.get(1) + ", " + points.get(2);
    }
}