package gof.itelator;

public class Student{
    private String name;
    private int sex;//1:Man 2:Woman

    public Student(String name, int sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public int getSex(){
        return sex;
    }
}