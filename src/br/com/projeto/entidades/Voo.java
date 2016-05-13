package br.com.projeto.entidades;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public class Voo {

    private String destino;
    private String origem;
    private String tipoDeVoo;

    public Voo() {
    }

    public Voo(String destino, String origem, String tipoDeVoo) {
        this.destino = destino;
        this.origem = origem;
        this.tipoDeVoo = tipoDeVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTipoDeVoo() {
        return tipoDeVoo;
    }

    public void setTipoDeVoo(String tipoDeVoo) {
        this.tipoDeVoo = tipoDeVoo;
    }

}
