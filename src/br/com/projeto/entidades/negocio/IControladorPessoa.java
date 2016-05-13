package br.com.projeto.entidades.negocio;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.excecoes.ExcecaoNegocio;
import br.com.projeto.excecoes.ExcecaoRegistroExistente;

/**
 *
 * @author Jefferson Coelho and Luiz Felix
 */
public interface IControladorPessoa {

    void inserir(Pessoa pessoa) throws ExcecaoRegistroExistente, ExcecaoNegocio;

    void atualizar(Pessoa pessoa);

    void remover(Pessoa pessoa);

    Pessoa[] listar();
}