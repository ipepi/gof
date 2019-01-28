package gof.factorymethod;

import gof.templatemethod.Cuttable;

public class ImagawasCutPrint extends CutPrint {

    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("Drawing on potato with magic");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("Cut in a star with scissors");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("Print a picture");
    }

    protected Cuttable creaCuttable(){
        return new Potato();
    }

}