package gof.facade;

import java.util.HashMap;
import java.util.Map;

public class LendingList{
    public Map<String, String> hashMap = null;

    public LendingList(){
        hashMap = new HashMap<>();
        hashMap.put("昆虫図鑑", "貸出中");
    }

    public boolean check(String bookName){
        return hashMap.containsKey(bookName);
    }



}