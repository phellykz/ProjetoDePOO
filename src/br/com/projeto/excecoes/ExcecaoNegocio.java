package br.com.projeto.excecoes;

/**
 *
 * @author Jefferson Coelho
 */
public class ExcecaoNegocio extends ExcecaoEntidadeNaoExistente {

    public ExcecaoNegocio() {
        super("Ocorreu um erro interno");
    }

    public ExcecaoNegocio(String message) {
        super(message);
    }

    public ExcecaoNegocio(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcecaoNegocio(Throwable cause) {
        super(cause);
    }

    public ExcecaoNegocio(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}