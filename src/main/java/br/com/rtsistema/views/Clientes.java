/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.views;

import br.com.rtisistemas.tableModel.ClientesTableModel;
import br.com.rtsistema.domain.Cliente;
import br.com.rtsistema.persistence.CadastroClienteDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Helton
 */
public class Clientes extends javax.swing.JDialog {

    ClientesTableModel clTableModel = new ClientesTableModel();
    private List<Cliente> clientes;

    public Clientes() {
        initComponents();
        CadastroClienteDao cdClienteDao = new CadastroClienteDao();
        clientes = cdClienteDao.findAll();
        clTableModel.setLista(clientes);
        jTCliente.setModel(clTableModel);
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMArquivo = new javax.swing.JMenu();
        jMnovo = new javax.swing.JMenuItem();
        jMAlterar = new javax.swing.JMenuItem();
        jMAtualizarStatus = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMFiltrosPersonalizados = new javax.swing.JMenu();
        jMGerenciar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTCliente);

        jMArquivo.setText("Arquivo");

        jMnovo.setText("Novo");
        jMnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnovoActionPerformed(evt);
            }
        });
        jMArquivo.add(jMnovo);

        jMAlterar.setText("Alterar");
        jMAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlterarActionPerformed(evt);
            }
        });
        jMArquivo.add(jMAlterar);

        jMAtualizarStatus.setText("Atualizar Status");
        jMAtualizarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAtualizarStatusActionPerformed(evt);
            }
        });
        jMArquivo.add(jMAtualizarStatus);

        jMenuBar1.add(jMArquivo);

        jMenu2.setText("Localizar");
        jMenuBar1.add(jMenu2);

        jMFiltrosPersonalizados.setText("Filtros Personalizados");

        jMGerenciar.setText("Gerenciar");
        jMFiltrosPersonalizados.add(jMGerenciar);

        jMenuBar1.add(jMFiltrosPersonalizados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnovoActionPerformed
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jMnovoActionPerformed

    private void jMAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlterarActionPerformed
        Cliente cliente = clTableModel.getValue(jTCliente.getSelectedRow());
        CadastroCliente cadastroCliente = new CadastroCliente(cliente);

    }//GEN-LAST:event_jMAlterarActionPerformed

    private void jMAtualizarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAtualizarStatusActionPerformed

    }//GEN-LAST:event_jMAtualizarStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMAlterar;
    private javax.swing.JMenu jMArquivo;
    private javax.swing.JMenuItem jMAtualizarStatus;
    private javax.swing.JMenu jMFiltrosPersonalizados;
    private javax.swing.JMenuItem jMGerenciar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCliente;
    // End of variables declaration//GEN-END:variables

}
