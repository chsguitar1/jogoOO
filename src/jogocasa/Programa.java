package jogocasa;

import java.util.Scanner;
import jogocasa.model.Descricao;
import jogocasa.model.Jogador;
import jogocasa.model.Lugar;
import jogocasa.model.Mapa;
import jogocasa.model.Npc;
import jogocasa.model.Personagem;

public class Programa {

    static Scanner scanner;
    static Personagem npc;

    public static void main(String[] args) {
        System.out.println("------------- " + Descricao.NOME_JOGO + "--------------");
        scanner = new Scanner(System.in);
        Mapa mapa = Mapa.getInstancia();
        //cria um npc
        npc = new Npc(mapa.getLugarInicialNpc());
        setupJogador(mapa);

    }

    private static void setupJogador(Mapa mapa) {
        Personagem jogador = null;
        while (true) {
            if (jogador == null) {
                System.out.println("Informe o seu nome");
                String nome = scanner.next();
                if (nome.length() > 0) {
                    jogador = new Jogador(nome, mapa.getLugarInicialJogador());
                    startGame((Jogador) jogador);
                } else {
                    ///ponto
                    setupJogador(mapa);
                }
            } else {
                startGame((Jogador) jogador);
            }
        }

    }

    private static void startGame(Jogador jogador) {
        Lugar lc = jogador.getLugar();
        System.out.println(jogador.getNome());
        System.out.println("Você esta em " + lc.getDescricao() + " com " + lc.getPersonagens());
       
       
        
        if (lc.getPersonagens().size() >= 1) {
            boolean acao = true;

            if (npc.getAcao().equals("Atirou")) {
                acao = false;

            }else if(npc.getAcao().equals("Matou voce")){
                acao = false;
            }

            if (!acao) {
                System.out.println(npc.getNome() + " " + npc.getAcao());
                jogador.morrer();
                System.out.println("\\0/" + jogador.getNome() + " você morreu");
                System.exit(0);

            } else {
                System.out.println(npc.getNome() + " " + npc.getAcao());
            }

        }

        if (lc.getLeste() != null) {
            System.out.println("1) Para Leste " + lc.getLeste().getDescricao());
        }

        if (lc.getOeste() != null) {
            System.out.println("2) Para Oeste " + lc.getOeste().getDescricao());
        }
        if (lc.getNorte() != null) {
            System.out.println("3) Para Norte " + lc.getNorte().getDescricao());
        }

        if (lc.getSul() != null) {
            System.out.println("4) Para Sul " + lc.getSul().getDescricao());
        }

        System.out.println("5) Sair");

        int opcao = scanner.nextInt();

        if (opcao == 1 && lc.getLeste() != null) {
            jogador.setLugar(lc.getLeste());

        } else if (opcao == 2 && lc.getOeste() != null) {
            jogador.setLugar(lc.getOeste());

        } else if (opcao == 3 && lc.getNorte() != null) {
            jogador.setLugar(lc.getNorte());

        } else if (opcao == 4 && lc.getSul() != null) {
            jogador.setLugar(lc.getSul());

        } else if (opcao == 5) {
          //  System.gc();
            System.exit(0);
        }
    }

}
