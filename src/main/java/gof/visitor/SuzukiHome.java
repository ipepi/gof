package gof.visitor;

public class SuzukiHome extends Home implements TeacherAcceptor{

    @Override
    public void acccept(Teacher teacher) {
        teacher.visit(this);
    }

    @Override
    public Object praiseChild() {
        System.out.println("ご冗談を by Suzuki");
        return null;
    }

    @Override
    public Object reproveChild() {
        System.out.println("まさか・・・ by Suzuki");
        return null;
    }



}