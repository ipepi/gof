package gof.interpreter;

public class Plus implements Operator{

    private Operand operand1;
    private Operand operand2;

    public Plus(Operand operand1, Operand operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Operand execute() {
        return new Ingredient(operand1.getOperandString() + "と"
                + operand2.getOperandString() + "を足したもの");
    }

}