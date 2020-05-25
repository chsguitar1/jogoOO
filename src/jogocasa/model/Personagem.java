/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocasa.model;

/**
 *
 * @author cristiano
 */
public class Personagem {
    
    private String nome;
    private Lugar lugar;
    private String acao;
    
//construção inicial de um jogador
    public Personagem(String nome, Lugar lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }
    
//construção de um npc
    public Personagem(String nome, Lugar lugar, String acao) {
        this.nome = nome;
        this.lugar = lugar;
        this.acao = acao;
    }
    
    
    
    
    
    
}
