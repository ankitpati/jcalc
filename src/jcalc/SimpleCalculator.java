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

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame {
    final static long serialVersionUID = 0l;

    public SimpleCalculator() {
        initComponents();

        getRootPane().setDefaultButton(calculateButton);

        SwingUtilities.invokeLater(() -> {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) themeComboBox.addItem(info.getName());
            themeComboBox.setSelectedItem("Nimbus");
            setLocationRelativeTo(null);
            setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storedValueLabel = new javax.swing.JLabel();
        operationLabel = new javax.swing.JLabel();
        valueField = new javax.swing.JTextField();
        backspaceButton = new javax.swing.JButton();
        num0Button = new javax.swing.JButton();
        num1Button = new javax.swing.JButton();
        num2Button = new javax.swing.JButton();
        num3Button = new javax.swing.JButton();
        num4Button = new javax.swing.JButton();
        num5Button = new javax.swing.JButton();
        num6Button = new javax.swing.JButton();
        num7Button = new javax.swing.JButton();
        num8Button = new javax.swing.JButton();
        num9Button = new javax.swing.JButton();
        decimalPointButton = new javax.swing.JButton();
        exponentConstantButton = new javax.swing.JButton();
        additionButton = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        themeComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAlwaysOnTop(true);
        setResizable(false);

        storedValueLabel.setText("0.0");

        operationLabel.setText("=");

        valueField.setEditable(false);
        valueField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valueFieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valueFieldKeyPressed(evt);
            }
        });

        backspaceButton.setText("⌫");
        backspaceButton.setFocusable(false);
        backspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceButtonActionPerformed(evt);
            }
        });

        num0Button.setText("0");
        num0Button.setFocusable(false);
        num0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num1Button.setText("1");
        num1Button.setFocusable(false);
        num1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num2Button.setText("2");
        num2Button.setFocusable(false);
        num2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num3Button.setText("3");
        num3Button.setFocusable(false);
        num3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num4Button.setText("4");
        num4Button.setFocusable(false);
        num4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num5Button.setText("5");
        num5Button.setFocusable(false);
        num5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num6Button.setText("6");
        num6Button.setFocusable(false);
        num6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num7Button.setText("7");
        num7Button.setFocusable(false);
        num7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num8Button.setText("8");
        num8Button.setFocusable(false);
        num8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num9Button.setText("9");
        num9Button.setFocusable(false);
        num9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        decimalPointButton.setText(".");
        decimalPointButton.setFocusable(false);
        decimalPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPointButtonActionPerformed(evt);
            }
        });

        exponentConstantButton.setText("E");
        exponentConstantButton.setFocusable(false);
        exponentConstantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponentConstantButtonActionPerformed(evt);
            }
        });

        additionButton.setText("+");
        additionButton.setFocusable(false);
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        subtractionButton.setText("-");
        subtractionButton.setFocusable(false);
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        multiplicationButton.setText("✕");
        multiplicationButton.setFocusable(false);
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        divisionButton.setText("/");
        divisionButton.setFocusable(false);
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        powerButton.setText("^");
        powerButton.setFocusable(false);
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        rootButton.setText("√");
        rootButton.setFocusable(false);
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        calculateButton.setText("=");
        calculateButton.setFocusable(false);
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        clearButton.setText("c");
        clearButton.setFocusable(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        themeComboBox.setToolTipText("Look and Feel");
        themeComboBox.setFocusable(false);
        themeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                themeComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(themeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(storedValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(calculateButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(powerButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rootButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(backspaceButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num4Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num5Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num6Button))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num7Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num8Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num9Button))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num1Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num2Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num3Button))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(exponentConstantButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num0Button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(decimalPointButton)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(additionButton)
                                .addComponent(subtractionButton)
                                .addComponent(multiplicationButton)
                                .addComponent(divisionButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {additionButton, calculateButton, clearButton, decimalPointButton, divisionButton, exponentConstantButton, multiplicationButton, num0Button, num1Button, num2Button, num3Button, num4Button, num5Button, num6Button, num7Button, num8Button, num9Button, powerButton, rootButton, subtractionButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operationLabel)
                    .addComponent(storedValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspaceButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(powerButton)
                    .addComponent(rootButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1Button)
                    .addComponent(num2Button)
                    .addComponent(num3Button)
                    .addComponent(additionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4Button)
                    .addComponent(num5Button)
                    .addComponent(num6Button)
                    .addComponent(subtractionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7Button)
                    .addComponent(num8Button)
                    .addComponent(num9Button)
                    .addComponent(multiplicationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0Button)
                    .addComponent(divisionButton)
                    .addComponent(decimalPointButton)
                    .addComponent(exponentConstantButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(themeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {additionButton, calculateButton, clearButton, decimalPointButton, divisionButton, exponentConstantButton, multiplicationButton, num0Button, num1Button, num2Button, num3Button, num4Button, num5Button, num6Button, num7Button, num8Button, num9Button, powerButton, rootButton, subtractionButton, valueField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        valueField.setText("");
        storedValueLabel.setText("0.0");
        operationLabel.setText("=");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void decimalPointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPointButtonActionPerformed
        String orig;

        orig = valueField.getText();

        if (orig.contains(".") || orig.contains("E")) return;
        if (orig.contains("I") || orig.contains("N")) valueField.setText(orig = "");
        /* Checking for these letters because
            E = Exponent
            I = Infinity
            N = NaN
        */

        valueField.setText(orig + '.');
    }//GEN-LAST:event_decimalPointButtonActionPerformed

    private void backspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceButtonActionPerformed
        String orig;
        orig = valueField.getText();
        if (orig.length() == 0) return;
        valueField.setText(orig.substring(0, orig.length() - 1));
    }//GEN-LAST:event_backspaceButtonActionPerformed

    private void exponentConstantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponentConstantButtonActionPerformed
        String orig;
        orig = valueField.getText();
        if ("".equals(orig) || "-".equals(orig) || orig.contains("I") || orig.contains("N")) return;
        if (!orig.contains("E")) valueField.setText(orig + 'E');
    }//GEN-LAST:event_exponentConstantButtonActionPerformed

    private void numActionPerformedHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformedHandler
        if (valueField.getText().contains("I") || valueField.getText().contains("N")) valueField.setText("");
        valueField.setText(valueField.getText() + evt.getActionCommand());
    }//GEN-LAST:event_numActionPerformedHandler

    private void calculationActionPerformedHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculationActionPerformedHandler
        double previousValue, currentValue;
        String orig, command, previousCommand;

        orig = valueField.getText();
        command = evt.getActionCommand();
        previousCommand = operationLabel.getText();

        if ("".equals(orig) || orig.charAt(orig.length() - 1) == 'E') {
            if ("-".equals(command)) valueField.setText(orig + '-');
            else if (!"=".equals(command)) operationLabel.setText(command);
            return;
        }

        if (orig.charAt(orig.length() - 1) == '-') {
            if (!"=".equals(command)) operationLabel.setText(command);
            return;
        }

        try {
            previousValue = Double.parseDouble(storedValueLabel.getText());
            currentValue = Double.parseDouble(orig);
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Invalid Number!\nPress C to clear the input.");
            return;
        }

        valueField.setText("");

        switch (previousCommand) {
        case "+":
            previousValue += currentValue;
            break;
        case "-":
            previousValue -= currentValue;
            break;
        case "✕":
            previousValue *= currentValue;
            break;
        case "/":
            previousValue /= currentValue;
            break;
        case "^":
            previousValue = Math.pow(previousValue, currentValue);
            break;
        case "√":
            previousValue = Math.pow(currentValue, 1.0 / previousValue);
            break;
        case "=":
            previousValue = currentValue;
            break;
        }

        operationLabel.setText(command);
        storedValueLabel.setText(String.valueOf(previousValue));

        if ("=".equals(command)) valueField.setText(String.valueOf(previousValue));
    }//GEN-LAST:event_calculationActionPerformedHandler

    private void themeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_themeComboBoxItemStateChanged
        SwingUtilities.invokeLater(() -> {
            Point frameLocation;
            frameLocation = getLocation();
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                    if (themeComboBox.getSelectedItem().equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            }
            catch (Exception ex) {
                System.err.println("Cannot set " + themeComboBox.getSelectedItem() + " theme.");
            }
            setLocation(frameLocation);
        });
    }//GEN-LAST:event_themeComboBoxItemStateChanged

    private void valueFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueFieldKeyTyped
        switch (evt.getKeyChar()) {
        case '1':
            num1Button.doClick();
            break;
        case '2':
            num2Button.doClick();
            break;
        case '3':
            num3Button.doClick();
            break;
        case '4':
            num4Button.doClick();
            break;
        case '5':
            num5Button.doClick();
            break;
        case '6':
            num6Button.doClick();
            break;
        case '7':
            num7Button.doClick();
            break;
        case '8':
            num8Button.doClick();
            break;
        case '9':
            num9Button.doClick();
            break;
        case '0':
            num0Button.doClick();
            break;
        case '.':
            decimalPointButton.doClick();
            break;
        case 'e':   /* intended fall-through */
        case 'E':
            exponentConstantButton.doClick();
            break;
        case '=':
            calculateButton.doClick();
            break;
        case '\b':
            backspaceButton.doClick();
            break;
        case 'c':   /* intended fall-through */
        case 'C':
            clearButton.doClick();
            break;
        case '+':
            additionButton.doClick();
            break;
        case '-':
            subtractionButton.doClick();
            break;
        case '*':   /* intended fall-through */
        case 'x':
        case 'X':
            multiplicationButton.doClick();
            break;
        case '/':
            divisionButton.doClick();
            break;
        case '^':
            powerButton.doClick();
            break;
        case 'r':
            rootButton.doClick();
            break;
        default:
            break;
        }
    }//GEN-LAST:event_valueFieldKeyTyped

    private void valueFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueFieldKeyPressed
        switch (evt.getKeyCode()) {
        case KeyEvent.VK_UP:
            themeComboBox.setSelectedIndex((themeComboBox.getSelectedIndex() == 0 ? themeComboBox.getItemCount() : themeComboBox.getSelectedIndex()) - 1);
            break;
        case KeyEvent.VK_DOWN:
            themeComboBox.setSelectedIndex(themeComboBox.getSelectedIndex() == themeComboBox.getItemCount() - 1 ? 0 : themeComboBox.getSelectedIndex() + 1);
            break;
        default:
            break;
        }
    }//GEN-LAST:event_valueFieldKeyPressed

    public static void main(String args[]) {
        new SimpleCalculator();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionButton;
    private javax.swing.JButton backspaceButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton decimalPointButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton exponentConstantButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton num0Button;
    private javax.swing.JButton num1Button;
    private javax.swing.JButton num2Button;
    private javax.swing.JButton num3Button;
    private javax.swing.JButton num4Button;
    private javax.swing.JButton num5Button;
    private javax.swing.JButton num6Button;
    private javax.swing.JButton num7Button;
    private javax.swing.JButton num8Button;
    private javax.swing.JButton num9Button;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JLabel storedValueLabel;
    private javax.swing.JButton subtractionButton;
    private javax.swing.JComboBox themeComboBox;
    private javax.swing.JTextField valueField;
    // End of variables declaration//GEN-END:variables
}
/* end of SimpleCalculator.java */
