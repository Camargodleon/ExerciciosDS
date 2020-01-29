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
public class ListaAlunos {

    NodeAlunos inicio, fim;

    public ListaAlunos() {
    }

    public NodeAlunos getInicio() {
        return inicio;
    }

    public void setInicio(NodeAlunos inicio) {
        this.inicio = inicio;
    }

    public NodeAlunos getFim() {
        return fim;
    }

    public void setFim(NodeAlunos fim) {
        this.fim = fim;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(Aluno aluno) {
        NodeAlunos newNode = new NodeAlunos(aluno);
        if (isEmpty()) {
            inicio = newNode;
            fim = inicio;

        } else {
            fim.setNextPos(newNode);
            fim = newNode;

        }
    }
    
    public void mudaInicio(Aluno aluno){
        NodeAlunos newNode = new NodeAlunos(aluno);
        if(isEmpty()){
            add(aluno);
        } else {
            newNode.setNextPos(inicio);
            inicio = newNode;
        }
    }

    public void codeOrderedInsert(Aluno aluno) {
        NodeAlunos newNode = new NodeAlunos(aluno);
        NodeAlunos aux = inicio;
        NodeAlunos anterior = null;
        if (isEmpty()) {
            add(aluno);
        } else {
            while (aux != null && newNode.getAluno().getMatricula()> aux.getAluno().getMatricula()) {
                anterior = aux;
                aux = aux.getNextPos();
            }
            if (aux == null) {
                add(newNode.getAluno());
            } else {
                if (anterior == null) {
                    mudaInicio(newNode.getAluno());
                } else {
                    anterior.setNextPos(newNode);
                    newNode.setNextPos(aux);
                }
            }

        }
    }

}
