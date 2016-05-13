package br.com.projeto.entidades.dao;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author phell
 */
public class DaoPessoa implements IDaoPessoa {

    private static final String FOLDER = "pessoas/";

    protected DaoPessoa() {
    }

    @Override
    public void reservar(Pessoa pessoa) throws ExcecaoNegocio {

        try {
            File file = getFile(pessoa.getCpf());
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(out);
            oout.writeObject(pessoa);

            oout.flush();
            oout.close();

        } catch (Exception ex) {
            throw new ExcecaoNegocio(ex.getMessage(), ex);
        }

    }

    @Override
    public void atualizar(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remover(String cpf) throws ExcecaoEntidadeNaoExistente {
        File arquivo = getFile(cpf);

        if (arquivo.exists()) {
            arquivo.delete();
        } else {
            throw new ExcecaoEntidadeNaoExistente();
        }
    }

    private File getFile(String email) {

        File directory = new File(FOLDER);
        directory.mkdirs();

        return new File(directory, email);
    }

    @Override
    public Pessoa consultar(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pessoa[] listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
