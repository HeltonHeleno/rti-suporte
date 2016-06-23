/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Helton
 */
@Entity
public class Chamados implements Serializable {
    
    
    @Id 
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
   private String reclamante;
   private Date data;
   private String problemaRelatado;
   private String dadosAnalisado;
   private String possivelSolucao;
   private String solucaoAplicada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReclamante() {
        return reclamante;
    }

    public void setReclamante(String reclamante) {
        this.reclamante = reclamante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getProblemaRelatado() {
        return problemaRelatado;
    }

    public void setProblemaRelatado(String problemaRelatado) {
        this.problemaRelatado = problemaRelatado;
    }

    public String getDadosAnalisado() {
        return dadosAnalisado;
    }

    public void setDadosAnalisado(String dadosAnalisado) {
        this.dadosAnalisado = dadosAnalisado;
    }

    public String getPossivelSolucao() {
        return possivelSolucao;
    }

    public void setPossivelSolucao(String possivelSolucao) {
        this.possivelSolucao = possivelSolucao;
    }

    public String getSolucaoAplicada() {
        return solucaoAplicada;
    }

    public void setSolucaoAplicada(String solucaoAplicada) {
        this.solucaoAplicada = solucaoAplicada;
    }
   
    
}
