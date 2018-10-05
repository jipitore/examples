package org.jipitore.examples.service.factory;

import org.jipitore.examples.service.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FigureServiceFactory {

    @Autowired
    private List<FigureService> figureServices;

    public FigureService getService(Class clazz) throws Exception {
        return figureServices.stream()
                .filter(s -> s.canHandle(clazz))
                .findFirst()
                .orElseThrow(() -> new Exception(clazz.getName() + " service implementation not found"));
    }

}
