package gof.facade;

public class Visitor{
    public static void visit(){
        Librarian nakamura = new Librarian();

        String location = nakamura.searchBook("昆虫図鑑");
        if(location.equals("貸出中です")){
            System.out.println("残念。。。");
        }else if(location.equals("その本は所蔵していません")){
            System.out.println("残念。。。ないのか。。。");
        }else{
            System.out.println("ありがとう！");
        }
    }
}