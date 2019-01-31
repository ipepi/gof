package gof.strategy;

public class SampleClass {
    private int type = -1;
    public static final int COMPARE_AGE = 1;
    public static final int COMPARE_HEIGHT = 2;
    public static final int COMPARE_WEIGHT = 3;

    public SampleClass(int type){
        this.type = type;
    }

    public int copmare(Human h1, Human h2){
        if(type == COMPARE_AGE){
            if(h1.age > h2.age){
                return 1;
            }else if(h1.age == h2.age){
                return 0;
            }else{
                return -1;
            }
        }else if(type == COMPARE_HEIGHT){
            if(h1.height > h2.height){
                return 1;
            }else if(h1.height == h2.height){
                return 0;
            }else{
                return -1;
            }
        }else if(type == COMPARE_WEIGHT){
            if(h1.weight > h2.weight){
                return 1;
            }else if(h1.weight == h2.weight){
                return 0;
            }else{
                return -1;
            }
        }else{
            return -99;
        }
    }


}