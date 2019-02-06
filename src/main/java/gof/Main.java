package gof;

import java.awt.GradientPaint;
import java.util.List;

import gof.abstractfactory.MizutakiSample;
import gof.bridge.BubbleSorter;
import gof.bridge.TimerSorter;
import gof.builder.Builder;
import gof.builder.Director;
import gof.builder.SaltWater;
import gof.builder.SaltWaterBuilder;
import gof.chainresponsible.ClassTeacher;
import gof.chainresponsible.Level;
import gof.chainresponsible.Question;
import gof.chainresponsible.Responsible;
import gof.chainresponsible.Student;
import gof.decorator.CashewNutsToppingIcecream;
import gof.decorator.GreenTeaIcecream;
import gof.decorator.Icecream;
import gof.decorator.VanillaIcecream;
import gof.facade.Visitor;
import gof.factorymethod.ImagawasCutPrint;
import gof.itelator.*;
import gof.mediator.Nitta;
import gof.observer.DegitObserver;
import gof.observer.GraphObserver;
import gof.observer.NumberGenerator;
import gof.observer.Observer;
import gof.observer.RandomNumberGenerator;
import gof.strategy.AgeComparator;
import gof.strategy.Human;
import gof.strategy.MyClass;
import gof.templatemethod.TanakasWoodCutPrint;
import gof.visitor.RookieTeacher;
import gof.visitor.SuzukiHome;
import gof.visitor.TanakaHome;



public class Main 
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
        //composite();
        //decorator();
        //visitor();
        //chainresponsibility();
        //facade();
        //mediator();
        observer();
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

    public static void decorator(){
        Icecream ice1 = new CashewNutsToppingIcecream(new VanillaIcecream());
        System.out.println(ice1.getName());
        Icecream ice2 = new CashewNutsToppingIcecream(new GreenTeaIcecream());
        System.out.println(ice2.getName());
        }

    public static void visitor(){
        List students = null;
        //students.add(new TanakaHome());
        //students.add(new TanakaHome());

        RookieTeacher rookieTeacher = new RookieTeacher(students);

        rookieTeacher.visit(new SuzukiHome());
        rookieTeacher.visit(new TanakaHome());
    }

    public static void chainresponsibility(){
        Responsible nakata = new Student("中川");
        Responsible rookie = new ClassTeacher("クラスの担任");
        nakata.setNext(rookie);
        nakata.putQuestion(new Question("のみものは持っていっていい？", new Level(1)));
        nakata.putQuestion(new Question("おやつは持っていっていい？", new Level(2)));
        nakata.putQuestion(new Question("携帯は持っていて良い？", new Level(3)));

    }

    public static void facade(){
        Visitor.visit();
    }

    public static void mediator(){
        Nitta nitta = new Nitta();
        nitta.needAdvice();
    }

    public static void observer(){
        NumberGenerator generator = new RandomNumberGenerator();
        Observer degitObserver = new DegitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addaObserver(degitObserver);
        generator.addaObserver(graphObserver);
        generator.execute();
    }
}
