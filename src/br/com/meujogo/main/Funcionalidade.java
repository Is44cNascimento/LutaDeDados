package br.com.meujogo.main;

import java.util.Random;

public class Funcionalidade {

    private static int jogador1Vida = 100;
    private static int jogador2Vida = 100;
    private static int rodadas = 0;
    private static int danoJogador1 = 0;
    private static int danoJogador2 = 0;


    public static Random dado = new Random();

    public static int getJogador1Vida() {
        return jogador1Vida;
    }

    public static void setJogador1Vida(int jogador1Vida) {
        Funcionalidade.jogador1Vida = jogador1Vida;
    }

    public static int getJogador2Vida() {
        return jogador2Vida;
    }

    public static void setJogador2Vida(int jogador2Vida) {
        Funcionalidade.jogador2Vida = jogador2Vida;
    }

    public static int getRodadas() {
        return rodadas;
    }

    public static void setRodadas(int rodadas) {
        Funcionalidade.rodadas = rodadas;
    }

    public static int getDanoJogador1() {
        return danoJogador1;
    }


    public static int getDanoJogador2() {
        return danoJogador2;
    }


    public static void turno() {

        int danoJogadorUm = lancarDados();
        int danoJogadorDois = lancarDados();



        jogador1Vida -= 2 * danoJogadorDois;
        danoJogador1 += 2 * danoJogadorUm;

        jogador2Vida -= 2 * danoJogadorUm;
        danoJogador2 += 2 * danoJogadorDois;

        if (jogador1Vida < 0) {
            setJogador1Vida(0);
        }

        if (jogador2Vida < 0) {
            setJogador2Vida(0);
        }

        System.out.printf("\n Rodada Atual:%d \n Dano jogador 1: %d \n dano jogador 2: %d   ", rodadas, danoJogador1, danoJogador2);

        rodadas++;
        System.out.println("\n =================================");
    }

    private static int lancarDados() {
        return dado.nextInt(6);
    }

    public static String verificarVencedor(int jogador1Vida, int jogador2Vida) {

        if (jogador1Vida > 1 && jogador2Vida <= 0) {
            return "jogador 1 venceu";
        } else if (jogador2Vida > 1 && jogador1Vida <= 0) {
            return "jogador 2 venceu";
        } else
            return "EMPATE";



    }

}





