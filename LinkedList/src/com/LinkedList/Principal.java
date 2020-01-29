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
public class Principal {

    public static void main(String[] args) {

        ListaDeCoisasConcretas lista = new ListaDeCoisasConcretas(null, null);
        lista.addElemento(new AlgumaCoisaConcreta(1, "A"));
        lista.mudaInicio(new AlgumaCoisaConcreta(2, "C"));
        lista.addElemento(new AlgumaCoisaConcreta(5, "E"));
        lista.addElemento(new AlgumaCoisaConcreta(10, "J"));
        lista.addElemento(new AlgumaCoisaConcreta(8, "H"));
        lista.printList();
        System.out.println("");
        System.out.println("");
        lista.removeElement(2);
        lista.printList();
    }

}
