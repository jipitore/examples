package org.jipitore.examples.service.impl;


import org.jipitore.examples.service.FigureService;
import org.jipitore.examples.service.dto.Circle;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
public class CircleServiceImpl extends FigureService<Circle> {

    public CircleServiceImpl(){
        super(Circle.class);
    }

    @Override
    public void check(Type type) {
        System.out.println(" --> Checking Circle -> " + type);
    }

    @Override
    public void print(Circle circle) {
        System.out.println("Circle service -> " + circle.getName());
    }
}
