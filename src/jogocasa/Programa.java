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
        npc = new Npc(mapa.getLugarInicialNpc());

        System.out.println("npc= " + npc.getNome());
        System.out.println("npc= " + npc.getAcao());

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
                    startGame((Jogador)jogador);
                }else{
                    ///ponto
                    setupJogador(mapa);
                }
            }else{
                startGame((Jogador)jogador);
            }
        }

    }
    
    private static void startGame(Jogador jogador){
     Lugar lc = jogador.getLugar();
        System.out.println(jogador.getNome());
        System.out.println("Você esta em "+lc.getDescricao()+" com "+lc.getPersonagens());
    }

}
