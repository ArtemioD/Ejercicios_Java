package igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Controlador;

public class Principal extends javax.swing.JFrame {
    
    Controlador c = new Controlador();
    double num1,  num2, resul;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("DFKai-SB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Calculadora");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese un numero :");

        txtNum1.setBackground(new java.awt.Color(255, 255, 255));
        txtNum1.setForeground(new java.awt.Color(0, 0, 0));
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese otro :");

        txtNum2.setBackground(new java.awt.Color(255, 255, 255));
        txtNum2.setForeground(new java.awt.Color(0, 0, 0));
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(255, 255, 255));
        btnSuma.setForeground(new java.awt.Color(0, 0, 0));
        btnSuma.setText("Sumar");
        btnSuma.setFocusPainted(false);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(255, 255, 255));
        btnResta.setForeground(new java.awt.Color(0, 0, 0));
        btnResta.setText("Restar");
        btnResta.setFocusPainted(false);
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMul.setBackground(new java.awt.Color(255, 255, 255));
        btnMul.setForeground(new java.awt.Color(0, 0, 0));
        btnMul.setText("Multiplicar");
        btnMul.setFocusPainted(false);
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(255, 255, 255));
        btnDiv.setForeground(new java.awt.Color(0, 0, 0));
        btnDiv.setText("Dividir");
        btnDiv.setFocusPainted(false);
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Resultado:");

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnSuma)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnResta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnMul))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum1)
                            .addComponent(txtNum2)
                            .addComponent(txtResultado))))
                .addGap(18, 18, 18)
                .addComponent(btnDiv)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResta)
                    .addComponent(btnMul)
                    .addComponent(btnDiv)
                    .addComponent(btnSuma))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        
        if (txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
            // advertir que los campos estan vasios
            JOptionPane cartel = new JOptionPane("Alguno de los campos necesarios esta vasio");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("ERROR");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);
            
            
        }else {
        
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        
        resul = c.sumar(num1, num2);
        
        //txtResultado.setText("" + resil);
        txtResultado.setText(Double.toString(resul)); 
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        
        if (txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
            // advertir que los campos estan vasios
            JOptionPane cartel = new JOptionPane("Alguno de los campos necesarios esta vasio");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("ERROR");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);
            
            
        }else {
        
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        
        resul = c.restar(num1, num2);
        
        //txtResultado.setText("" + resil);
        txtResultado.setText(Double.toString(resul));
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        
        if (txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
            // advertir que los campos estan vasios
            JOptionPane cartel = new JOptionPane("Alguno de los campos necesarios esta vasio");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("ERROR");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);
            
            
        }else {
        
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        
        resul = c.multipicar(num1, num2);
        
        //txtResultado.setText("" + resil);
        txtResultado.setText(Double.toString(resul));
        }
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        
        if (txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
            // advertir que los campos estan vasios
            JOptionPane cartel = new JOptionPane("Alguno de los campos necesarios esta vasio");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("ERROR");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);
            
            
        }else {
        
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        
        resul = c.dividir(num1, num2);
        
        //txtResultado.setText("" + resil);
        txtResultado.setText(Double.toString(resul));
        }
    }//GEN-LAST:event_btnDivActionPerformed

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        
        char car = evt.getKeyChar(); // si no es numero se consume y muestar solo numeros
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
        
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNum2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
