/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JDialog;
import javax.swing.SwingUtilities;

/**
 *
 * @author ankitpati
 */
public class CalculatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
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

        operation = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        storedValue = new javax.swing.JLabel();
        decimalPoint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        operation.setText("=");

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        clear.setText("✕");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        calculate.setText("=");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        storedValue.setText("0.0");

        decimalPoint.setText(".");
        decimalPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(storedValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operation))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(num7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decimalPoint))))
                            .addComponent(value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add)
                            .addComponent(sub)
                            .addComponent(mul)
                            .addComponent(div)
                            .addComponent(calculate))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, calculate, clear, decimalPoint, div, mul, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, sub});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operation)
                    .addComponent(storedValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6)
                    .addComponent(sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7)
                    .addComponent(num8)
                    .addComponent(num9)
                    .addComponent(mul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(num0)
                    .addComponent(div)
                    .addComponent(decimalPoint))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, calculate, clear, decimalPoint, div, mul, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, sub, value});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        value.setText(value.getText() + '1');
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        value.setText(value.getText() + '2');
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        value.setText(value.getText() + '3');
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        value.setText(value.getText() + '4');
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        value.setText(value.getText() + '5');
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        value.setText(value.getText() + '6');
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        value.setText(value.getText() + '7');
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        value.setText(value.getText() + '8');
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        value.setText(value.getText() + '9');
    }//GEN-LAST:event_num9ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        value.setText(value.getText() + '0');
    }//GEN-LAST:event_num0ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        value.setText("");
        storedValue.setText("0.0");
        operation.setText("=");
    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(!"".equals(value.getText())){
            try{
                Double.parseDouble(value.getText());
            }
            catch(NumberFormatException nfe){
                javax.swing.JOptionPane.showMessageDialog(this, "Enter a valid number.");
                return;
            }
            storedValue.setText(value.getText());
        }
        else storedValue.setText("0.0");

        operation.setText("+");
        value.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        if(!"".equals(value.getText())){
            try{
                Double.parseDouble(value.getText());
            }
            catch(NumberFormatException nfe){
                javax.swing.JOptionPane.showMessageDialog(this, "Enter a valid number.");
                return;
            }
            storedValue.setText(value.getText());
        }
        else storedValue.setText("0.0");

        operation.setText("-");
        value.setText("");
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        if(!"".equals(value.getText())){
            try{
                Double.parseDouble(value.getText());
            }
            catch(NumberFormatException nfe){
                javax.swing.JOptionPane.showMessageDialog(this, "Enter a valid number.");
                return;
            }
            storedValue.setText(value.getText());
        }
        else storedValue.setText("0.0");

        operation.setText("*");
        value.setText("");
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        if(!"".equals(value.getText())){
            try{
                Double.parseDouble(value.getText());
            }
            catch(NumberFormatException nfe){
                javax.swing.JOptionPane.showMessageDialog(this, "Enter a valid number.");
                return;
            }
            storedValue.setText(value.getText());
        }
        else storedValue.setText("0.0");

        operation.setText("/");
        value.setText("");
    }//GEN-LAST:event_divActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        double previousValue, currentValue, result;
        
        try{
            previousValue = Double.parseDouble(storedValue.getText());
            currentValue = Double.parseDouble(value.getText());
        }
        catch(NumberFormatException nfe){
            javax.swing.JOptionPane.showMessageDialog(this, "Enter a valid number.");
            return;
        }
                
        switch(operation.getText()){
        case "+":
            result = previousValue + currentValue;
            break;
        case "-":
            result = previousValue - currentValue;
            break;
        case "*":
            result = previousValue * currentValue;
            break;
        case "/":
            result = previousValue / currentValue;
            break;
        default:
            result = 0.0;
            break;
        }
        
        storedValue.setText(String.valueOf(result));
        value.setText(String.valueOf(result));
        
        operation.setText("=");
    }//GEN-LAST:event_calculateActionPerformed

    private void decimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointActionPerformed
        value.setText(value.getText() + '.');
    }//GEN-LAST:event_decimalPointActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimalPoint;
    private javax.swing.JButton div;
    private javax.swing.JButton mul;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JLabel operation;
    private javax.swing.JLabel storedValue;
    private javax.swing.JButton sub;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
