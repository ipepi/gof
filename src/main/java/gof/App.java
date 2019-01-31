package gof;

import gof.abstractfactory.MizutakiSample;
import gof.bridge.BubbleSorter;
import gof.bridge.TimerSorter;
import gof.builder.Builder;
import gof.builder.Director;
import gof.builder.SaltWater;
import gof.builder.SaltWaterBuilder;
import gof.composite.Test;
import gof.factorymethod.ImagawasCutPrint;
import gof.itelator.*;
import gof.strategy.AgeComparator;
import gof.strategy.Human;
import gof.strategy.MyClass;
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
        //abstractFactory();
        //bridge();
        //strategy();
        composite();
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

    public static void bridge(){
        
        TimerSorter timerSorter = new TimerSorter(new BubbleSorter());
        Object[] obj = new Object[1];
        timerSorter.timeSorter(obj);
    }

    public static void strategy(){
        Human h1 = new Human("Taro", 170, 60, 25);
        Human h2 = new Human("Jiro", 180, 750, 22);
        
        MyClass myClass = new MyClass(new AgeComparator());
        System.out.println(myClass.comparator(h1, h2));
    }

    public static void composite(){
        gof.composite.Test.removeTest();
    }
}
