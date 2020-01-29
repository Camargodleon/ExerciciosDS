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
public class Professor {

    private String matricula, nome, departamento, titulacao, contrato, data;

    public Professor(String str) {//permite construir um objeto dado uma string com essa formatação padrão
        String[] temp = str.split(";");
        matricula = temp[0];
        nome = temp[1];
        departamento = temp[2];
        titulacao = temp[3];
        contrato = temp[4];
        data = temp[5];
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    


}
