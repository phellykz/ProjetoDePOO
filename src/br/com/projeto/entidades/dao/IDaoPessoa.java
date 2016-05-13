package br.com.projeto.entidades.dao;

import br.com.projeto.entidades.*;
import br.com.projeto.excecoes.ExcecaoNegocio;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public interface IDaoPessoa {

    void reservar(Pessoa pessoa)throws ExcecaoNegocio;
    // throws ExcecaoNegocio ;

    void atualizar(Pessoa pessoa);

    void remover(String email);

    Pessoa consultar(String email);

    boolean exists(String email);

    Pessoa[] listar();

}
