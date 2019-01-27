package gof.templatemethod;

public class TanakasWoodCutPrint extends WoodCutPrint{

    @Override
    public void draw(Cuttable hanzai) {
        System.out.println("Drawing on prints with magic");
    }

    @Override
    public void cut(Cuttable hanzai) {
        System.out.println("Cut in a star with scissors");
    }

    @Override
    public void print(Cuttable hanzai) {
        System.out.println("Print a picture");
    }

}