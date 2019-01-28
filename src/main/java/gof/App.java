package gof;
import gof.factorymethod.ImagawasCutPrint;
import gof.itelator.*;
import gof.templatemethod.TanakasWoodCutPrint;


public class App 
{
    public static void main( String[] args )
    {
        //itelator();
        //adapter();
        //templateMethod();
        factoryMethod();
    }



    public static void itelator()
    {
        Teacher you = new MyTeacher();

        you.createStudent();
        you.callStudent();
    }

    public static void adapter()
    {
        gof.adapter.Teacher.callTaro();
        gof.adapter.Teacher.callHanako();
    }

    public static void templateMethod(){
        TanakasWoodCutPrint tanakasWoodCutPrint = new TanakasWoodCutPrint();
        tanakasWoodCutPrint.createWoodCutPrint();
    }

    public static void factoryMethod(){
        ImagawasCutPrint imagawasCutPrint = new ImagawasCutPrint();
        imagawasCutPrint.createWoodCutPrint();
    }
}
