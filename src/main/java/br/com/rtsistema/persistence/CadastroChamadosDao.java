/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.persistence;

import br.com.rtsistema.domain.Chamados;



/**
 *
 * @author Helton
 */
public class CadastroChamadosDao extends GenericDao<Chamados> {
    public CadastroChamadosDao(){
        super(Chamados.class);
    }
}
