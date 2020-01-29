/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LinkedList;

/**
 *
 * @author Matheus Mendes
 */
public class ListaDeCoisasConcretas {

    Elemento inicio, fim;

    public ListaDeCoisasConcretas(Elemento inicio, Elemento fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Elemento getInicio() {
        return inicio;
    }

    public void setInicio(Elemento inicio) {
        this.inicio = inicio;
    }

    public Elemento getFim() {
        return fim;
    }

    public void setFim(Elemento fim) {
        this.fim = fim;
    }
    //o padrão é inserir ao final

    public boolean nullList() {
        if (inicio == null && fim == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addElemento(AlgumaCoisaConcreta elemento) {

        Elemento novoElemento = new Elemento(elemento, null);
        if (nullList()) {
            inicio = novoElemento;
            inicio.setNext(fim);
            fim = novoElemento;
        } else {
            fim.setNext(novoElemento);
        }
        fim = novoElemento;
    }

    public void mudaInicio(AlgumaCoisaConcreta elemento) {
        Elemento novoElemento = new Elemento(elemento, null);
        if (nullList()) {
            inicio = novoElemento;
            fim = novoElemento;
        } else {
            novoElemento.setNext(inicio);
        }
        inicio = novoElemento;
    }

    public void printList() {
        Elemento atual = inicio;
        while (atual != null) {
            System.out.println(atual.getElemento().getUmaString() + " || " + atual.getElemento().getUmInteiro());
            atual = atual.getNext();
        }
    }

    public void removeElement(int elemento) {
        Elemento atual = inicio;
        Elemento anterior = inicio;
        while (atual != null) {
            if (!(atual.getElemento().getUmInteiro() == elemento)) {
                anterior = atual;
                atual = atual.getNext();
            } else {
                anterior.setNext(atual.getNext());
                atual = null;
            }
        }
    }

}
