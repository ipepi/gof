package gof.interpreter;


public class Ingredient implements Operand{


    private String operandString = null;

    public Ingredient(String operandString){
        this.operandString = operandString;
    }

    @Override
    public String getOperandString() {
        return this.operandString;
    }

}