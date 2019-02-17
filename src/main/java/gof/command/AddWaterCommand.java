package gof.command;

public class AddWaterCommand extends Command {

    @Override
    public void execute() {

        while(!beaker.isMelted()){
            beaker.addWater(10);
            beaker.mix();
        }

        System.out.println("水を１０グラムづつ加える実験");
        beaker.note();
    }

}