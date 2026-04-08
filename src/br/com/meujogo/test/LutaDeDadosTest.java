package br.com.meujogo.test;

import br.com.meujogo.main.Funcionalidade;
import br.com.meujogo.main.LutaDeDados;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class LutaDeDadosTest {

    private Funcionalidade funcionalidade;

    @BeforeEach
    void setUp() {
        funcionalidade = new Funcionalidade();
    }

    @Test
    void testInicializacao(){
        System.out.printf("Vida jogador 1: %d \n Vida jogador 2:%d", funcionalidade.getJogador1Vida(), funcionalidade.getJogador2Vida());
    }

    @Test
    void testeVencedor(){
      System.out.println( Funcionalidade.verificarVencedor(1,1));
    }

    @Test
    void testeDano(){
        int dano = 15;



        System.out.print(funcionalidade);
    }




}
