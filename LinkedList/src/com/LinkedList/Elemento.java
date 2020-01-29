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
public class Elemento {

    AlgumaCoisaConcreta elemento;
    Elemento proximoElemento;

    public Elemento(AlgumaCoisaConcreta elemento, Elemento proximoElemento) {
        this.elemento = elemento;
        this.proximoElemento = proximoElemento;
    }

    public AlgumaCoisaConcreta getElemento() {
        return elemento;
    }

    public void setElemento(AlgumaCoisaConcreta elemento) {
        this.elemento = elemento;
    }

    public Elemento getNext() {
        return proximoElemento;
    }

    public void setNext(Elemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }

    

}
