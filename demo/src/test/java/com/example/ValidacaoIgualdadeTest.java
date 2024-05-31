package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidacaoIgualdadeTest {

    @Test
    public void sucesso() {
        String resultado = "Registro Salva com sucesso !";
        assertEquals("Registro Salva com sucesso !", resultado);

    }

    @Test
    public void falha() {
        String resultado = "Registro Salva com sucesso !";
        assertEquals("Registro exluido com sucesso !", resultado);

    }

}
