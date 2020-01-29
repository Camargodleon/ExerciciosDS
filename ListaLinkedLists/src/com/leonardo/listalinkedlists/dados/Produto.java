/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.listalinkedlists.dados;

/**
 *
 * @author Matheus Mendes
 */
public class Produto {
    
    String nome;
    int codigo;
    float preco;

    public Produto(String nome, int codigo, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public String toString(){
        return "Produto de código "+getCodigo()+", "+getNome()+". Preço: "+getPreco();
    }
    
}