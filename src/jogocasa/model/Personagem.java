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


public class Personagem  implements Descricao{
    
    private String nome;
    private Lugar lugar;
    private String acao;
    
//construção inicial de um jogador
    public Personagem(String nome, Lugar lugar) {
        this.nome = nome;
        this.lugar = lugar;
        lugar.getPersonagens().add(this);
    }
    
//construção de um npc
    public Personagem(String nome, Lugar lugar, String acao) {
        this.nome = nome;
        this.lugar = lugar;
        this.acao = acao;
        lugar.getPersonagens().add(this);
    }

    @Override
    public String descricao() {
        return "Olá "+getNome()+" você está em "+lugar.getDescricao();
    }
    
    
    
    public void morrer(){}
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome + ", lugar=" + lugar + ", acao=" + acao + '}';
    }
    
    
    
    
    
}
