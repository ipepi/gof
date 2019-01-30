package gof.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class MizutakiFactory extends Factory {

    @Override
    public Soup getSoup() {
        return new ChikenBoneSoup();
    }

    @Override
    public Protein getMain() {
        return new Chicken();
    }

    @Override
    public List getVegetables() {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();
        vegetables.add(new ChineseCabbage());
        vegetables.add(new Leek());
        vegetables.add(new Chrysanthemum());
        
        return vegetables;
    }

    @Override
    public List getOtherIngredients() {
        List<Ingredients> ingredients = new ArrayList<Ingredients>();
        ingredients.add(new Tofu());
        return ingredients;
    }

}