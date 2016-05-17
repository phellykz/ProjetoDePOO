package br.com.projeto.entidades.negocio;

<<<<<<< HEAD
=======
import br.com.projeto.entidades.Pessoa;
>>>>>>> origin/master
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;
import br.com.projeto.excecoes.ExcecaoRegistroExistente;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public interface IControladorPessoa <T> {

    void inserir(T pessoa) throws ExcecaoRegistroExistente, ExcecaoNegocio;

    void atualizar(T pessoa) throws ExcecaoEntidadeNaoExistente;

    void remover(T pessoa) throws ExcecaoEntidadeNaoExistente ;

}