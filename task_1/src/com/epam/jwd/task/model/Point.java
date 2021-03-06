package com.epam.jwd.task.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class Point {

    private static final Logger LOGGER = LogManager.getLogger(Point.class);

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        LOGGER.info("Point: x=" + x + ", y=" + y + " was created");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
