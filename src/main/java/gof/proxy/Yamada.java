package gof.proxy;

public class Yamada implements Teacher{

    @Override
    public void question1() {
        System.out.println("~~answer1~~");
    }

    @Override
    public void question2() {
        System.out.println("~~answer2~~");
    }

    @Override
    public void question3() {
        System.out.println("~~answer3~~");
    }

}