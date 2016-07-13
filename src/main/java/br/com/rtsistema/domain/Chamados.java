/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Helton
 */
@Entity
public class Chamados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reclamante;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private String problemaRelatado;
    private String dadosAnalisado;
    private String possivelSolucao;
    private String solucaoAplicada;
    private Boolean situacao;
    
    @Enumerated(EnumType.STRING)
    private Classificacao classificacao;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Usuario usuario;

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    public Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
