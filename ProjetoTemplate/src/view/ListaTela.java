/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.OrdenadoPorContDPtoNomeCresc;
import model.OrdenadoPorContDPtoNomeDecresc;
import model.OrdenadoPorDptoNomeCresc;
import model.OrdenadoPorDptoNomeDecresc;
import model.OrdenadoPorDptoTitulNomeCresc;
import model.OrdenadoPorDptoTitulNomeDecresc;
import model.OrdenadoPorMatriculaCrescente;
import model.OrdenadoPorMatriculaDecrescente;
import model.OrdenadoPorNomeCrescente;
import model.OrdenadoPorNomeDescrescente;
import model.OrdenadoPorTitulNomeCresc;
import model.OrdenadoPorTitulNomeDecresc;
import model.Professor;
import model.ProfessorTemplate;

public class ListaTela extends javax.swing.JFrame {

    public ListaTela() {
        initComponents();

    }

    //cria instancias temporárias de cada Professor e aloca eles na grid JÁ ORDENADOS
    private void imprimirNaGrid(Iterator<Professor> dados) {
        try {
            DefaultTableModel model = (DefaultTableModel) gridProfessores.getModel();
            model.setNumRows(0);
            while (dados.hasNext()) {
                String[] linha = new String[6];
                Professor obj = dados.next();
                linha[0] = obj.getMatricula();
                linha[1] = obj.getNome();
                linha[2] = obj.getDepartamento();
                linha[3] = obj.getTitulacao();
                linha[4] = obj.getContrato();
                linha[5] = obj.getData();
                model.addRow(linha);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridProfessores = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jBoxCrescente = new javax.swing.JComboBox();
        jBoxDecrescente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de Professores");

        jLabel2.setText("Ordenação Crescente");

        gridProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Departamento", "Titulação", "Contrato", "Data ???"
            }
        ));
        jScrollPane1.setViewportView(gridProfessores);

        jLabel3.setText("Ordenação Decrescente");

        jBoxCrescente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Matricula", "Dpto e Nome", "Titulo e Nome", "Dpto-Titul e Nome", "Cont-DPto e Nome" }));
        jBoxCrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxCrescenteActionPerformed(evt);
            }
        });

        jBoxDecrescente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Matricula", "Dpto e Nome", "Titulo e Nome", "Dpto-Titul e Nome", "Cont-DPto e Nome" }));
        jBoxDecrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxDecrescenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jBoxCrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jBoxDecrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBoxCrescente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBoxDecrescente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*                      A RESPEITO DA ARQUITETURA MVC DESTE PROJETO
    *Os dois métodos action performed abaixo chamam um método não estático
    * em suas implementações. Não consegui, ainda, pensar em uma forma de
    *fazer a separação view-controller por conta desse obstáculo.
    *Por esse motivo, considere esse trecho do código como sendo a controladora
    * mais que improvisada do projeto.
    */
    
    
    private void jBoxCrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxCrescenteActionPerformed
        int index = jBoxCrescente.getSelectedIndex();
        ProfessorTemplate obj;
        ArrayList<Professor> lista;
        try {
            switch (index) {
                case 0:
                    obj = new OrdenadoPorNomeCrescente();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 1:
                    obj = new OrdenadoPorMatriculaCrescente();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 2:
                    obj = new OrdenadoPorDptoNomeCresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 3:
                    obj = new OrdenadoPorTitulNomeCresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 4:
                    obj = new OrdenadoPorDptoTitulNomeCresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 5:
                    obj = new OrdenadoPorContDPtoNomeCresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Deu merda.\n" + e.getMessage());
        }
        
    }//GEN-LAST:event_jBoxCrescenteActionPerformed

    private void jBoxDecrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxDecrescenteActionPerformed
        int index = jBoxDecrescente.getSelectedIndex();
        ProfessorTemplate obj;
        ArrayList<Professor> lista;
        try {
            switch (index) {
                case 0:
                    obj = new OrdenadoPorNomeDescrescente();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 1:
                    obj = new OrdenadoPorMatriculaDecrescente();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 2:
                    obj = new OrdenadoPorDptoNomeDecresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 3:
                    obj = new OrdenadoPorTitulNomeDecresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 4:
                    obj = new OrdenadoPorDptoTitulNomeDecresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
                case 5:
                    obj = new OrdenadoPorContDPtoNomeDecresc();
                    lista = obj.buscaProfessores();
                    imprimirNaGrid(obj.ordenaListaProfessores(lista));
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Deu merda.\n" + e.getMessage());
        }
        
    }//GEN-LAST:event_jBoxDecrescenteActionPerformed

    /*
     FIM DO TRECHO QUE ATUA COMO CONTROLADORA
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gridProfessores;
    private javax.swing.JComboBox jBoxCrescente;
    private javax.swing.JComboBox jBoxDecrescente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
