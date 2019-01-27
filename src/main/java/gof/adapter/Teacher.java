package gof.adapter;

public class Teacher{

    public static void callTaro(){
        Chairperson chairperson = new NewTaro();
        chairperson.organaizeClass();
    }

    public static void callHanako(){
        Chairperson chairperson = new NewTaro();
        chairperson.organaizeClass();
    }
}