
package br.com.projeto.entidades.dao;

/**
 *
 * @author phell
 */
public class FabricaDao {
    public static IDaoPessoa getInstancia() {
        return new DaoPessoa();
    }    
    
}
