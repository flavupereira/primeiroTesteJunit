package com.example;

import org.junit.jupiter.api.Test;

public class PrePosCondicaoTest {

    // @Before
    public void preCondicao() {
        System.out.println("Pré condição");
    }

    @Test
    public void metodo01() {
        System.out.println("metodo01");
    }

    @Test
    public void metodo02() {
        System.out.println("metodo02");
    }

    // @After
    public void prosCondicao() {
        System.out.println("Prós condição");
    }

}
