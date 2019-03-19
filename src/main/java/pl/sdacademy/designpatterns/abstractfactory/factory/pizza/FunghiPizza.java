package pl.sdacademy.designpatterns.abstractfactory.factory.pizza;

import java.util.List;

class FunghiPizza implements Pizza {

    private Base base;
    private Double width;
    private int cheeseTypesNum;
    private List<String> ingredients;

    public FunghiPizza(final Base base, final Double width, final int cheeseTypesNum, final List<String> ingredients) {
        this.base = base;
        this.width = width;
        this.cheeseTypesNum = cheeseTypesNum;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return "Funghi";
    }

    @Override
    public Base getBaseType() {
        return base;
    }

    @Override
    public Double getWidth() {
        return width;
    }

    @Override
    public int getCheeseTypesNum() {
        return cheeseTypesNum;
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
