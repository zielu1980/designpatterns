package pl.sdacademy.designpatterns.abstractfactory.factory;

import pl.sdacademy.designpatterns.abstractfactory.factory.car.CarFactory;
import pl.sdacademy.designpatterns.abstractfactory.factory.pizza.PizzaFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(final FactoryCategory category) {
        if (category == FactoryCategory.CAR) {
            return new CarFactory();
        } else if (category == FactoryCategory.PIZZA) {
            return new PizzaFactory();
        }
        throw new RuntimeException("No factory implementation for given type");
    }

}
