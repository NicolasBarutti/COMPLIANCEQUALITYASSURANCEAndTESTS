package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Operadores op = new Operadores(10, 2);

        System.out.println("O valor da soma é :" + op.somar());
        System.out.println("O valor da subtração é :" + op.subtrair());
        System.out.println("O valor da mutiplicação é :" + op.mutiplicar());


        Operadores op2 = new Operadores(2, 12);
        try {
            System.out.println("O valor da divisão é:" +op2.dividir());
        }catch (ArithmeticException e){
            System.out.println("Não pode ser dividido por 0" + e.getMessage());
        }

    }
}