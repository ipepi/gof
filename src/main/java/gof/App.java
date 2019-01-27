package gof;
import gof.itelator.*;
import gof.templatemethod.TanakasWoodCutPrint;


public class App 
{
    public static void main( String[] args )
    {
        //itelator();
        //adapter();
        templatemethod();
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

    public static void templatemethod(){
        TanakasWoodCutPrint tanakasWoodCutPrint = new TanakasWoodCutPrint();
        tanakasWoodCutPrint.createWoodCutPrint();
    }
}
