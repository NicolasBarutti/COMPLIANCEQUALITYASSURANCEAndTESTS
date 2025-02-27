package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
public class ClassificadoraPrecoTest {

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



    @Test
    public void testClassificaProdutosPorPreco() {

        Produto p1 = new Produto("A", 200);
        Produto p2 = new Produto("B", 150);
        Produto p3 = new Produto("A", 100);
        Produto p4 = new Produto("C", 200);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);


        ClassificadoraPreco classificadora = new ClassificadoraPreco();


        List<Produto> produtosOrdenados = classificadora.classificaProdutosPorPreco(produtos);


        assertEquals("A", produtosOrdenados.get(0).codigo);
        assertEquals(100, produtosOrdenados.get(0).preco);

        assertEquals("A", produtosOrdenados.get(1).codigo);
        assertEquals(200, produtosOrdenados.get(1).preco);

        assertEquals("B", produtosOrdenados.get(2).codigo);
        assertEquals(150, produtosOrdenados.get(2).preco);

        assertEquals("C", produtosOrdenados.get(3).codigo);
        assertEquals(200, produtosOrdenados.get(3).preco);
    }
}
