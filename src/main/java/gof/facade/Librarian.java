package gof.facade;

public class Librarian{
    public String searchBook(String bookName){

        BookList bookList = new BookList();
        String location = bookList.searchBook(bookName);

        if(location != null){
            LendingList lendingList = new LendingList();
            if(lendingList.check(bookName)){
                return "貸出中";
            }else{
                return location;
            }
        }else{
            return "その本は所蔵していません";
        }
    }
}