package org.jipitore.examples.service.impl;


import org.jipitore.examples.service.FigureService;
import org.jipitore.examples.service.dto.CircleV2;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
public class CircleServiceV2Impl extends FigureService<CircleV2> {

    public CircleServiceV2Impl(){
        super(CircleV2.class);
    }

    @Override
    public void check(Type type) {
        System.out.println(" --> Checking CircleV2 -> " + type);
    }

    @Override
    public void print(CircleV2 circle) {
        System.out.println("Circle v2 service -> " + circle.getName() + " - " + circle.getFieldV2());
    }

}
