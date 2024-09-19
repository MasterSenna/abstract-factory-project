package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {
    CarService getCarService();
    UserService getUserService();
}
