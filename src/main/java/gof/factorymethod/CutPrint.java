package gof.factorymethod;

import gof.templatemethod.Cuttable;
import gof.templatemethod.Wood;


public abstract class CutPrint{

    public abstract void draw(Cuttable hanzai);
    public abstract void cut(Cuttable hanzai);
    public abstract void print(Cuttable hanzai);

    protected Cuttable createCuttable(){
        return new Wood();
    }

    public void createWoodCutPrint(){
        Cuttable hanzai = createCuttable();
        draw(hanzai);
        cut(hanzai);
        print(hanzai);
    }

}