package gof.facade;

import java.util.HashMap;
import java.util.Map;

public class BookList {
    Map<String, String> hashMap = null;
    
    public BookList(){
        hashMap = new HashMap<>();
        hashMap.put("辞書","A11");
        //hashMap.put("昆虫図鑑","A22");
        hashMap.put("恐竜図鑑","B15");
    }

    public String searchBook(String searchBook){
        return hashMap.get(searchBook);
    }
}