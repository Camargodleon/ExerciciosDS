/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.listaexercicios.model;

/**
 *
 * @author Matheus Mendes
 */
public class ListaInt {

    NodeInt inicio, fim;

    public ListaInt() {
    }

    public NodeInt getInicio() {
        return inicio;
    }

    public void setInicio(NodeInt inicio) {
        this.inicio = inicio;
    }

    public NodeInt getFim() {
        return fim;
    }

    public void setFim(NodeInt fim) {
        this.fim = fim;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(int i) {
        NodeInt novo = new NodeInt(i);

        if (isEmpty()) {
            inicio = novo;
            fim = inicio;
        } else {
            fim.setNextInt(novo);
            fim = novo;
        }
    }

    public void preenche(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            add(vetor[i]);
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            NodeInt aux = inicio;
            while (aux != null) {
                System.out.println(aux.getInteiro());
                aux = aux.getNextInt();
            }
        }
    }
    
    public ListaInt concatena(ListaInt l1, ListaInt l2){
        ListaInt nova = new ListaInt();
        NodeInt auxl2 = l2.getInicio();
        NodeInt auxl1 = l1.getInicio();
        
        while(auxl1 != null){
            nova.add(auxl1.getInteiro());
        }        
        while(auxl2 != null){
            nova.add(auxl2.getInteiro());
        }
        return nova;
    }
}
