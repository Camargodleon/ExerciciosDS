package model;

public class OrdenadoPorNomeCrescente extends ProfessorTemplate {

    public OrdenadoPorNomeCrescente() {
        super();
    }

    @Override
    public boolean ePrimeiro(Professor prof1, Professor prof2) {
        if(prof1.getNome().compareToIgnoreCase(prof2.getNome())<= 0) return true;
        else return false;
        
    }
}
