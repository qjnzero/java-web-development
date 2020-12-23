package com.epam.jwd.task.preprocessors.impl;

import com.epam.jwd.task.exception.FigureException;
import com.epam.jwd.task.exception.FigureNotExistException;
import com.epam.jwd.task.view.Point;
import com.epam.jwd.task.preprocessors.ExistencePreProcessor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiAngleFigureExistencePreProcessor implements ExistencePreProcessor {

    @Override
    public void preProcess(List<Point> points) throws FigureException {
        Set<Point> compressPoints = new HashSet<>(points);
        if (compressPoints.size() != points.size()) {
            throw new FigureNotExistException("MultiAngleFigure with " + points.size() +
                    " was NOT created. There are equal points");
        }
    }
}
