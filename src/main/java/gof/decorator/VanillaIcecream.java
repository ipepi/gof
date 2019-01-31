package gof.decorator;

public class VanillaIcecream implements Icecream{

    @Override
    public String getName() {
        return "バニラアイスクリーム";
    }

    @Override
    public String HowSweet() {
        return "バニラ味";
    }

}