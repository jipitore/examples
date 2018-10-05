package org.jipitore.examples.service;

import org.jipitore.examples.service.dto.Figure;

import java.lang.reflect.Type;

public abstract class FigureService<T extends Figure> {

    private final Type type;

    protected FigureService(Type type) {
        this.type = type;
    }

    public abstract void check(Type type);

    public boolean canHandle(Type type) {
        check(type);
        return this.type.equals(type);
    }

    public void print(T figure) {
        System.out.println("Figure service -> " + type + " - " + figure.getName());
    }

}
