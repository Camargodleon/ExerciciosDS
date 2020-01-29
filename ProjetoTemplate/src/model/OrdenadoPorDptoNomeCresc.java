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
public class OrdenadoPorDptoNomeCresc extends ProfessorTemplate {

    public OrdenadoPorDptoNomeCresc() {
        super();
    }

    @Override
    public boolean ePrimeiro(Professor prof1, Professor prof2) {
        String strProf1 = prof1.getDepartamento()+prof1.getNome();
        String strProf2 = prof2.getDepartamento()+prof2.getNome();
        if(strProf1.compareToIgnoreCase(strProf2)<= 0) return true;
        else return false;
    }

}
