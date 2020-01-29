/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.listalinkedlists.modelo;

import com.leonardo.listalinkedlists.dados.Produto;

/**
 *
 * @author Matheus Mendes
 */
public class ListaProdutos {

    Node inicio, fim;

    public ListaProdutos() {
    }

    public Node getInicio() {
        return inicio;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }

    public Node getFim() {
        return fim;
    }

    public void setFim(Node fim) {
        this.fim = fim;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(Produto produto) {
        Node node = new Node(produto);
        if (isEmpty()) {
            inicio = node;
            fim = inicio;
        } else {
            fim.setNextPos(node);
            fim = node;
        }
    }

    public void mudaInicio(Produto produto) {
        Node node = new Node(produto);
        if (isEmpty()) {
            add(produto);
        } else {
            node.setNextPos(inicio);
            inicio = node;
        }
    }

    public void codeOrderedInsert(Produto produto) {
        Node newNode = new Node(produto);
        Node aux = inicio;
        Node anterior = null;
        if (isEmpty()) {
            add(produto);
        } else {
            while(aux != null && newNode.getElemento().getCodigo()  > aux.getElemento().getCodigo()){
                anterior = aux;
                aux = aux.getNextPos();
            }
            if(aux == null){
                add(newNode.getElemento());
            }else{
                if(anterior == null){
                    mudaInicio(newNode.getElemento());
                }else{
                    anterior.setNextPos(newNode);
                    newNode.setNextPos(aux);
                }
            }
            

        }
    }

    public void insertAfterSelectedCode(Produto parametro, Produto novo) {
        Node newNode = new Node(novo);
        if (isEmpty()) {
            add(novo);
        } else {
            Node aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getCodigo() == parametro.getCodigo()) {
                    newNode.setNextPos(aux.getNextPos());
                    aux.setNextPos(newNode);
                    aux = null;
                } else {
                    aux = aux.getNextPos();
                }
            }
        }
    }

    public void insertBeforeSelectedCode(Produto parametro, Produto novo) {
        Node newNode = new Node(novo);

        Node anterior = inicio;
        Node aux = anterior.getNextPos();
        if (aux == null) {
            mudaInicio(parametro);
        }

        while (aux != null) {
            if (aux.getElemento().getCodigo() != parametro.getCodigo()) {
                anterior = anterior.getNextPos();
                aux = aux.getNextPos();
            } else {
                newNode.setNextPos(aux);
                anterior.setNextPos(newNode);
                aux = null;
            }
        }
    }

    public void printList() {
        Node aux = inicio;
        while (aux != null) {
            System.out.println(aux.getElemento().toString());
            aux = aux.getNextPos();
        }

    }

}
