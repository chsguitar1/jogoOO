/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocasa.model;

import java.util.Random;

/**
 *
 * @author cristiano
 */
public class Npc extends Personagem{
    
    static private Random r = new Random();
    
    static private String[] nomesIa = {"Dart Vader","Gandalf","Joker","Thanos"};
    static private String[] acoes = {"Matou voce", "Seguiu voce","Atirou"};
     
    
    public Npc(Lugar lugar){
        super(nomesIa[r.nextInt(nomesIa.length)]
                ,
                lugar,
                acoes[r.nextInt(acoes.length)]);
    }

    public static String[] getAcoes() {
        return acoes;
    }
    
    
    
}
