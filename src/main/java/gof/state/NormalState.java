package gof.state;

public class NormalState implements State{

    @Override
    public String morningGreet() {
        return "おっす！";
    }

    @Override
    public String getProtectionForCold() {
        return "なし！";
    }
}