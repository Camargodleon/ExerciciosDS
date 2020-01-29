/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.listaexercicios.model;

import com.leonardo.listaexercicios.dados.Paciente;

/**
 *
 * @author Matheus Mendes
 */
public class FilaPaciente {
    
    NodePaciente inicio, fim;

    public FilaPaciente() {
        
    }

    public NodePaciente getInicio() {
        return inicio;
    }

    public void setInicio(NodePaciente inicio) {
        this.inicio = inicio;
    }

    public NodePaciente getFim() {
        return fim;
    }

    public void setFim(NodePaciente fim) {
        this.fim = fim;
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    public void inLine(Paciente paciente){
        NodePaciente novo = new NodePaciente(paciente);
        
        if(isEmpty()){
            inicio = novo;
            fim = inicio;
        } else {
            fim.setNextPaciente(novo);
            fim = novo;
        }
    
    }
    
    public Paciente outLine(){
        NodePaciente aux = inicio;
        if(isEmpty()) return null;
        inicio = inicio.getNextPaciente();
        aux.setNextPaciente(null);
        return aux.getPaciente();
    }
    
    public Paciente peek(){
        if(isEmpty()) return null;
        return inicio.getPaciente();
    }
    
    public int count(){
        if(isEmpty()){
            return 0;
        }
        int pacientes = 0;
        NodePaciente aux = inicio;
        while(aux != null){
            pacientes++;
            aux = aux.getNextPaciente();
        }
        return pacientes;
    }
    
}
