package gof.bridge;

public class Sorter {

    private SorterImple sorterImple;
    public Sorter(SorterImple sorterImple){
        this.sorterImple = sorterImple;
    }

    public void sort(Object obj[]){
        sorterImple.sort(obj);
    }

}