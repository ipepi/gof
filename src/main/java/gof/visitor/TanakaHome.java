package gof.visitor;

public class TanakaHome extends Home implements TeacherAcceptor{

    @Override
    public void acccept(Teacher teacher) {
        teacher.visit(this);
    }

    @Override
    public Object praiseChild() {
        System.out.println("ご冗談を by Tanaka");
        return null;
    }

    @Override
    public Object reproveChild() {
        System.out.println("まさか・・・ by Tanaka");
        return null;
    }



}