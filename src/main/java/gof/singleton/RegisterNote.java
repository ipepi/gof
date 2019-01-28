package gof.singleton;

public class RegisterNote{
    private static RegisterNote registerNote = new RegisterNote();

    //コンストラクタがprivateになっていることで、外部からインスタンスを生成することができなくなる
    private RegisterNote(){}

    //インスタンスを取得するには以下のメソッドを呼び出すしかなくなる
    public static RegisterNote getInstance(){
        return registerNote;
    }

}