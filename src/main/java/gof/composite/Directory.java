package gof.composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Directory{
    private List<Object> list = null;
    private String name = null;

    public Directory(String name){
        this.name = name;
        this.list = new ArrayList<>();
    
    }
    
    public void add(File file){
        list.add(file);
    }

    public void add(Directory directory){
        list.add(directory);
    }

    public void remove(){
        Iterator<Object> itr = list.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            if(obj instanceof File){
                ((File)obj).remove();
            }else if(obj instanceof Directory){
                ((Directory)obj).remove();
            }else{
                System.out.println("削除できませんでした");
            }
        }
        System.out.println(name + "を削除しました");
    }
}
