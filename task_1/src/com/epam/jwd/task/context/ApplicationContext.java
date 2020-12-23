package com.epam.jwd.task.context;

import com.epam.jwd.task.view.Figure;
import com.epam.jwd.task.view.factories.FigureFactory;

public interface ApplicationContext<T extends Figure> {
    FigureFactory<T> createFigureFactory(FigureFactory<T> figureFactory);
}
