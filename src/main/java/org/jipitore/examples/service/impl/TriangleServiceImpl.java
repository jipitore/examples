package org.jipitore.examples.service.impl;

import org.jipitore.examples.service.FigureService;
import org.jipitore.examples.service.dto.Triangle;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
public class TriangleServiceImpl extends FigureService<Triangle> {

    public TriangleServiceImpl() {
        super(Triangle.class);
    }

    @Override
    public void check(Type type) {
        System.out.println(" --> Checking Trinangle -> " + type);
    }

//    @Override
//    public void print(Triangle figure) {
//        System.out.println("Triangle service -> " + figure.getName());
//    }
}
