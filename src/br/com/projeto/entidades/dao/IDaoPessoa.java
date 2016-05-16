package br.com.projeto.entidades.dao;

import br.com.projeto.entidades.*;
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public interface IDaoPessoa<T> {

    void reservar(T pessoa) throws ExcecaoNegocio;

    void atualizar(String cpf) throws ExcecaoEntidadeNaoExistente;

    void remover(String cpf) throws ExcecaoEntidadeNaoExistente;

    T consultar(T pessoa);

    boolean exists(String cpf);

}
