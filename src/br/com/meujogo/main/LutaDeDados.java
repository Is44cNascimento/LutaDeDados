package br.com.meujogo.main;



import static br.com.meujogo.main.Funcionalidade.*;

public class LutaDeDados {




    public static void iniciar() {


        Funcionalidade jogo = new Funcionalidade();
        boolean continuar = true;

        while (continuar) {



            if(getJogador1Vida() > 0 && getJogador2Vida() > 0 ) {


                jogo.turno();




            } else {
                continuar = false;

            }

            setRodadas(getRodadas() + 1);

        }

        System.out.printf("\n Rodadas: %d \n Dano Jogador 1:%d \n Dano Jogador 2:%d \n", getRodadas(),getDanoJogador1(), getDanoJogador2() );
        System.out.print(jogo.verificarVencedor(getJogador1Vida(), getJogador2Vida()));

    }




}
