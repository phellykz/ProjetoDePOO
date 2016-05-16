package br.com.projeto.entidades;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public class Cartao {

    private int numero;
    private String nomeCartao;
    private int codSeguranca;
    private String validade;
    private String tipoCartao;
    private String pessoaPagante;

    public Cartao() {
    }

    public Cartao(int numero, String nomeCartao, int codSeguranca, String validade, String tipoCartao, String pessoaPagante) {
        this.numero = numero;
        this.nomeCartao = nomeCartao;
        this.codSeguranca = codSeguranca;
        this.validade = validade;
        this.tipoCartao = tipoCartao;
        this.pessoaPagante = pessoaPagante;
    }

    public String getPessoaPagante() {
        return pessoaPagante;
    }

    public void setPessoaPagante(String pessoaPagante) {
        this.pessoaPagante = pessoaPagante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

}
