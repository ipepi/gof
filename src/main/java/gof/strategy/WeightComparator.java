package gof.strategy;

public class WeightComparator implements Comparator{

    @Override
    public int compare(Human h1, Human h2) {
        if(h1.weight > h2.weight){
            return 1;
 
        }else if(h1.weight == h2.weight){
            return 0;
 
        }else{
            return -1;
        }
    }

}