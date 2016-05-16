package br.com.projeto.entidades.dao;

import br.com.projeto.entidades.Pessoa;
import br.com.projeto.excecoes.ExcecaoEntidadeNaoExistente;
import br.com.projeto.excecoes.ExcecaoNegocio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author phell
 */
public class DaoPessoa<T extends Pessoa> implements IDaoPessoa<T> {

    private Class<T> type;

    public DaoPessoa(Class<T> type) {
        this.type = type;
    }

    private static final String FOLDER = "pessoas/";
    private String email;

    protected DaoPessoa() {
    }

    @Override
    public void reservar(T pessoa) throws ExcecaoNegocio {

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
    public void atualizar(T pessoa) throws ExcecaoEntidadeNaoExistente {
       //Falta a implementação.
        //Tendo que aqui só ira manipular o arquivo.
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
    public T consultar(T pessoa) {
        pessoa = null;

        try {
            File file = getFile(email);
            if (!file.exists()) {
                throw new ExcecaoEntidadeNaoExistente();
            }

            InputStream in = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(in);
            pessoa = (T) oin.readObject();

            oin.close();
            in.close();
        } catch (Exception ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pessoa;
    }

    @Override
    public boolean exists(String cpf) {
        File file = getFile(email);
        return file.exists();
    }

}
