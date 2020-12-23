package com.epam.jwd.task.model.factories.impl.subfigures;

import com.epam.jwd.task.model.factories.FigureFactory;
import com.epam.jwd.task.model.Point;
import com.epam.jwd.task.model.Color;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public enum MultiAngleFigureFactory implements FigureFactory<MultiAngleFigure> {

    INSTANCE;

    private static final Logger LOGGER = LogManager.getLogger(MultiAngleFigureFactory.class);

    @Override
    public MultiAngleFigure createFigure(List<Point> points, String name, Color color) {
        MultiAngleFigure multiAngleFigure = new MultiAngleFigure(points, name, color);
        LOGGER.info(multiAngleFigure.toString() + " was created");
        //        TriangleStorage.triangleStorage.add(triangle);
        return multiAngleFigure;
    }
}