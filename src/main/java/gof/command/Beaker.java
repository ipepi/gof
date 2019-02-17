package gof.command;

public class Beaker{

    private double water = 0;
    private double salt = 0;
    private boolean melted = true;

    public Beaker(double water, double salt){
        this.water = water;
        this.salt = salt;
        this.mix();
    }

    public void mix(){
        if((this.salt / (this.salt+this.water)) * 100 < 26.4){
            melted = true;
        }else{
            melted = false;
        }
    }

    public void addWater(double water){
        this.water += water;
    }

    public void addSalt(double salt){
        this.salt += salt;
    }

    public double getWater(){
        return this.water;
    }

    public double getSalt(){
        return this.salt;
    }

    public boolean isMelted(){
        return this.melted;
    }

    public void note(){
        System.out.println("水:" + this.water);
        System.out.println("食塩:" + this.salt);
        System.out.println("濃度:" + ((this.salt/(this.water + this.salt)) * 100) + "%");

    }
}