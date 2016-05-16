package br.com.projeto.entidades.negocio;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.excecoes.ExcecaoNegocio;
import br.com.projeto.excecoes.ExcecaoRegistroExistente;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public interface IControladorPessoa <T> {

    void inserir(T pessoa) throws ExcecaoRegistroExistente, ExcecaoNegocio;

    void atualizar(T pessoa) throws ExcecaoRegistroExistente;

    void remover(T pessoa);

}