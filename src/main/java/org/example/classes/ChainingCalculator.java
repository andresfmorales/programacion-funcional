package org.example.classes;

public class ChainingCalculator {

    private double result = 0;

    public ChainingCalculator operation(String Type, double value){
        if(Type.equals("+")){
            result += value;
        } else if (Type.equals("-")) {
            result -= value;
        }else if (Type.equals("*")) {
            result *= value;
        }else{
            System.out.println("valide el operador");
        }
        System.out.println("El resultado parcial es " + result);
        return this;
    }

    public static void main(String[] args) {
        ChainingCalculator calculator = new ChainingCalculator();

        // Realizar operaciones encadenadas
        calculator
                .operation("+" ,10) // 0 + 10 = 10
                .operation("-" ,5)  // 10 - 5 = 5
                .operation("/" ,2) // mensaje de error
                .operation("*" ,2); // 5 * 2 = 10
    }
}
