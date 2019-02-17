package gof.command;

public class AddSaltCommand extends Command{

    @Override
    public void execute() {

        while(beaker.isMelted()){
            beaker.addSalt(1);
            beaker.mix();
        }

        System.out.println("1グラムずつ食塩を入れる実験");
        beaker.note();

    }

}