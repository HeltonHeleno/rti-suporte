/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Helton
 */
@Entity
public class Cliente implements Serializable {
    
    @Id 
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String fantasia;
    private String cpf;
    private String ie;
    private String ssp;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date expedicao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cadastro;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Email> email = new ArrayList<>();
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Telefone telefone;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Sistema sistema;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getSsp() {
        return ssp;
    }

    public void setSsp(String ssp) {
        this.ssp = ssp;
    }

    public Date getExpedicao() {
        return expedicao;
    }

    public void setExpedicao(Date expedicao) {
        this.expedicao = expedicao;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public class getEmail {

        

       

        public getEmail() {
        }
    }

   
    
           
    
}
