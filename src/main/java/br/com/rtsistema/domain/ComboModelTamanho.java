/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import br.com.rtisistemas.tableModel.AbstractComboModel;

/**
 *
 * @author Helton
 */
public class ComboModelTamanho extends AbstractComboModel<Classificacao> {

    public ComboModelTamanho() {
        super(Classificacao.values());
    }

}