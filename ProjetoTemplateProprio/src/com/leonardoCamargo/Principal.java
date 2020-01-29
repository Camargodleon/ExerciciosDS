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
public class Principal {
    
    
    public static void main(String[] args) {
        Solicitacao solicitacao;
        solicitacao = new SolicitacaoFiscal(LocalDateTime.now());
        solicitacao.alocaAnalista("Leonardo");
        System.out.println("Você tem até "+solicitacao.calculaTempoRestante()+" para finalizar o atendimento");
    }
}
