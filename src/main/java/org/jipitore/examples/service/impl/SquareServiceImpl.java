package org.jipitore.examples.service.impl;

import org.jipitore.examples.service.FigureService;
import org.jipitore.examples.service.dto.Square;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;

@Service
public class SquareServiceImpl extends FigureService<Square> {

    public SquareServiceImpl(){
        super(Square.class);
    }

    @Override
    public void check(Type type) {
        System.out.println(" --> Checking Square -> " + type);
    }

//    @Override
//    public void print(Square square) {
//        System.out.println("Square service -> " + square.getName());
//    }
}
