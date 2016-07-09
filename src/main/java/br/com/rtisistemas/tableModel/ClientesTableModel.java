/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtisistemas.tableModel;

import br.com.rtsistema.domain.Cliente;

/**
 *
 * @author Helton
 */
public class ClientesTableModel extends br.tablemodel.TableModelBase<Cliente> {

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        String[] colunas = {"Codigo", "Nome", "IE", "CPF"};
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente obj = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return obj.getId();
            case 1:
                return obj.getNome();
            case 2:
                return obj.getIe();
            case 3:
                return obj.getCpf();
        }
        return obj;
    }

}
