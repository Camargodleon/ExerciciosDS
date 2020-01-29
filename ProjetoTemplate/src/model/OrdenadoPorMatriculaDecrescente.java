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
public class OrdenadoPorMatriculaDecrescente extends ProfessorTemplate{

    public OrdenadoPorMatriculaDecrescente() {
        super();
    }

    @Override
    public boolean ePrimeiro(Professor prof1, Professor prof2) {
        if(Integer.parseInt(prof1.getMatricula()) >= Integer.parseInt(prof2.getMatricula())) return true;
        else return false;
    }
    
    
}
