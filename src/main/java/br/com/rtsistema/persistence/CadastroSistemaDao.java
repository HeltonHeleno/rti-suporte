
package br.com.rtsistema.persistence;

import br.com.rtsistema.domain.Sistema;

/**
 *
 * @author Helton
 */
public class CadastroSistemaDao extends  GenericDao<Sistema>{
    
    public CadastroSistemaDao() {
        super(Sistema.class);
    }
    
}
