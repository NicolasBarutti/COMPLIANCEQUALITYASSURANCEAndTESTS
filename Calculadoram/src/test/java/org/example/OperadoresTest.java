package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperadoresTest extends TestCase {

    //Preparação Teste
    public static int contadorTeste = 1;



    // Preparação teste
    @Before
    public void preparaTeste(){
        System.out.println("Vou realizar o Teste"+ contadorTeste);
    }

    //Finalização
    @After
    public void finalizaTeste(){
        System.out.println("Finalizando o Teste");
        contadorTeste += contadorTeste ;
    }

    Operadores operadoresParaguayo = new Operadores(10, 2);
    Integer resultadoEsperado;
    Operadores operadoresParaguayo2 = new Operadores(2, 12);
    @Test
    public void testSomar10e2() {
        Integer result = operadoresParaguayo.somar();
        resultadoEsperado = 12;
        assertEquals(resultadoEsperado, result);
    }
    @Test
    public void testSubtrair10e2() {
        Integer result = operadoresParaguayo.subtrair();
        resultadoEsperado = 8;
        assertEquals(resultadoEsperado, result);
    }
    @Test
    public void testMutiplicar10e2() {
        Integer result = operadoresParaguayo.mutiplicar();
        resultadoEsperado = 20;
        assertEquals(resultadoEsperado, result);
    }
    @Test
    public void testDividir2por12() {
        Integer result = operadoresParaguayo2.dividir();
        resultadoEsperado = 6;
        assertEquals(resultadoEsperado, result, 0.5);

    }
}