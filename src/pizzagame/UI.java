/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzagame;

import collections.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author r.stuchevsky
 */
public class UI extends javax.swing.JFrame {
    public  LinkedList<String> userList = new LinkedList<>();
    private int time = 25;
    
    /**
     * Creates new form UI
     */
    public UI() {
       setup();
       timer.start();
       this.setVisible(true);
       initComponents();
       
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrder = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        btnDough1 = new javax.swing.JButton();
        btnDough2 = new javax.swing.JButton();
        btnDough3 = new javax.swing.JButton();
        btnDough4 = new javax.swing.JButton();
        btnDough5 = new javax.swing.JButton();
        btnSauce1 = new javax.swing.JButton();
        btnSauce2 = new javax.swing.JButton();
        btnSauce3 = new javax.swing.JButton();
        btnSauce4 = new javax.swing.JButton();
        btnSauce5 = new javax.swing.JButton();
        btnCheese1 = new javax.swing.JButton();
        btnCheese2 = new javax.swing.JButton();
        btnCheese3 = new javax.swing.JButton();
        btnCheese4 = new javax.swing.JButton();
        btnCheese5 = new javax.swing.JButton();
        btnTop1 = new javax.swing.JButton();
        btnTop2 = new javax.swing.JButton();
        btnTop3 = new javax.swing.JButton();
        btnTop4 = new javax.swing.JButton();
        btnTop5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblResponse = new javax.swing.JLabel();
        lblTimer = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        btnDough6 = new javax.swing.JButton();
        btnSauce6 = new javax.swing.JButton();
        btnCheese6 = new javax.swing.JButton();
        btnTop6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Papa Jhon's Pizzeria Tycoon");
        getContentPane().setLayout(null);

        lblOrder.setText("order");
        getContentPane().add(lblOrder);
        lblOrder.setBounds(30, 200, 450, 100);

        lblPic.setText("Picture");
        getContentPane().add(lblPic);
        lblPic.setBounds(20, 30, 310, 150);

        btnDough1.setText("Full Grain");
        btnDough1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDough1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDough1);
        btnDough1.setBounds(110, 340, 100, 23);

        btnDough2.setText("Thick");
        getContentPane().add(btnDough2);
        btnDough2.setBounds(110, 380, 100, 23);

        btnDough3.setText("Thin");
        getContentPane().add(btnDough3);
        btnDough3.setBounds(110, 420, 100, 23);

        btnDough4.setText("Soft");
        getContentPane().add(btnDough4);
        btnDough4.setBounds(110, 460, 100, 23);

        btnDough5.setText("Italian");
        getContentPane().add(btnDough5);
        btnDough5.setBounds(110, 500, 100, 23);

        btnSauce1.setText("jButton6");
        getContentPane().add(btnSauce1);
        btnSauce1.setBounds(240, 340, 90, 23);

        btnSauce2.setText("jButton7");
        getContentPane().add(btnSauce2);
        btnSauce2.setBounds(240, 380, 90, 23);

        btnSauce3.setText("jButton8");
        getContentPane().add(btnSauce3);
        btnSauce3.setBounds(240, 420, 90, 23);

        btnSauce4.setText("jButton9");
        getContentPane().add(btnSauce4);
        btnSauce4.setBounds(240, 460, 90, 23);

        btnSauce5.setText("S");
        getContentPane().add(btnSauce5);
        btnSauce5.setBounds(240, 500, 90, 23);

        btnCheese1.setText("jButton11");
        getContentPane().add(btnCheese1);
        btnCheese1.setBounds(360, 340, 90, 23);

        btnCheese2.setText("jButton12");
        getContentPane().add(btnCheese2);
        btnCheese2.setBounds(360, 380, 90, 23);

        btnCheese3.setText("jButton13");
        btnCheese3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheese3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheese3);
        btnCheese3.setBounds(360, 420, 90, 23);

        btnCheese4.setText("jButton14");
        getContentPane().add(btnCheese4);
        btnCheese4.setBounds(360, 460, 90, 23);

        btnCheese5.setText("jButton15");
        getContentPane().add(btnCheese5);
        btnCheese5.setBounds(360, 500, 90, 23);

        btnTop1.setText("jButton16");
        getContentPane().add(btnTop1);
        btnTop1.setBounds(480, 340, 90, 23);

        btnTop2.setText("jButton17");
        getContentPane().add(btnTop2);
        btnTop2.setBounds(480, 380, 90, 23);

        btnTop3.setText("jButton18");
        getContentPane().add(btnTop3);
        btnTop3.setBounds(480, 420, 90, 23);

        btnTop4.setText("jButton19");
        btnTop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop4);
        btnTop4.setBounds(480, 460, 90, 23);

        btnTop5.setText("jButton20");
        btnTop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop5);
        btnTop5.setBounds(480, 500, 90, 23);

        jLabel3.setText("Toppings");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 320, 70, 20);

        jLabel4.setText("Doughs");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 320, 70, 20);

        jLabel5.setText("Sauces");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 320, 70, 20);

        jLabel6.setText("Cheeses");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 320, 70, 20);

        lblResponse.setText("Response of customer");
        getContentPane().add(lblResponse);
        lblResponse.setBounds(30, 600, 570, 90);

        lblTimer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTimer.setText("25");
        getContentPane().add(lblTimer);
        lblTimer.setBounds(560, 40, 30, 20);
        lblTimer.getAccessibleContext().setAccessibleName("");

        txtName.setText("PlayerName");
        getContentPane().add(txtName);
        txtName.setBounds(670, 30, 90, 40);

        lblTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTxt.setText("Time Left:");
        getContentPane().add(lblTxt);
        lblTxt.setBounds(530, 10, 90, 30);

        lblMoney.setText("Money");
        getContentPane().add(lblMoney);
        lblMoney.setBounds(690, 110, 50, 14);

        btnDough6.setText("Cheese Fill");
        getContentPane().add(btnDough6);
        btnDough6.setBounds(110, 540, 100, 23);

        btnSauce6.setText("jButton10");
        btnSauce6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauce6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSauce6);
        btnSauce6.setBounds(240, 540, 90, 23);

        btnCheese6.setText("jButton15");
        getContentPane().add(btnCheese6);
        btnCheese6.setBounds(360, 540, 90, 23);

        btnTop6.setText("jButton20");
        btnTop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop6);
        btnTop6.setBounds(480, 540, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDough1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDough1ActionPerformed
       userList.add("");
    }//GEN-LAST:event_btnDough1ActionPerformed

    private void btnCheese3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheese3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheese3ActionPerformed

    private void btnTop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTop4ActionPerformed

    private void btnTop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTop5ActionPerformed

    private void btnTop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTop6ActionPerformed

    private void btnSauce6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauce6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSauce6ActionPerformed

   private Timer timer;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheese1;
    private javax.swing.JButton btnCheese2;
    private javax.swing.JButton btnCheese3;
    private javax.swing.JButton btnCheese4;
    private javax.swing.JButton btnCheese5;
    private javax.swing.JButton btnCheese6;
    private javax.swing.JButton btnDough1;
    private javax.swing.JButton btnDough2;
    private javax.swing.JButton btnDough3;
    private javax.swing.JButton btnDough4;
    private javax.swing.JButton btnDough5;
    private javax.swing.JButton btnDough6;
    private javax.swing.JButton btnSauce1;
    private javax.swing.JButton btnSauce2;
    private javax.swing.JButton btnSauce3;
    private javax.swing.JButton btnSauce4;
    private javax.swing.JButton btnSauce5;
    private javax.swing.JButton btnSauce6;
    private javax.swing.JButton btnTop1;
    private javax.swing.JButton btnTop2;
    private javax.swing.JButton btnTop3;
    private javax.swing.JButton btnTop4;
    private javax.swing.JButton btnTop5;
    private javax.swing.JButton btnTop6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblResponse;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables

    private void setup(){
        
        
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                time--;
                lblTimer.setText(Integer.toString(time));
                if (time == 0) { 
                    JOptionPane.showMessageDialog(null, "bruh");
                    System.exit(0);
            }
            } //else if order correct reset timer time = 25;
        });
    
    }

}
