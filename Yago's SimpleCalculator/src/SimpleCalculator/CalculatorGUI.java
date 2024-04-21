
package SimpleCalculator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class CalculatorGUI extends javax.swing.JFrame{
      double x,y,z,result;
      String s,Op;
       
    public CalculatorGUI() {
   
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1_8 = new javax.swing.JButton();
        jButton2_9 = new javax.swing.JButton();
        jButton3_Divide = new javax.swing.JButton();
        jButton4_4 = new javax.swing.JButton();
        jButton6_7 = new javax.swing.JButton();
        jButton7_multiply = new javax.swing.JButton();
        jButton8_6 = new javax.swing.JButton();
        jButton9_Reset = new javax.swing.JButton();
        jButton10_5 = new javax.swing.JButton();
        jButton11_1 = new javax.swing.JButton();
        jButton12_2 = new javax.swing.JButton();
        jButton13_0 = new javax.swing.JButton();
        jButton14_DecimalPoint = new javax.swing.JButton();
        jButton15_3 = new javax.swing.JButton();
        jButton16_EqualsTo = new javax.swing.JButton();
        jButton17_Add = new javax.swing.JButton();
        jButton19_subtraction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        Backbutton = new java.awt.Button();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 450));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(50000, 50000));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));

        jButton1_8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1_8.setText("8");
        jButton1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_8ActionPerformed(evt);
            }
        });

        jButton2_9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2_9.setText("9");
        jButton2_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_9ActionPerformed(evt);
            }
        });

        jButton3_Divide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3_Divide.setText("/");
        jButton3_Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_DivideActionPerformed(evt);
            }
        });

        jButton4_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4_4.setText("6");
        jButton4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_4ActionPerformed(evt);
            }
        });

        jButton6_7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6_7.setText("7");
        jButton6_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_7ActionPerformed(evt);
            }
        });

        jButton7_multiply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7_multiply.setText("x");
        jButton7_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_multiplyActionPerformed(evt);
            }
        });

        jButton8_6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8_6.setText("4");
        jButton8_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8_6ActionPerformed(evt);
            }
        });

        jButton9_Reset.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton9_Reset.setText("CLEAR");
        jButton9_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9_ResetActionPerformed(evt);
            }
        });

        jButton10_5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10_5.setText("5");
        jButton10_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10_5ActionPerformed(evt);
            }
        });

        jButton11_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11_1.setText("3");
        jButton11_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11_1ActionPerformed(evt);
            }
        });

        jButton12_2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12_2.setText("2");
        jButton12_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12_2ActionPerformed(evt);
            }
        });

        jButton13_0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13_0.setText("0");
        jButton13_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13_0ActionPerformed(evt);
            }
        });

        jButton14_DecimalPoint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14_DecimalPoint.setText(".");
        jButton14_DecimalPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14_DecimalPointActionPerformed(evt);
            }
        });

        jButton15_3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15_3.setText("1");
        jButton15_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15_3ActionPerformed(evt);
            }
        });

        jButton16_EqualsTo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16_EqualsTo.setText("=");
        jButton16_EqualsTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16_EqualsToActionPerformed(evt);
            }
        });

        jButton17_Add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17_Add.setText("+");
        jButton17_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17_AddActionPerformed(evt);
            }
        });

        jButton19_subtraction.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19_subtraction.setText("-");
        jButton19_subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19_subtractionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MAXIO CALCULATOR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });
        tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfKeyTyped(evt);
            }
        });

        Backbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Backbutton.setLabel("BACK");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10_5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15_3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13_0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14_DecimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16_EqualsTo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2_9, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3_Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19_subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10_5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton11_1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12_2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton19_subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13_0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14_DecimalPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16_EqualsTo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                
    private void jButton9_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9_ResetActionPerformed

   tf.setText(" ");
     
    }//GEN-LAST:event_jButton9_ResetActionPerformed

    private void jButton6_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_7ActionPerformed
   s = tf.getText();
   tf.setText(s+"7");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton6_7ActionPerformed

    private void jButton11_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11_1ActionPerformed
   s = tf.getText();
   tf.setText(s+"3");
   s = tf.getText();
   x = Double.parseDouble(s);       
    }//GEN-LAST:event_jButton11_1ActionPerformed

    private void jButton1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_8ActionPerformed
      s = tf.getText();
   tf.setText(s+"8");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton1_8ActionPerformed

    private void jButton2_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_9ActionPerformed
     s = tf.getText();
   tf.setText(s+"9");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton2_9ActionPerformed

    private void jButton4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_4ActionPerformed
      s = tf.getText();
   tf.setText(s+"4");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton4_4ActionPerformed

    private void jButton8_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8_6ActionPerformed
       s = tf.getText();
   tf.setText(s+"6");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton8_6ActionPerformed

    private void jButton10_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10_5ActionPerformed
   s = tf.getText();
   tf.setText(s+"5");
   s = tf.getText();
   x = Double.parseDouble(s);         
    }//GEN-LAST:event_jButton10_5ActionPerformed

    private void jButton12_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12_2ActionPerformed
   s = tf.getText();
   tf.setText(s+"2");
   s = tf.getText();
   x = Double.parseDouble(s);       
    }//GEN-LAST:event_jButton12_2ActionPerformed

    private void jButton15_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15_3ActionPerformed
   s = tf.getText();
   tf.setText(s+"1");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton15_3ActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
    
    }//GEN-LAST:event_tfActionPerformed

    private void tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeyTyped
       char c = evt.getKeyChar();
       if((Character.isDigit(c) || KeyEvent.VK_BACK_SPACE == c || KeyEvent.VK_DELETE==c)){
           getToolkit().beep();
           evt.consume();
       }
    }//GEN-LAST:event_tfKeyTyped

    private void jButton17_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17_AddActionPerformed
        z = x;
       tf.setText(" ");
         Op = "+";
    }//GEN-LAST:event_jButton17_AddActionPerformed

    private void jButton19_subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19_subtractionActionPerformed
         z = x;
       tf.setText(" ");
         Op = "-";
    }//GEN-LAST:event_jButton19_subtractionActionPerformed

    private void jButton7_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_multiplyActionPerformed
         z = x;
       tf.setText(" ");
         Op = "*";
    }//GEN-LAST:event_jButton7_multiplyActionPerformed

    private void jButton3_DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_DivideActionPerformed
         z = x;
       tf.setText(" ");
         Op = "/";
    }//GEN-LAST:event_jButton3_DivideActionPerformed

    private void jButton13_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13_0ActionPerformed
     s = tf.getText();
   tf.setText(s+"0");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton13_0ActionPerformed

    private void jButton14_DecimalPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14_DecimalPointActionPerformed
     s = tf.getText();
   tf.setText(s+".");
   s = tf.getText();
   x = Double.parseDouble(s);
    }//GEN-LAST:event_jButton14_DecimalPointActionPerformed

    private void jButton16_EqualsToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16_EqualsToActionPerformed
      y = Double.parseDouble(tf.getText());
      if(Op=="+"){
          result = z+y;
      }
      else if(Op=="-"){
          result = z-y;
      }
      else if(Op=="*"){
          result = z*y;
      }
      else if(Op=="/")
      {
          result= z/y;
      }      
      tf.setText(String.valueOf(result));
    }//GEN-LAST:event_jButton16_EqualsToActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
       StringBuilder bck= new StringBuilder(tf.getText());
       bck.deleteCharAt(tf.getText().length()-1);
       tf.setText(bck.toString());
    }//GEN-LAST:event_BackbuttonActionPerformed

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
    private java.awt.Button Backbutton;
    private javax.swing.JButton jButton10_5;
    private javax.swing.JButton jButton11_1;
    private javax.swing.JButton jButton12_2;
    private javax.swing.JButton jButton13_0;
    private javax.swing.JButton jButton14_DecimalPoint;
    private javax.swing.JButton jButton15_3;
    private javax.swing.JButton jButton16_EqualsTo;
    private javax.swing.JButton jButton17_Add;
    private javax.swing.JButton jButton19_subtraction;
    private javax.swing.JButton jButton1_8;
    private javax.swing.JButton jButton2_9;
    private javax.swing.JButton jButton3_Divide;
    private javax.swing.JButton jButton4_4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6_7;
    private javax.swing.JButton jButton7_multiply;
    private javax.swing.JButton jButton8_6;
    private javax.swing.JButton jButton9_Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
