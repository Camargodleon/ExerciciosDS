/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardoCamargo;

import java.time.LocalDateTime;

/**
 *
 * @author Matheus Mendes
 */
public abstract class Solicitacao {
    
    
    
    protected LocalDateTime horaRegistro;
    
    
    public Solicitacao(){
            
    }
    
    public abstract LocalDateTime calculaTempoRestante();
    
    public void alocaAnalista(String analista){
        System.out.println("O analista responsável é o:"+analista);
    }
    
    
    
}
