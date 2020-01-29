/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.listalinkedlists.modelo;

import com.leonardo.listalinkedlists.dados.Aluno;

/**
 *
 * @author Matheus Mendes
 */
public class NodeAlunos {
    
    Aluno aluno;
    NodeAlunos nextPos;

    public NodeAlunos(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public NodeAlunos getNextPos() {
        return nextPos;
    }

    public void setNextPos(NodeAlunos nextPos) {
        this.nextPos = nextPos;
    }
    
    
}
