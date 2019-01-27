package gof;
import gof.itelator.*;


public class App 
{
    public static void main( String[] args )
    {
        Teacher you = new MyTeacher();

        you.createStudent();
        you.callStudent();
    }
}
