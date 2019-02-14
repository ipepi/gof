package gof.proxy;

public class Fujiwara implements Teacher{

    private Teacher yamada = new Yamada();

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
        yamada.question3();
        System.out.println("です");
    }

}