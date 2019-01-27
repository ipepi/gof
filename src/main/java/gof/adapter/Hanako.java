package gof.adapter;

public class Hanako implements Chairperson{
    private Taro taro;

    Hanako(){
        taro = new Taro();
    }

    @Override
    public void organaizeClass() {
        taro.enjoyWithAllClassmate();
    }
    
}