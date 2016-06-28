/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rtsistema.views;

import br.com.rtsistema.domain.Sistema;
import br.com.rtsistema.persistence.CadastroSistemaDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Helton
 */
public class CadastroSistema extends javax.swing.JDialog {

    /**
     * Creates new form CadastroSistema
     */
    public CadastroSistema() {
        initComponents();
        setModal(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLSistema = new javax.swing.JLabel();
        jtSistema = new javax.swing.JTextField();
        jLVersao = new javax.swing.JLabel();
        jTVersao = new javax.swing.JTextField();
        jCnfe = new javax.swing.JCheckBox();
        jLModeloNotas = new javax.swing.JLabel();
        jCNfce = new javax.swing.JCheckBox();
        jCNfse = new javax.swing.JCheckBox();
        jLConfiguracaoSistema = new javax.swing.JLabel();
        jCGrade = new javax.swing.JCheckBox();
        jCModuloProd = new javax.swing.JCheckBox();
        jBCancelar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Sistema");

        jLSistema.setText("Sistema:");

        jLVersao.setText("Versão:");

        jCnfe.setText("NF-e");

        jLModeloNotas.setText("Modelo de Notas:");

        jCNfce.setText("NFC-e");

        jCNfse.setText("NFS-e");

        jLConfiguracaoSistema.setText("Configurações do Sistema:");

        jCGrade.setText("Grade");

        jCModuloProd.setText("Modulo de Produção");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLConfiguracaoSistema)
                    .addComponent(jLVersao)
                    .addComponent(jLSistema)
                    .addComponent(jLModeloNotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCnfe)
                        .addGap(10, 10, 10)
                        .addComponent(jCNfce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCNfse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCModuloProd)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSistema)
                    .addComponent(jtSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVersao)
                    .addComponent(jTVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLModeloNotas)
                    .addComponent(jCnfe)
                    .addComponent(jCNfce)
                    .addComponent(jCNfse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCGrade)
                    .addComponent(jLConfiguracaoSistema)
                    .addComponent(jCModuloProd))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/forbidden.png"))); // NOI18N

        jBConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/check.png"))); // NOI18N
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBConfirmar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        salvar();
    }//GEN-LAST:event_jBConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JCheckBox jCGrade;
    private javax.swing.JCheckBox jCModuloProd;
    private javax.swing.JCheckBox jCNfce;
    private javax.swing.JCheckBox jCNfse;
    private javax.swing.JCheckBox jCnfe;
    private javax.swing.JLabel jLConfiguracaoSistema;
    private javax.swing.JLabel jLModeloNotas;
    private javax.swing.JLabel jLSistema;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTVersao;
    private javax.swing.JTextField jtSistema;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        Sistema sistema = new Sistema();
        sistema.setSistema(jtSistema.getText());
        sistema.setVersao(jTVersao.getText());
        CadastroSistemaDao cdSistemaDao = new CadastroSistemaDao();
        cdSistemaDao.salvar(sistema);
        JOptionPane.showMessageDialog(null, "Operação Salva com sucesso!");
        jtSistema.setText("");
        jTVersao.setText("");
    }

}
