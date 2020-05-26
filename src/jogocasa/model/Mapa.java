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
public class Mapa {

    private static Mapa instancia = new Mapa();

    public static Mapa getInstancia() {
        return instancia;
    }
    
    
    
    private Lugar lugarInicialJogador;
    private Lugar lugarInicialNpc;
    
    public Mapa() {
        criaLugares();
        
    }
      

    private void criaLugares() {
//cria Lugares
        Lugar sala = new Lugar("sala");
        Lugar copa = new Lugar("copa");
        Lugar corredor = new Lugar("corredor");
        Lugar cozinha = new Lugar("cozinha");
        Lugar quarto = new Lugar("quarto");
        Lugar banheiro = new Lugar("banheiro");
        
// criar portas dos lugares e direçoes        
        sala.setSul(copa);
        copa.setNorte(sala);
        copa.setSul(cozinha);
        cozinha.setNorte(copa);
        sala.setOeste(corredor);
        copa.setOeste(corredor);
        cozinha.setOeste(corredor);
        corredor.setLeste(copa);
        corredor.setNorte(quarto);
        quarto.setSul(corredor);
        corredor.setSul(banheiro);
        banheiro.setNorte(corredor);
        
// iniciar jogadores
        lugarInicialJogador = sala;
        lugarInicialNpc = banheiro;

    }

    public Lugar getLugarInicialJogador() {
        return lugarInicialJogador;
    }

    public Lugar getLugarInicialNpc() {
        return lugarInicialNpc;
    }
  
  

}
