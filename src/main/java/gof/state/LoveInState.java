package gof.state;

public class LoveInState implements State{

    @Override
    public String morningGreet() {
        return "お、おはよう！";
    }

    @Override
    public String getProtectionForCold() {
        return "今日はピンクの毛糸のパンツ！";
    }
}