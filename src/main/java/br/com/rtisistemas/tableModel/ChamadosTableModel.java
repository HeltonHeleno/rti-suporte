/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtisistemas.tableModel;

import br.com.rtsistema.domain.Chamados;
import br.com.rtsistema.domain.Cliente;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Helton
 */
public class ChamadosTableModel extends br.tablemodel.TableModelBase<Chamados>{

    

    

    
    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public String getColumnName(int column) {
        String[] colunas = {"Codigo", "CPF", "Nome", "Problema Relatado"};
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Chamados obj = lista.get(rowIndex);
         switch (columnIndex) {
            case 0:
                return obj.getId();
            
        }
         return obj;
    }

  
    
}
