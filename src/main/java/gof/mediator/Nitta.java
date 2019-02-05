package gof.mediator;

public class Nitta implements Colleagure{

    private String name = "新田";
    private int tension;
    private Colleagure secretLover = null;
    private LoveMediator mediator = new Saito();

    public String getName(){
        return this.name;
    }

    @Override
    public void needAdvice() {
        this.tension = mediator.Consultation(this, secretLover);
    }

    @Override
    public void setSecretLove(Colleagure colleagure) {

    }

}