package br.com.projeto.entidades.negocio;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.entidades.dao.FabricaDao;
import br.com.projeto.entidades.dao.IDaoPessoa;
import br.com.projeto.excecoes.ExcecaoNegocio;
import br.com.projeto.excecoes.ExcecaoRegistroExistente;

/**
 *
 * @author phell
 */
public class ControladorPessoaImpl<T extends Pessoa> implements IControladorPessoa<T> {

    private Class<T> type;

    public ControladorPessoaImpl(Class<T> type) {
        this.type = type;
    }

    protected ControladorPessoaImpl() {

    }

    @Override
    public void inserir(T pessoa) throws ExcecaoRegistroExistente, ExcecaoNegocio {
        IDaoPessoa dao = FabricaDao.getInstancia();

        if (dao.exists(pessoa.getCpf())) {
            throw new ExcecaoRegistroExistente();
        }
        dao.reservar(pessoa);
    }
/*
    @Override
    public void atualizar(T pessoa)throws ExcecaoRegistroExistente {
        
        if(dao.exists(pessoa.getEmail())){
            throw new ExcecaoRegistroExistente();
        }
        dao.atualizar(pessoa);
    }
*/
    @Override
    public void remover(T pessoa) {
        
    }

}
