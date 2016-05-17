package br.com.projeto.entidades.negocio;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.entidades.dao.DaoPessoa;
import br.com.projeto.entidades.dao.FabricaDao;
import br.com.projeto.entidades.dao.IDaoPessoa;
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;
import br.com.projeto.excecoes.ExcecaoRegistroExistente;

/**
 *
 * @author phell
 * @param <T>
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

    @Override
    public void atualizar(T pessoa)throws ExcecaoEntidadeNaoExistente {
        IDaoPessoa dao = FabricaDao.getInstancia();
        
        if(dao.exists(pessoa.getCpf())){
            dao.atualizar(pessoa.getCpf());
        } else {
            throw new ExcecaoEntidadeNaoExistente();    
        }
        
    }

    @Override
    public void remover(T pessoa) {
        
    }

}
