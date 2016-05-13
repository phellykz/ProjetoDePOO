package br.com.projeto.entidades.dao;

import br.com.projeto.entidades.Pessoa;
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

    protected DaoPessoa() {}

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
    public void remover(String email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pessoa consultar(String email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(String email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pessoa[] listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private File getFile(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}