package gof.state;

public class Yumi{

    private State state = null;

    public void changeState(State state){
        this.state = state;
    }

    public String morningGeet(){
        return this.state.morningGreet();
    }

    public String getProtectionForCold(){
        return this.state.getProtectionForCold();
    }
}