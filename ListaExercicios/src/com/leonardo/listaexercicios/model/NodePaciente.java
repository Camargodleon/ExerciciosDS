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
public class NodePaciente {
    
    Paciente paciente;
    NodePaciente nextPaciente;

    public NodePaciente(Paciente paciente) {
        this.paciente = paciente;
        
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public NodePaciente getNextPaciente() {
        return nextPaciente;
    }

    public void setNextPaciente(NodePaciente nextPaciente) {
        this.nextPaciente = nextPaciente;
    }
    
    
}
