/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.persistence;

import br.com.rtisistemas.tableModel.ChamadosTableModel;
import br.com.rtsistema.domain.Chamados;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Helton
 */
public class CadastroChamadosDao extends GenericDao<Chamados> {

    public CadastroChamadosDao() {
        super(Chamados.class);
    }

    public List<br.com.rtsistema.domain.Chamados> findChamadoFechado(Boolean situacao) {
        String hql = "from chamados  o where o.situacao = :situacao";
        Query q = getEm().createQuery(hql);
        q.setParameter("situacao", false);
        return q.getResultList();

    }

    public List<br.com.rtsistema.domain.Chamados> findChamadoAberto(Boolean situacao) {
        String hql = "from chamados  o where o.situacao = :situacao";
        Query q = getEm().createQuery(hql);
        q.setParameter("situacao", true);
        return q.getResultList();
    }

}
