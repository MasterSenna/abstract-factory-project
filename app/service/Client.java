package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBServiceFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;

public class Client {

	public static void main(String[] args) {
		// Escolha a fábrica: EJB ou qualquer outra que você tenha
		ServicesAbstractFactory factory = new EJBServiceFactory(); // Troque para outra fábrica se necessário

		// Usar o serviço de carro
		CarService carService = factory.getCarService();
		carService.save("Tesla Model 3");
		carService.update("Tesla Model X");
	}
}
