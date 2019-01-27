package gof.itelator;

public class MyTeacher extends Teacher{

    @Override
    public void createStudent() {

        studentList = new StudentList(5);
        studentList.add(new Student("赤井亮太", 1));
        studentList.add(new Student("赤羽里美", 2));
        studentList.add(new Student("岡田未央", 2));
        studentList.add(new Student("西森俊介", 1));
        studentList.add(new Student("中ノ森玲奈", 2));

    }

    @Override
    public void callStudent() {
        int size = studentList.getLastNum();
        for(int n = 0; n < size; n++){
            System.out.println(studentList.getStudentAt(n).getName());
        }

    }

}