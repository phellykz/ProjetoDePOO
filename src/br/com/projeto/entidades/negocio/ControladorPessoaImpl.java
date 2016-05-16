package br.com.projeto.entidades.negocio;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.entidades.dao.FabricaDao;
import br.com.projeto.entidades.dao.IDaoPessoa;
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;
import br.com.projeto.excecoes.ExcecaoRegistroExistente;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public void remover(T pessoa) throws ExcecaoEntidadeNaoExistente {

    }

    @Override
    public void atualizar(T pessoa) throws ExcecaoRegistroExistente {
        IDaoPessoa dao = FabricaDao.getInstancia();

        if (dao.exists(pessoa.getCpf())) {
            throw new ExcecaoRegistroExistente();
        }
        try {
            dao.atualizar(pessoa);
        } catch (ExcecaoEntidadeNaoExistente ex) {
            Logger.getLogger(ControladorPessoaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
