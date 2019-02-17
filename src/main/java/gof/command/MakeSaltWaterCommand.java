package gof.command;

public class MakeSaltWaterCommand extends Command{

    @Override
    public void execute() {

        beaker.mix();
        System.out.println("食塩水を作る実験");
        beaker.note();
    }

}