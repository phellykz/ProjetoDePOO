package br.com.projeto.entidades.negocio;

/**
 *
 * @author phell
 */
public class FabricaControlador {

    public static IControladorPessoa getInstancia() {
        return new ControladorPessoaImpl();
    }
}
