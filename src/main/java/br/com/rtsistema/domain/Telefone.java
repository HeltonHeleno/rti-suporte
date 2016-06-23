/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Helton
 */
@Entity
public class Telefone {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private int ddd;
    private String telefone1;
    private String telefone2;
    private String celular;
    private String contato;
    
}
