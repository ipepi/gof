package gof.bridge;

public class TimerSorter extends Sorter {

    public TimerSorter(SorterImple sorterImple){
        super(sorterImple);
    }

    public void timeSorter(Object obj[]){
        long start = System.currentTimeMillis();
        sort(obj);
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start));
    }
}