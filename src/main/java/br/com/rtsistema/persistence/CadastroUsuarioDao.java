/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.persistence;

import br.com.rtsistema.domain.Usuario;

/**
 *
 * @author Helton
 */
public class CadastroUsuarioDao extends GenericDao<Usuario> {
    
    public CadastroUsuarioDao() {
        super(Usuario.class);
    }

    
}
