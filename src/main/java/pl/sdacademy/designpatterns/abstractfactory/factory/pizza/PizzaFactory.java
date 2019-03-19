package pl.sdacademy.designpatterns.abstractfactory.factory.pizza;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

import java.util.Arrays;

public class PizzaFactory implements AbstractFactory<Pizza> {

    public Pizza createFamilyFourCheeseePizza() {
        return new FourCheesePizza(Base.THICK, 50D, 1, Arrays.asList("chicken", "onion", "mushrooms"));
    }

    public Pizza createSmallFunghi() {
        return new FunghiPizza(Base.FLAT, 28.0D, 1, Arrays.asList("cheese", "mushrooms"));
    }

    public Pizza createMediumThickFunghi() {
        return new FunghiPizza(Base.THICK, 35.1D, 1,  Arrays.asList("cheese", "mushrooms"));
    }

    @Override
    public Pizza create(final String type) {
        switch (type) {
            case "4CF":
                return createFamilyFourCheeseePizza();
            case "SF":
                return createSmallFunghi();
            case "MTF":
                return createMediumThickFunghi();
            default:
                throw new RuntimeException("Unknown pizza type");
        }
    }
}
