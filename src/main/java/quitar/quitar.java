/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quitar;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author salvadorcabreraparra
 */
public class quitar extends javax.swing.JFrame {
   
    int xMouse,yMouse;
    public quitar() {
        initComponents();
        setSize(800, 500);
        //Arreglar para que no se cierre toda la app al cerrar la ventana de quitar
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelX = new javax.swing.JPanel();
        textoX = new javax.swing.JLabel();
        panelDeArrastre = new javax.swing.JPanel();
        panelDeMedicamentos = new javax.swing.JPanel();
        panelDondeSeVenLosMedicamentos = new javax.swing.JScrollPane();
        medicamentos = new javax.swing.JLabel();
        panelBotonAceptar = new javax.swing.JPanel();
        textoAceptar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelX.setBackground(new java.awt.Color(255, 255, 255));

        textoX.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        textoX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoX.setText("X");
        textoX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoXMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelXLayout = new javax.swing.GroupLayout(panelX);
        panelX.setLayout(panelXLayout);
        panelXLayout.setHorizontalGroup(
            panelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoX, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelXLayout.setVerticalGroup(
            panelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelXLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        panelDeArrastre.setBackground(new java.awt.Color(255, 255, 255));
        panelDeArrastre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelDeArrastreMouseDragged(evt);
            }
        });
        panelDeArrastre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDeArrastreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelDeArrastreLayout = new javax.swing.GroupLayout(panelDeArrastre);
        panelDeArrastre.setLayout(panelDeArrastreLayout);
        panelDeArrastreLayout.setHorizontalGroup(
            panelDeArrastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelDeArrastreLayout.setVerticalGroup(
            panelDeArrastreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelDeArrastre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout panelDeMedicamentosLayout = new javax.swing.GroupLayout(panelDeMedicamentos);
        panelDeMedicamentos.setLayout(panelDeMedicamentosLayout);
        panelDeMedicamentosLayout.setHorizontalGroup(
            panelDeMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDondeSeVenLosMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        panelDeMedicamentosLayout.setVerticalGroup(
            panelDeMedicamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDondeSeVenLosMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        jPanel1.add(panelDeMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 620, 250));

        medicamentos.setFont(new java.awt.Font("Letter Gothic Std", 0, 18)); // NOI18N
        medicamentos.setText("MEDICAMENTOS ");
        jPanel1.add(medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        panelBotonAceptar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelBotonAceptarLayout = new javax.swing.GroupLayout(panelBotonAceptar);
        panelBotonAceptar.setLayout(panelBotonAceptarLayout);
        panelBotonAceptarLayout.setHorizontalGroup(
            panelBotonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelBotonAceptarLayout.setVerticalGroup(
            panelBotonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelBotonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 30));

        textoAceptar.setBackground(new java.awt.Color(255, 255, 255));
        textoAceptar.setFont(new java.awt.Font("Letter Gothic Std", 0, 13)); // NOI18N
        textoAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAceptar.setText("ACEPTAR");
        textoAceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(textoAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelDeArrastreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDeArrastreMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
    }//GEN-LAST:event_panelDeArrastreMousePressed

    private void panelDeArrastreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDeArrastreMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_panelDeArrastreMouseDragged

    private void textoXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_textoXMouseClicked

    private void textoAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAceptarMouseClicked
       System.exit(0);
    }//GEN-LAST:event_textoAceptarMouseClicked

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
            java.util.logging.Logger.getLogger(quitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quitar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medicamentos;
    private javax.swing.JPanel panelBotonAceptar;
    private javax.swing.JPanel panelDeArrastre;
    private javax.swing.JPanel panelDeMedicamentos;
    private javax.swing.JScrollPane panelDondeSeVenLosMedicamentos;
    private javax.swing.JPanel panelX;
    private javax.swing.JLabel textoAceptar;
    private javax.swing.JLabel textoX;
    // End of variables declaration//GEN-END:variables
}
