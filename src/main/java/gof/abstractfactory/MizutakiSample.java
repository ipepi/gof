package gof.abstractfactory;

import java.util.*;

public class MizutakiSample{
    public static void mizutaki(){
        HotPot hotPot = new HotPot(new Pot());
        Factory factory = new MizutakiFactory();
        hotPot.addSoup(factory.getSoup());
        hotPot.addMain(factory.getMain());
        hotPot.addVegetables(factory.getVegetables());
        hotPot.addVegetables(factory.getOtherIngredients());

        System.out.println(hotPot.getClass());
    }
}