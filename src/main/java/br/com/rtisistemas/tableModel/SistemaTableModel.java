/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtisistemas.tableModel;

import br.com.rtsistema.domain.Sistema;

/**
 *
 * @author Helton
 */
public class SistemaTableModel extends br.tablemodel.TableModelBase<Sistema> {

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        String[] colunas = {"Codigo", "Nome", "versão"};
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sistema obj = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return obj.getId();
            case 1:
                return obj.getSistema();
            case 2:
                return obj.getVersao();

        }
        return obj;
    }

}
