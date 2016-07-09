/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Helton
 */
@Entity
public class Sistema implements  Serializable{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String sistema;
    private String versao;
    private boolean nfe;
    private boolean nfce;
    private boolean nfse;
    private boolean grade;
    private boolean moduloProducao;

    public boolean isNfe() {
        return nfe;
    }

    public void setNfe(boolean nfe) {
        this.nfe = nfe;
    }

    public boolean isNfce() {
        return nfce;
    }

    public void setNfce(boolean nfce) {
        this.nfce = nfce;
    }

    public boolean isNfse() {
        return nfse;
    }

    public void setNfse(boolean nfse) {
        this.nfse = nfse;
    }

    public boolean isGrade() {
        return grade;
    }

    public void setGrade(boolean grade) {
        this.grade = grade;
    }

    public boolean isModuloProducao() {
        return moduloProducao;
    }

    public void setModuloProducao(boolean moduloProducao) {
        this.moduloProducao = moduloProducao;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

}
