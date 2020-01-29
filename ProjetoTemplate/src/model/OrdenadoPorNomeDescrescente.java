/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leonardo
 */
public class OrdenadoPorNomeDescrescente extends ProfessorTemplate{

    public OrdenadoPorNomeDescrescente() {
        super();
    }

    
    
    @Override
    public boolean ePrimeiro(Professor prof1, Professor prof2) {
        if(prof1.getNome().compareToIgnoreCase(prof2.getNome())>= 0)return true;
        else return false;
    }
    
}
