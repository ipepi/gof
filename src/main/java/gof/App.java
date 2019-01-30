package gof;

import gof.abstractfactory.MizutakiSample;
import gof.builder.Builder;
import gof.builder.Director;
import gof.builder.SaltWater;
import gof.builder.SaltWaterBuilder;
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
        //factoryMethod();
        //builder();
        abstractFactory();
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

    public static void builder(){
        Builder builder = new SaltWaterBuilder();
        Director director = new Director(builder);
        director.constract();
        SaltWater saltWater = (SaltWater)builder.getResult();

        System.out.println(saltWater.salt);
        System.out.println(saltWater.water);

    }

    public static void abstractFactory(){
        MizutakiSample.mizutaki();
    }
}
