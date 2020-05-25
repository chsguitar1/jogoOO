/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocasa.model;

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
    
}
