package org.jipitore.examples;

import org.jipitore.examples.service.FigureService;
import org.jipitore.examples.service.dto.*;
import org.jipitore.examples.service.factory.FigureServiceFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamplesApplicationTests {

    @Autowired
    private List<FigureService> figureServices;

    @Autowired
    private FigureServiceFactory figureServiceFactory;

    @Test
    public void test() {
        List<Figure> figures = buildFigures();
        print(figures);
        System.out.println("------------------------------------");
        figures = mapToSquare(figures);
        print(figures);
    }

    private List<Figure> mapToSquare(List<Figure> figures) {
        figures = figures.stream()
                .map(figure -> {
                    Figure sq = new Square();
                    sq.setName(figure.getName());
                    return sq;
                })
                .collect(Collectors.toList());
        return figures;
    }

    private List<Figure> buildFigures() {
        List<Figure> figures = new ArrayList<>();

        Circle c = new Circle();
        c.setName("Circle 1");
        figures.add(c);

        Triangle t = new Triangle();
        t.setName("Triangle 1");
        figures.add(t);

        Square s = new Square();
        s.setName("Square 1");
        figures.add(s);

        t = new Triangle();
        t.setName("Triangle 2");
        figures.add(t);

        CircleV2 circleV2 = new CircleV2();
        circleV2.setName("Circle V2");
        circleV2.setFieldV2(10);
        figures.add(circleV2);

        Hexagon h = Hexagon.builder().build();
        h.setName("Hexagon 1");

        figures.add(h);

        return figures;
    }

    private void print(List<Figure> figures) {
        figures.forEach(figure -> {
            try {
                figureServiceFactory.getService(figure.getClass()).print(figure);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }

}
