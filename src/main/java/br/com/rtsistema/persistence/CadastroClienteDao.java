/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.persistence;

import br.com.rtsistema.domain.Cliente;
import java.io.Serializable;

/**
 *
 * @author Helton
 */
public class CadastroClienteDao extends GenericDao<Cliente> {
    
    public CadastroClienteDao() {
        super(Cliente.class);
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
