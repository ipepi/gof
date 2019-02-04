package gof.chainresponsible;

public class Level{

    public int difficulty;

    public Level(int difficulty){
        this.difficulty = difficulty;
    }

    public boolean lessThan(Level responsibleLevel){
        if(difficulty <= responsibleLevel.difficulty){
            return true;
        }else{
        return false;
        }
    }
}