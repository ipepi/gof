package gof.italator;

public class MyStudentListIterator implements Itelator {
    private MyStudentList myStudentList;
    private int index;

    public MyStudentListIterator(MyStudentList list){
        this.myStudentList = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(myStudentList.getLastNum() > index){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Student next() {
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s;
    }
}