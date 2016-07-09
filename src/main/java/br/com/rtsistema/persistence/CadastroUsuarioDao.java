/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.persistence;


import br.com.rtsistema.domain.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Helton
 */
public class CadastroUsuarioDao extends GenericDao<Usuario> {
    
    public CadastroUsuarioDao() {
        super(Usuario.class);
    }

    public Usuario findUsuario(String usuario, String senha) {
        String hql="from Usuario o where o.usuario = :usuario and o.senha = :senha";
        Query q= getEm().createQuery(hql);
        q.setParameter("usuario", usuario);
        q.setParameter("senha", senha);
        List<Usuario> user =  q.getResultList();
        if(user.isEmpty()){
            return null;
        }
        return user.get(0);
    }
       
}
