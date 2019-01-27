package gof.italator;

public class MyStudentList extends StudentList implements Aggregate{
    public MyStudentList(){
        super();
    }

    public MyStudentList(int studentCount){
        super(studentCount);
    }

    @Override
    public Itelator Iterator() {
        return new MyStudentListIterator(this);
    }
    
}