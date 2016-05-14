package br.com.projeto.entidades;

/**
 *
 * @author phell
 * testando porra!!!
 * 
 */
public class Adulto extends Pessoa {

    private String rg;

    public Adulto(String rg, String nome, int idade, Voo voo, boolean mala, int quantidadeMala, String cpf) {
        super(nome, idade, voo, mala, quantidadeMala, cpf);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
