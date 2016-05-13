package br.com.projeto.entidades;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public class Pessoa {

    private String nome;
    private int idade;
    private Voo voo;
    private boolean mala;
    private int quantidadeMala;
    private String cpf;

    public Pessoa(String nome, int idade, Voo voo, boolean mala, int quantidadeMala, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.voo = voo;
        this.mala = mala;
        this.quantidadeMala = quantidadeMala;
        this.cpf = cpf;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public boolean isMala() {
        return mala;
    }

    public void setMala(boolean mala) {
        this.mala = mala;
    }

    public int getQuantidadeMala() {
        return quantidadeMala;
    }

    public void setQuantidadeMala(int quantidadeMala) {
        this.quantidadeMala = quantidadeMala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
}
