package gof.interpreter;

public class Sample{

    public static void hoge(){
        Ingredient liquidSoup = new Ingredient("液体スープ");
        Ingredient hotWater = new Ingredient("お湯");
        Ingredient noodles = new Ingredient("麺");
        Ingredient powderSoup = new Ingredient("粉末スープ");

        Operator operator1 = new Plus(powderSoup, noodles);
        Operator operator2 = new Plus(operator1.execute(), hotWater);
        Operator operator3 = new Wait(3, operator2.execute());
        Operator operator4 = new Plus(operator3.execute(), liquidSoup);

        Expression expression = new Expression(operator4);
        System.out.println(expression.getOperandString());

    }
}