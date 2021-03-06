/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfac.Att;
import classes.Drink;
import classes.LaCarte;
import classes.Restaurante;
import classes.SelfService;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 * <161080391>
 */
public class TelaEscolhaRestaurante extends javax.swing.JFrame implements Att{

    /**
     * Creates new form TelaEscolhaRestaurante
     */
    public TelaEscolhaRestaurante() {
        initComponents();
    }
    static double valorl,valorss;
    static int valorb;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btlacarte = new javax.swing.JButton();
        btss = new javax.swing.JButton();
        brbebidas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        valortotal = new javax.swing.JFormattedTextField();
        btok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delícias da serra");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurante");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 180, 30);

        btlacarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alacarte.png"))); // NOI18N
        btlacarte.setText("A La Carte");
        btlacarte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btlacarteItemStateChanged(evt);
            }
        });
        btlacarte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btlacarteStateChanged(evt);
            }
        });
        btlacarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlacarteActionPerformed(evt);
            }
        });

        btss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selfservice.png"))); // NOI18N
        btss.setText("Self Service");
        btss.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btssStateChanged(evt);
            }
        });
        btss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btssActionPerformed(evt);
            }
        });

        brbebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bebidas.png"))); // NOI18N
        brbebidas.setText("Bebidas");
        brbebidas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brbebidasStateChanged(evt);
            }
        });
        brbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brbebidasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor total"));

        valortotal.setBackground(new java.awt.Color(240, 240, 240));
        valortotal.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok-icon.png"))); // NOI18N
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlacarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brbebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btlacarte)
                .addGap(39, 39, 39)
                .addComponent(btss)
                .addGap(32, 32, 32)
                .addComponent(brbebidas)
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btok)
                    .addComponent(jButton1))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        Restaurante res = new Restaurante();
        TelaCadastro tc = new TelaCadastro();
        
        res.getDrink().setValorBebida(valorb);
        res.getLaCarte().setValorRefeicao(valorl);
        res.getSelfService().setValor(valorss);
        
        tc.Restaurante(res);
        valorl=0;valorss=0;valorb=0;
        this.dispose();
        
    }//GEN-LAST:event_btokActionPerformed
    public void LaCarte(LaCarte la){
        this.valorl = la.getValorRefeicao();
    }
    public void SelfService(SelfService ss){
        this.valorss = ss.getValorService();
    }
    public void Bebidas(Drink d){
        this.valorb = d.getValorBebida();
    }
    
    private void btlacarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlacarteActionPerformed
        new TelaALaCarte().setVisible(true);
    }//GEN-LAST:event_btlacarteActionPerformed

    private void btssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btssActionPerformed
        new TelaSelfService().setVisible(true);
    }//GEN-LAST:event_btssActionPerformed

    private void brbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brbebidasActionPerformed
        new TelaBebidas().setVisible(true);
    }//GEN-LAST:event_brbebidasActionPerformed

    private void btlacarteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btlacarteItemStateChanged
         atualizar();
    }//GEN-LAST:event_btlacarteItemStateChanged

    private void btssStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btssStateChanged
         atualizar();
    }//GEN-LAST:event_btssStateChanged

    private void brbebidasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brbebidasStateChanged
         atualizar();
    }//GEN-LAST:event_brbebidasStateChanged

    private void btlacarteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btlacarteStateChanged
         atualizar();
    }//GEN-LAST:event_btlacarteStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    @Override
    public void atualizar(){
        valortotal.setText(String.valueOf(valorl+valorss+valorb));
           }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brbebidas;
    private javax.swing.JButton btlacarte;
    private javax.swing.JButton btok;
    private javax.swing.JButton btss;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField valortotal;
    // End of variables declaration//GEN-END:variables
}
