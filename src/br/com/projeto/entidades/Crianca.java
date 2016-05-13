package br.com.projeto.entidades;

/**
 *
 * @author phell
 */
public class Crianca extends Pessoa {

    private String CertidaoDeNascimento;

    public Crianca(String nome, int idade, Voo voo, boolean mala, int quantidadeMala, String cpf) {
        super(nome, idade, voo, mala, quantidadeMala, cpf);
    }

    public String getCertidaoDeNascimento() {
        return CertidaoDeNascimento;
    }

    public void setCertidaoDeNascimento(String CertidaoDeNascimento) {
        this.CertidaoDeNascimento = CertidaoDeNascimento;
    }
}
