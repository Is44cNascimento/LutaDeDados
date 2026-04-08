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
    void testeDano(){
        funcionalidade.setJogador1Vida(funcionalidade.getJogador1Vida() - 15);
        System.out.print(funcionalidade.getJogador1Vida());

    }

    @Test
    void testeDeVitoria(){
        System.out.println( funcionalidade.verificarVencedor(1,0));
    }

    @Test
    void testeDeDerrota(){
        System.out.println( funcionalidade.verificarVencedor(0,1));
    }

    @Test
    void testeDeEmpate(){
        System.out.println( funcionalidade.verificarVencedor(1,1));
    }
    @Test
    void verificarVencedor(){
        funcionalidade.verificarVencedor(15,15);
        funcionalidade.verificarVencedor(2,2);
        funcionalidade.verificarVencedor(90,90);

    }


    @Test
    void lancarDados(){
            for(int i = 0; i<5;i++){
            funcionalidade.turno();
            }
    }
}
