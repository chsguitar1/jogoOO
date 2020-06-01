
package jogocasa.model;

/**
 *
 * @author cristiano
 */
public class Jogador extends Personagem {

    public Jogador(String nome, Lugar lugar) {
        super(nome, lugar);
    }

    public void chora() {

    }

    public String getNome() {
        return  nome;
    }

}
