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
public class Node {
    
    Produto elemento;
    Node nextPos;

    public Node(Produto elemento) {
        this.elemento = elemento;
    }

    public Produto getElemento() {
        return elemento;
    }

    public void setElemento(Produto elemento) {
        this.elemento = elemento;
    }

    public Node getNextPos() {
        return nextPos;
    }

    public void setNextPos(Node nextPos) {
        this.nextPos = nextPos;
    }
    
    
}
