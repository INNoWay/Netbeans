package view;

public class JCalculadora extends javax.swing.JFrame {
  
  char operacao;
  
  String temp,numantes,copia;
  
  double n1,n2,result;
  
    
  public JCalculadora() {
       
    
        initComponents();
     
        setResizable(false);
        
        jTvisor.setEditable(false);
        
        this.setLocationRelativeTo(null); 
       
    }
  
 private void NumeroDigitado(String numero) {
        
        temp=jTvisor.getText();
     
        numantes=temp;
        
        temp = temp+numero;
        
        jTvisor.setText(temp);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTvisor = new javax.swing.JTextField();
        jB318 = new javax.swing.JButton();
        jB317 = new javax.swing.JButton();
        jB310 = new javax.swing.JButton();
        jBdiv31 = new javax.swing.JButton();
        jBmult31 = new javax.swing.JButton();
        jB314 = new javax.swing.JButton();
        jB313 = new javax.swing.JButton();
        jB319 = new javax.swing.JButton();
        jB316 = new javax.swing.JButton();
        jB311 = new javax.swing.JButton();
        jB312 = new javax.swing.JButton();
        jBsub31 = new javax.swing.JButton();
        jBresult31 = new javax.swing.JButton();
        jBadicao31 = new javax.swing.JButton();
        jBponto31 = new javax.swing.JButton();
        jB315 = new javax.swing.JButton();
        jBctrol31 = new javax.swing.JButton();
        jBce31 = new javax.swing.JButton();
        jBbsp31 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTvisor.setEditable(false);
        jTvisor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvisorActionPerformed(evt);
            }
        });

        jB318.setText("7");
        jB318.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB317.setText("8");
        jB317.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB310.setText("9");
        jB310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jBdiv31.setText("/");
        jBdiv31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdivActionPerformed(evt);
            }
        });

        jBmult31.setText("*");
        jBmult31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultActionPerformed(evt);
            }
        });

        jB314.setText("6");
        jB314.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB313.setText("5");
        jB313.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB319.setText("4");
        jB319.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB316.setText("1");
        jB316.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB311.setText("2");
        jB311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB312.setText("3");
        jB312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jBsub31.setText("-");
        jBsub31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubActionPerformed(evt);
            }
        });

        jBresult31.setText("=");
        jBresult31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresultActionPerformed(evt);
            }
        });

        jBadicao31.setText("+");
        jBadicao31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicaoActionPerformed(evt);
            }
        });

        jBponto31.setText(".");
        jBponto31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpontoActionPerformed(evt);
            }
        });

        jB315.setText("0");
        jB315.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jBctrol31.setText("Ctrl");
        jBctrol31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBctrolActionPerformed(evt);
            }
        });

        jBce31.setText("CE");
        jBce31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBceActionPerformed(evt);
            }
        });

        jBbsp31.setText("Bsp");
        jBbsp31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB315)
                            .addComponent(jB316)
                            .addComponent(jB319)
                            .addComponent(jB318))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jB317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jB313, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBponto31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB311, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBadicao31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB314, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jB310, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBdiv31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBmult31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBsub31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBresult31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBce31, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBbsp31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBctrol31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTvisor))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jB310, jB311, jB312, jB313, jB314, jB315, jB316, jB317, jB318, jB319, jBadicao31, jBponto31});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBbsp31, jBce31});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBctrol31)
                    .addComponent(jBce31)
                    .addComponent(jBbsp31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jB317)
                                    .addComponent(jBdiv31)
                                    .addComponent(jB310))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB318)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB319)
                            .addComponent(jB313)
                            .addComponent(jBmult31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jB311)
                                .addComponent(jBsub31))
                            .addComponent(jB316))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBponto31)
                                .addComponent(jBresult31))
                            .addComponent(jB315)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB314)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB312)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBadicao31)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jB310, jB311, jB312, jB313, jB314, jB315, jB316, jB317, jB318, jB319, jBadicao31, jBdiv31, jBmult31, jBponto31, jBresult31, jBsub31});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBbsp31, jBce31, jBctrol31});

        jMenu1.setText("Sair");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvisorActionPerformed
    
    }//GEN-LAST:event_jTvisorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        new JCalculadora().setVisible(false);
        
        dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBceActionPerformed
        
        n2 = 0;
        
        jTvisor.setText(String.valueOf(n1));
        
    }//GEN-LAST:event_jBceActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        
        NumeroDigitado("4");
        
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        
        NumeroDigitado("7");
        
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        
        NumeroDigitado("8");
        
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        
        NumeroDigitado("1");
        
    }//GEN-LAST:event_jB1ActionPerformed

    private void jBdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdivActionPerformed
        
        operacao = '/';
        
        n1 = Double.parseDouble(jTvisor.getText());
        
        jTvisor.setText("");
        
    }//GEN-LAST:event_jBdivActionPerformed

    private void jBmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultActionPerformed
        
        operacao = '*';
        
        n1 = Double.parseDouble(jTvisor.getText());
        
        jTvisor.setText("");
        
    }//GEN-LAST:event_jBmultActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
       
        NumeroDigitado("0");
        
    }//GEN-LAST:event_jB0ActionPerformed

    private void jBadicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicaoActionPerformed
        
        operacao = '+';
        
        n1 = Double.parseDouble(jTvisor.getText());
        
        jTvisor.setText("");
        
    }//GEN-LAST:event_jBadicaoActionPerformed

    private void jBpontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpontoActionPerformed
       
        NumeroDigitado(".");
        
    }//GEN-LAST:event_jBpontoActionPerformed

    private void jBresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresultActionPerformed
        
        n2 = Double.parseDouble(jTvisor.getText());
        
        switch (operacao) {
            
            case '+':
                
                result = n1 + n2;
                
                break;
                
            case '-':
                
                result = n1 - n2;
                
                break;
                
            case '*':
                
                result = n1 * n2;
                
                break;
                
            case '/':
                
                result = n1 / n2;
                
                break;
                
        }
        
        jTvisor.setText(String.valueOf(result));
        
    }//GEN-LAST:event_jBresultActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        
        NumeroDigitado("6");
        
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        
        NumeroDigitado("5");
        
    }//GEN-LAST:event_jB5ActionPerformed

    private void jBbspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbspActionPerformed
        
        temp = numantes;
        
        jTvisor.setText(temp);
        
    }//GEN-LAST:event_jBbspActionPerformed

    private void jBctrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBctrolActionPerformed
        
        n1 = 0;
        
        n2 = 0;
        
        jTvisor.setText("");
        
    }//GEN-LAST:event_jBctrolActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        
        NumeroDigitado("3");
        
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        
        NumeroDigitado("2");
        
    }//GEN-LAST:event_jB2ActionPerformed

    private void jBsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubActionPerformed
        
        operacao = '-';
        
        n1 = Double.parseDouble(jTvisor.getText());
        
        jTvisor.setText("");
        
    }//GEN-LAST:event_jBsubActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        
        NumeroDigitado("9");
        
    }//GEN-LAST:event_jB9ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new JCalculadora().setVisible(true);
                
            }
            
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB310;
    private javax.swing.JButton jB311;
    private javax.swing.JButton jB312;
    private javax.swing.JButton jB313;
    private javax.swing.JButton jB314;
    private javax.swing.JButton jB315;
    private javax.swing.JButton jB316;
    private javax.swing.JButton jB317;
    private javax.swing.JButton jB318;
    private javax.swing.JButton jB319;
    private javax.swing.JButton jBadicao31;
    private javax.swing.JButton jBbsp31;
    private javax.swing.JButton jBce31;
    private javax.swing.JButton jBctrol31;
    private javax.swing.JButton jBdiv31;
    private javax.swing.JButton jBmult31;
    private javax.swing.JButton jBponto31;
    private javax.swing.JButton jBresult31;
    private javax.swing.JButton jBsub31;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTvisor;
    // End of variables declaration//GEN-END:variables
}
