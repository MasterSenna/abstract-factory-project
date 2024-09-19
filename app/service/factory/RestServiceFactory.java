/*package br.com.cod3r.abstractfactory.app.service.factory;

import br.com.cod3r.abstractfactory.app.service.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class RestServiceFactory implements ServicesAbstractFactory {
    @Override
    public CarService getCarService() {
        return new CarRestApiService(); // Retorna a implementação REST para carros
    }

    @Override
    public UserService getUserService() {
        return new UserRestApiService(); // Retorna a implementação REST para usuários
    }
} */