/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author leonardo
 */
public abstract class ProfessorTemplate {

    private String arquivo;

    public ProfessorTemplate() {
        arquivo = "C:\\Users\\Matheus Mendes\\Documents\\NetBeansProjects\\ProjetoTemplate\\src\\dados\\ProfessoresDaEscola2.csv";
    }

    public abstract boolean ePrimeiro(Professor prof1, Professor prof2);
    //busca os dados dos professores no arquivo
    public ArrayList<Professor> buscaProfessores() throws Exception {

        try {
            ArrayList<Professor> lista = new ArrayList<>();
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            String aux = "";
            int pos = 0;
            while ((linha = br.readLine()) != null) {
                Professor temp = new Professor(linha);//cria uma instancia de cada professor
                lista.add(temp);//e adiciona à lista de professores
                pos++;
            }
            br.close();
            return lista;
        } catch (Exception e) {
            
            throw e;
        }

    }
    //recebe o vetor com as instancias de professor e ordena ele
    public Iterator<Professor> ordenaListaProfessores(ArrayList<Professor> lista) {
        
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i; j < lista.size(); j++) {
                if (!ePrimeiro(lista.get(i), lista.get(j))) { //método implentado via Template Method
                    Professor temp = lista.get(j);
                    lista.set(j, lista.get(i));
                    lista.set(i, temp);
                }
            }

        }
        return lista.iterator();

    }

}
