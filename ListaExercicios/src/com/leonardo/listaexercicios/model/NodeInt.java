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
public class NodeInt {
    
    int inteiro;
    NodeInt nextInt;

    public NodeInt(int inteiro) {
        this.inteiro = inteiro;
    }

    public int getInteiro() {
        return inteiro;
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    public NodeInt getNextInt() {
        return nextInt;
    }

    public void setNextInt(NodeInt nextInt) {
        this.nextInt = nextInt;
    }
    
    
    
    
    
}
