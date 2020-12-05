package com.epam.jwd.model.square;

import com.epam.jwd.exception.FigureNotExistException;
import com.epam.jwd.model.FigureFactory;
import com.epam.jwd.model.Point;
import com.epam.jwd.service.impl.preprocessor.SquareExistencePreProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public enum SquareFactory implements FigureFactory<Square> {
    INSTANCE;

    private static final Logger LOGGER = LogManager.getLogger(SquareFactory.class);

    @Override
    public Square createFigure(List<Point> points) throws FigureNotExistException {
        SquareExistencePreProcessor processor = new SquareExistencePreProcessor();
        boolean isCreatable = processor.process(points);
        if (!isCreatable) {
            throw new FigureNotExistException("Square: " +
                    points.get(0).toString() + ", " +
                    points.get(1).toString() + ", " +
                    points.get(2).toString() + ", " +
                    points.get(3).toString() + " was NOT created");

        }
        LOGGER.info("Square: " +
                points.get(0).toString() + ", " +
                points.get(1).toString() + ", " +
                points.get(2).toString() + ", " +
                points.get(3).toString() + " was created");

        return new Square(points);
    }
}
