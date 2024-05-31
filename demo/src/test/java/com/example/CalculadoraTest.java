package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Calculadora;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void soma() {
        assertEquals(4, calculadora.calc(2, 2));
    }

    @Test
    public void multiplica() {
        assertEquals(15, calculadora.multiplicacao(3, 5));
    }

    @Test
    public void subtracao() {
        assertEquals(7, calculadora.subtracao(10, 3));
    }

    @Test
    public void divicao() {
        assertEquals(7, calculadora.divisao(15, 2));
    }

}
