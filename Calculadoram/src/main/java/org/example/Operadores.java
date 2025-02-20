package org.example;

public class Operadores {

    public Integer variavel1;

    public Integer variavel2;

    public Operadores(Integer variavel1, Integer variavel2) {
        this.variavel1 = variavel1;
        this.variavel2 = variavel2;
    }



    //Metodos

    public Integer somar (){
        return variavel1 +variavel2;
    }

    public Integer subtrair(){
        return variavel1 - variavel2;
    }

    public Integer mutiplicar(){
        return variavel1 * variavel2;
    }

    public Integer dividir(){
        if (variavel2 == 0){
            throw new ArithmeticException("Divisão por 0 não é permitido");
        }else{
            return variavel2 / variavel1;
        }
    }
}

