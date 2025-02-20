package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class OperadoresTest extends TestCase {

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
        assertEquals(resultadoEsperado, result);

    }
}