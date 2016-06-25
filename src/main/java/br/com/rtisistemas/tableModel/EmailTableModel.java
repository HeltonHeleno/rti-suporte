/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtisistemas.tableModel;

import br.com.rtsistema.domain.Email;
import br.com.rtsistema.domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Helton
 */
public class EmailTableModel extends AbstractTableModel{

    List<Email> lista = new ArrayList<Email>();

    @Override
    public int getRowCount() {
        return lista.size();
     }

    @Override
    public int getColumnCount() {
        return 1;
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Email user = lista.get(rowIndex);
        return user;
    }

    @Override
    public String getColumnName(int column) {
        return "Email";
    }

    public void setLista(List<Email> lista) {
        this.lista = lista;
    }
    
    
    
}
