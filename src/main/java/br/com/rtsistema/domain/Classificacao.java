/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

/**
 *
 * @author Helton
 */
public enum Classificacao {

    ERRO("Erro"),
    TREINAMENTO("Treinamento"),
    DUVIDA("Dúvida"),
    IMPLEMENTACAO("Implementação"),
    ATUALIZACAO("Atualização");

    private final String descricao;

    Classificacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
