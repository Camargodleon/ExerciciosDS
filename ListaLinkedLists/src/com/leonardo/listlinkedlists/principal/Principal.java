/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardo.listlinkedlists.principal;

import com.leonardo.listalinkedlists.dados.Produto;
import com.leonardo.listalinkedlists.modelo.ListaProdutos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus Mendes
 */
public class Principal {

    public static void main(String[] args) {
        ListaProdutos lista = new ListaProdutos();
        //lerDados(lista, ".//src//com//leonardo//listalinkedlists//dados//produto.csv");
        Produto p = new Produto("limão", 12, 7f);
        lista.codeOrderedInsert(new Produto("mandioquinha", 25, 7.5f));
        lista.codeOrderedInsert(p);
        lista.codeOrderedInsert(new Produto("pão", 355, 10f));
        lista.codeOrderedInsert(new Produto("sabonete", 150, 10f));
        lista.codeOrderedInsert(new Produto("quitanda", 200, 6.5f));
        lista.codeOrderedInsert(new Produto("papel toalha", 5, 3.5f));
        lista.codeOrderedInsert(new Produto("kiwi", 55, 11f));
        lista.codeOrderedInsert(new Produto("maçã", 35, 2.8f));
        lista.codeOrderedInsert(new Produto("café", 30, 9.9f));

        lista.insertAfterSelectedCode(p, new Produto("carregador", 100, 15f));

        lista.insertBeforeSelectedCode(p, new Produto("Lápis", 99, 2f));
        
        lista.printList();
        

        
        
    }

    public static void lerDados(ListaProdutos lista, String arq) {
        try {
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados;
                dados = linha.split(";");
                Produto objetoProduto = new Produto(dados[1], Integer.parseInt(dados[0]), Float.parseFloat(dados[2]));
                lista.add(objetoProduto);

            }
        } catch (Exception erro) {
            System.out.println("Erro ao abrir o arquivo.");
        }

    }

}
