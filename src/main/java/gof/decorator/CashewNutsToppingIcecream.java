package gof.decorator;

public class CashewNutsToppingIcecream implements Icecream{

    private Icecream ice = null;

    public CashewNutsToppingIcecream(Icecream ice){
        this.ice = ice;
    }

    @Override
    public String getName() {
        return "カシューナッツ" + ice.getName();
    }

    @Override
    public String HowSweet() {
        return ice.HowSweet();
    }

}