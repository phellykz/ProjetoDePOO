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
public class ControladorPessoaImpl implements IControladorPessoa {

    protected ControladorPessoaImpl() {

    }

    @Override
    public void inserir(Pessoa pessoa) throws ExcecaoRegistroExistente, ExcecaoNegocio {
        IDaoPessoa dao = FabricaDao.getInstancia();

        if (dao.exists(pessoa.getCpf())) {
            throw new ExcecaoRegistroExistente();
        }
        dao.reservar(pessoa);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa[] listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
