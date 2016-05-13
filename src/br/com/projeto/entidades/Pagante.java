package br.com.projeto.entidades;

/**
 *
 * @author phell
 */
public class Pagante {

    private Cartao cartao;

    public Pagante() {
    }

    public Pagante(Cartao cartao) {
        this.cartao = cartao;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

}
