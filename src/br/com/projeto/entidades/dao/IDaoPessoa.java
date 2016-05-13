package br.com.projeto.entidades.dao;

import br.com.projeto.entidades.*;
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public interface IDaoPessoa {

    void reservar(Pessoa pessoa)throws ExcecaoNegocio;

    void atualizar(Pessoa pessoa);

    void remover(String cpf)throws ExcecaoEntidadeNaoExistente;

    Pessoa consultar(Pessoa pessoa);

    boolean exists(String cpf);

    Pessoa[] listar();

}
