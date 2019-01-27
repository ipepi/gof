package gof;
import gof.itelator.*;


public class App 
{
    public static void main( String[] args )
    {
        //itelator();
        //adapter();
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
}
