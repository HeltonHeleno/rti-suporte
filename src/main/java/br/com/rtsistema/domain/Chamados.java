/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Helton
 */
@Entity
public class Chamados {
    
    
      @Id 
    @GeneratedValue
    private Long id;
    
   private String reclamante;
   private Date data;
   private String problemaRelatado;
   private String dadosAnalisado;
   private String possivelSolucao;
   private String solucaoAplicada;
   
    
}
