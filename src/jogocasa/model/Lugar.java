/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocasa.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristiano
 */
public class Lugar {
    
    private String descricao;
    private Lugar norte;
    private Lugar sul;
    private Lugar leste;
    private Lugar oeste;
    
    private List<String> mensagens;
    
    private List<Personagem> personagens;

    public Lugar(String descricao) {
        this.descricao = descricao;
        mensagens = new ArrayList<>();
        personagens = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lugar getNorte() {
        return norte;
    }

    public void setNorte(Lugar norte) {
        this.norte = norte;
    }

    public Lugar getSul() {
        return sul;
    }

    public void setSul(Lugar sul) {
        this.sul = sul;
    }

    public Lugar getLeste() {
        return leste;
    }

    public void setLeste(Lugar leste) {
        this.leste = leste;
    }

    public Lugar getOeste() {
        return oeste;
    }

    public void setOeste(Lugar oeste) {
        this.oeste = oeste;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

//    @Override
//    public String toString() {
//        return "Lugar{" + "descricao=" + descricao + ", norte=" + norte + ", sul=" + sul + ", leste=" + leste + ", oeste=" + oeste + ", mensagens=" + mensagens + ", personagens=" + personagens + '}';
//    }
    
    
    
    
    
    
    
}
