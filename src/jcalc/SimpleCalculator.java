/* SimpleCalculator.java */
/* Simple Swing Calculator
 *
 * Copyright 2016 Ankit Pati <ankitpati@gmail.com>
 *
 * This  software is  free software;  you can redistribute it and/or  modify  it
 * under the terms of the  GNU Lesser General Public License as published by the
 * Free Software Foundation;  either  version 3  of the  License,  or  (at  your
 * option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but  WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You  should  have received a copy of the GNU Lesser  General  Public  License
 * along with this program; if not, see <http://www.gnu.org/licenses/>.
 */

package jcalc;

public class SimpleCalculator extends javax.swing.JFrame {
    final static long serialVersionUID = 0l;

    public SimpleCalculator() {
        initComponents();

        /* setting and unsetting ENTER keybindings */
        getRootPane().setDefaultButton(calculate);
        add.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        clear.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        decimalPoint.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        div.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        eraseToLeft.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        exponentConstant.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        mul.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num0.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num1.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num2.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num3.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num4.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num5.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num6.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num7.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num8.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        num9.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        power.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        root.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
        sub.getInputMap().put(javax.swing.KeyStroke.getKeyStroke("ENTER"), "none");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calculatorPanel = new javax.swing.JPanel();
        power = new javax.swing.JButton();
        exponentConstant = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        root = new javax.swing.JButton();
        storedValue = new javax.swing.JLabel();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        eraseToLeft = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        operation = new javax.swing.JLabel();
        num1 = new javax.swing.JButton();
        value = new javax.swing.JTextField();
        num9 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        decimalPoint = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        num8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        power.setText("^");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        power.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        exponentConstant.setText("E");
        exponentConstant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponentConstantActionPerformed(evt);
            }
        });
        exponentConstant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        root.setText("√");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        root.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        storedValue.setText("0.0");

        mul.setText("✕");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        mul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        div.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        eraseToLeft.setText("⌫");
        eraseToLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseToLeftActionPerformed(evt);
            }
        });

        clear.setText("c");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        clear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        sub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        operation.setText("=");

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        value.setEditable(false);
        value.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        decimalPoint.setText(".");
        decimalPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointActionPerformed(evt);
            }
        });
        decimalPoint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        calculate.setText("=");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        calculate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        javax.swing.GroupLayout calculatorPanelLayout = new javax.swing.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addComponent(storedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calculatorPanelLayout.createSequentialGroup()
                            .addComponent(calculate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(power)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(root))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculatorPanelLayout.createSequentialGroup()
                            .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eraseToLeft))
                        .addGroup(calculatorPanelLayout.createSequentialGroup()
                            .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(calculatorPanelLayout.createSequentialGroup()
                                    .addComponent(num4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num6))
                                .addGroup(calculatorPanelLayout.createSequentialGroup()
                                    .addComponent(num7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num9))
                                .addGroup(calculatorPanelLayout.createSequentialGroup()
                                    .addComponent(num1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num3))
                                .addGroup(calculatorPanelLayout.createSequentialGroup()
                                    .addComponent(exponentConstant)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num0)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(decimalPoint)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add)
                                .addComponent(sub)
                                .addComponent(mul)
                                .addComponent(div)))))
                .addContainerGap())
        );

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, calculate, clear, decimalPoint, div, exponentConstant, mul, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, power, root, sub});

        calculatorPanelLayout.setVerticalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operation)
                    .addComponent(storedValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eraseToLeft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(power)
                    .addComponent(root)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6)
                    .addComponent(sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7)
                    .addComponent(num8)
                    .addComponent(num9)
                    .addComponent(mul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0)
                    .addComponent(div)
                    .addComponent(decimalPoint)
                    .addComponent(exponentConstant))
                .addContainerGap())
        );

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, calculate, clear, decimalPoint, div, exponentConstant, mul, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, power, root, sub, value});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        value.setText("");
        storedValue.setText("0.0");
        operation.setText("=");
    }//GEN-LAST:event_clearActionPerformed

    private void decimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointActionPerformed
        int i;
        String orig;

        orig = value.getText();

        if(orig.contains(".") || orig.contains("E")) return;
        if(orig.contains("I") || orig.contains("N")) value.setText(orig = "");
        /* Checking for these letters because
            E = Exponent
            I = Infinity
            N = NaN
        */

        value.setText(orig + '.');
    }//GEN-LAST:event_decimalPointActionPerformed

    private void keyTypedHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyTypedHandler
        switch(evt.getKeyChar()){
        case '1':
            num1.doClick();
            break;
        case '2':
            num2.doClick();
            break;
        case '3':
            num3.doClick();
            break;
        case '4':
            num4.doClick();
            break;
        case '5':
            num5.doClick();
            break;
        case '6':
            num6.doClick();
            break;
        case '7':
            num8.doClick();
            break;
        case '8':
            num8.doClick();
            break;
        case '9':
            num9.doClick();
            break;
        case '0':
            num0.doClick();
            break;
        case '.':
            decimalPoint.doClick();
            break;
        case 'e':   /* intended fall-through */
        case 'E':
            exponentConstant.doClick();
            break;
        case '=':
            calculate.doClick();
            break;
        case '\b':
            eraseToLeft.doClick();
            break;
        case 'c':   /* intended fall-through */
        case 'C':
            clear.doClick();
            break;
        case '+':
            add.doClick();
            break;
        case '-':
            sub.doClick();
            break;
        case '*':   /* intended fall-through */
        case 'x':
        case 'X':
            mul.doClick();
            break;
        case '/':
            div.doClick();
            break;
        case '^':
            power.doClick();
            break;
        case 'r':
            root.doClick();
            break;
        default:
            break;
        }
    }//GEN-LAST:event_keyTypedHandler

    private void eraseToLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseToLeftActionPerformed
        String orig;

        orig = value.getText();
        if(orig.length() == 0) return;

        value.setText(orig.substring(0, orig.length() - 1));
    }//GEN-LAST:event_eraseToLeftActionPerformed

    private void exponentConstantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponentConstantActionPerformed
        int i;
        String orig;

        orig = value.getText();

        if("".equals(orig)) return;
        if("-".equals(orig)) return;
        
        if(!orig.contains("E")) value.setText(orig + 'E');
    }//GEN-LAST:event_exponentConstantActionPerformed

    private void numActionPerformedHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformedHandler
        if(value.getText().contains("I") || value.getText().contains("N")) value.setText("");
        value.setText(value.getText() + evt.getActionCommand());
    }//GEN-LAST:event_numActionPerformedHandler

    private void calculationActionPerformedHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculationActionPerformedHandler
        double previousValue, currentValue;
        String orig, command, previousCommand;

        orig = value.getText();
        command = evt.getActionCommand();
        previousCommand = operation.getText();

        if("".equals(orig) || orig.charAt(orig.length() - 1) == 'E'){
            if("-".equals(command)) value.setText(orig + '-');
            else if(!"=".equals(command)) operation.setText(command);
            return;
        }

        if(orig.charAt(orig.length() - 1) == '-'){
            if(!"=".equals(command)) operation.setText(command);
            return;
        }

        try{
            previousValue = Double.parseDouble(storedValue.getText());
            currentValue = Double.parseDouble(orig);
        }
        catch(NumberFormatException nfe){
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid Number!\nPress C to clear the input.");
            return;
        }

        value.setText("");

        switch(previousCommand){
        case "+":
            previousValue += currentValue;
            break;
        case "-":
            previousValue -= currentValue;
            break;
        case "\u2715":
            previousValue *= currentValue;
            break;
        case "/":
            previousValue /= currentValue;
            break;
        case "^":
            previousValue = Math.pow(previousValue, currentValue);
            break;
        case "\u221a":
            previousValue = Math.pow(currentValue, 1.0 / previousValue);
            break;
        case "=":
            previousValue = currentValue;
            break;
        }

        operation.setText(command);
        storedValue.setText(String.valueOf(previousValue));

        if("=".equals(command)) value.setText(String.valueOf(previousValue));
    }//GEN-LAST:event_calculationActionPerformedHandler
    
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
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SimpleCalculator().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton calculate;
    private javax.swing.JPanel calculatorPanel;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimalPoint;
    private javax.swing.JButton div;
    private javax.swing.JButton eraseToLeft;
    private javax.swing.JButton exponentConstant;
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
    private javax.swing.JButton power;
    private javax.swing.JButton root;
    private javax.swing.JLabel storedValue;
    private javax.swing.JButton sub;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
/* end of SimpleCalculator.java */
