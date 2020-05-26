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
public interface Descricao {

    final String NOME_JOGO = "GAME_COVID V. 19";

    default String descricao() {
        return "";
    }
    
    
}
