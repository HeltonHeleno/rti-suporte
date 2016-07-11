/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtisistemas.tableModel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Helton
 * @param <T>
 */
public class AbstractComboModel<T> implements ComboBoxModel {

    private List<T> lista = new LinkedList<>();

    private T item;

    public AbstractComboModel(T[] items) {
        if (items != null) {
            lista.add((T) StringUtils.EMPTY);
            lista.addAll(Arrays.asList(items));
        }
    }

    @Override
    public void setSelectedItem(Object anItem) {
        item = (T) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return item;
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index).toString();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}

