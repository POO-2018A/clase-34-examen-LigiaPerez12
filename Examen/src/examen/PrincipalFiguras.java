
package examen;

import interfaces.Equilatero;

public class PrincipalFiguras extends javax.swing.JFrame {

   
    
    public PrincipalFiguras() {
        initComponents();
        this.setTitle("Interfaces");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbxTiposTriangulos = new javax.swing.JComboBox<>();
        lblElejirFigura = new javax.swing.JLabel();
        panelIsosceles = new javax.swing.JPanel();
        lblLadoC = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();
        lblIsosceles = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelRectangulo = new javax.swing.JPanel();
        lblAltura = new javax.swing.JLabel();
        lblBase = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtBase = new javax.swing.JTextField();
        lblRectangulo = new javax.swing.JLabel();
        panelEquilatero = new javax.swing.JPanel();
        lblEquilatero = new javax.swing.JLabel();
        lblLado = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        lblValorArea = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblValorPerimetro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEscaleno = new javax.swing.JLabel();
        lblLadoA = new javax.swing.JLabel();
        lblLadoB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        txtLadoB = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbxTiposTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo" }));
        cmbxTiposTriangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTiposTriangulosActionPerformed(evt);
            }
        });

        lblElejirFigura.setText("Elija la Figura :");

        panelIsosceles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblLadoC.setText("Lado");

        lblIsosceles.setText("ISOSCELES");

        lblLado2.setText("Lado2");

        javax.swing.GroupLayout panelIsoscelesLayout = new javax.swing.GroupLayout(panelIsosceles);
        panelIsosceles.setLayout(panelIsoscelesLayout);
        panelIsoscelesLayout.setHorizontalGroup(
            panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsoscelesLayout.createSequentialGroup()
                .addGroup(panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelIsoscelesLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblIsosceles))
                    .addGroup(panelIsoscelesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLadoC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIsoscelesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelIsoscelesLayout.setVerticalGroup(
            panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIsoscelesLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblIsosceles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoC)
                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIsoscelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelRectangulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAltura.setText("Altura");

        lblBase.setText("Base");

        txtBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseActionPerformed(evt);
            }
        });

        lblRectangulo.setText("RECTANGULO");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBase)
                    .addComponent(lblAltura))
                .addGap(30, 30, 30)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRectangulo)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBase)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelEquilatero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEquilatero.setText("EQUILATERO");

        lblLado.setText("Lado");

        javax.swing.GroupLayout panelEquilateroLayout = new javax.swing.GroupLayout(panelEquilatero);
        panelEquilatero.setLayout(panelEquilateroLayout);
        panelEquilateroLayout.setHorizontalGroup(
            panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquilateroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLado)
                .addGap(20, 20, 20)
                .addGroup(panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquilatero)
                    .addGroup(panelEquilateroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEquilateroLayout.setVerticalGroup(
            panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquilateroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEquilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado)
                    .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblValorArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblValorPerimetro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblEscaleno.setText("ESCALENO");

        lblLadoA.setText("Lado");

        lblLadoB.setText("Lado2");

        jLabel3.setText("Lado3");

        txtLadoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoAActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(lblEscaleno))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblLadoB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLadoB))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLadoA)
                        .addGap(18, 18, 18)
                        .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEscaleno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoA)
                    .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoB)
                    .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblElejirFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbxTiposTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblValorPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelIsosceles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelEquilatero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnCalcular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxTiposTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElejirFigura))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEquilatero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelIsosceles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorArea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxTiposTriangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTiposTriangulosActionPerformed
     
            
            panelIsosceles.setVisible(true);
            panelEscaleno.setVisible(true);
            panelEquilatero.setVisible(true);
            panelRectangulo.setVisible(true);
        
        if(cmbxTiposTriangulos.getSelectedItem().equals("Isosceles")){
            panelRectangulo.setVisible(false);
            panelEscaleno.setVisible(false);
            panelEquilatero.setVisible(false);
            
            
        }else if(cmbxTiposTriangulos.getSelectedItem().equals("Rectangulo")){
            panelEscaleno.setVisible(false);
            panelEquilatero.setVisible(false);
            panelIsosceles.setVisible(false);
            
        }else if(cmbxTiposTriangulos.getSelectedItem().equals("Equilatero")){
            panelRectangulo.setVisible(false);
            panelEscaleno.setVisible(false);
            panelIsosceles.setVisible(false);
            
        }else if(cmbxTiposTriangulos.getSelectedItem().equals("Escaleno")){
            panelRectangulo.setVisible(false);
            panelEquilatero.setVisible(false);
            panelIsosceles.setVisible(false);
            
        }

        
    }//GEN-LAST:event_cmbxTiposTriangulosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
   
        if (cmbxTiposTriangulos.getSelectedItem().equals("Equilatero")) {
            Figura f1 = new Equilatero();
            double lado = Double.parseDouble(txtLadoC.getText());
            double equilatero = f1.calcularArea(lado,0);
            String Equilatero = String.valueOf(equilatero);
            lblValorArea.setText("El area del Equilatero es : "+Equilatero);
            //perimetero
            double ladoP = Double.parseDouble(txtLadoC.getText());
            double equilatero1 = f1.calcularPerimetro(ladoP,0,0);
            String EquilateroP = String.valueOf(equilatero1);
            lblValorPerimetro.setText("El perimetro del Equilatero es : "+EquilateroP);
            
            //altura
            double ladoA = Double.parseDouble(txtLadoC.getText());
            double equilatero2 = f1.calcularAltura(ladoP,0,0);
            String EquilateroA = String.valueOf(equilatero2);
            lblValorPerimetro.setText("La altura del Equilatero es : "+EquilateroA);
         
            
        } else if (cmbxTiposTriangulos.getSelectedItem().equals("Rectangulo")) {
            Figura f1 = new Rectangulo();
            double lado1 = Double.parseDouble(txtAltura.getText());
            double lado2 = Double.parseDouble(txtBase.getText());
            double rectangulo = f1.calcularArea(lado1,lado2);
            String Rectangulo = String.valueOf(rectangulo);
            lblValorArea.setText("El area del rectangulo es : "+Rectangulo);
            
            //perimetro
            
            double lado1P = Double.parseDouble(txtAltura.getText());
            double lado2P = Double.parseDouble(txtBase.getText());
            double rectanguloP = f1.calcularPerimetro(lado1P,lado2P,1);
                String RectanguloP = String.valueOf(rectanguloP);
            lblValorPerimetro.setText("El perimetro del rectangulo es : "+RectanguloP);
            
            //Altura
            double lado1A = Double.parseDouble(txtAltura.getText());
            double lado2A = Double.parseDouble(txtBase.getText());
            double rectanguloA = f1.calcularAltura(lado1A,lado2A,1);
            String RectanguloA = String.valueOf(rectanguloP);
            lblValorPerimetro.setText("La altura del rectangulo es : "+RectanguloA);
            
        } 
           
            
        } 
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseActionPerformed

    private void txtLadoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoAActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbxTiposTriangulos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblElejirFigura;
    private javax.swing.JLabel lblEquilatero;
    private javax.swing.JLabel lblEscaleno;
    private javax.swing.JLabel lblIsosceles;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLadoA;
    private javax.swing.JLabel lblLadoB;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblRectangulo;
    private javax.swing.JLabel lblValorArea;
    private javax.swing.JLabel lblValorPerimetro;
    private javax.swing.JPanel panelEquilatero;
    private javax.swing.JPanel panelIsosceles;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoB;
    private javax.swing.JTextField txtLadoC;
    // End of variables declaration//GEN-END:variables
}
