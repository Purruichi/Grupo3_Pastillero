/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package anadir;

import Database.DatabaseFunctions;
import java.awt.Color;
import java.awt.Image;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author javieribarra
 */
public class anadir extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public HashMap<String, String> userData = new HashMap<>();
    
    /**
     * Creates new form anadir
     * @param userData
     */
    public anadir(HashMap<String, String> userData) {
        this.userData = userData;
        initComponents();
        setImageLabel(lblIcon, "/small-logo.png");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        jLabel2 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFieldQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldDose = new javax.swing.JTextField();
        btnAnadir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre medicina:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 237, 49));

        txtFieldName.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        txtFieldName.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldName.setText("Ingrese el nombre de la medicina");
        txtFieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNameFocusLost(evt);
            }
        });
        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 231, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad restante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 237, 49));

        txtFieldQuantity.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        txtFieldQuantity.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldQuantity.setText("Ingrese la cantidad de la medicina");
        txtFieldQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldQuantityFocusLost(evt);
            }
        });
        txtFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldQuantityActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dosis:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 237, 49));

        txtFieldDose.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        txtFieldDose.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldDose.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldDose.setText("Ingrese la dosis de la medicina");
        txtFieldDose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldDoseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldDoseFocusLost(evt);
            }
        });
        txtFieldDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDoseActionPerformed(evt);
            }
        });
        jPanel1.add(txtFieldDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 230, -1));

        btnAnadir.setBackground(new java.awt.Color(0, 255, 51));
        btnAnadir.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btnAnadir.setText("AÑADIR");
        btnAnadir.setBorder(null);
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        jPanel1.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 381, 140, 56));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 381, 151, 56));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setOpaque(false);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("x");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 20));
        jPanel2.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("MyPills");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameActionPerformed

    private void txtFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldQuantityActionPerformed

    private void txtFieldNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNameFocusGained
        if(txtFieldName.getText().equals("Ingrese el nombre de la medicina")){
            txtFieldName.setText("");
        }
    }//GEN-LAST:event_txtFieldNameFocusGained

    private void txtFieldQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldQuantityFocusGained
        if(txtFieldQuantity.getText().equals("Ingrese la cantidad de la medicina")){
            txtFieldQuantity.setText("");
        }
    }//GEN-LAST:event_txtFieldQuantityFocusGained

    private void txtFieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNameFocusLost
        if(txtFieldName.getText().equals("")){
            txtFieldName.setText("Ingrese el nombre de la medicina");
        }
    }//GEN-LAST:event_txtFieldNameFocusLost

    private void txtFieldQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldQuantityFocusLost
        if(txtFieldQuantity.getText().equals("")){
            txtFieldQuantity.setText("Ingrese la cantidad de la medicina");
        }
    }//GEN-LAST:event_txtFieldQuantityFocusLost

    private void btnAnadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseClicked
        String[] values = new String[6];
        values[0] = userData.get("id");
        ArrayList<HashMap<String, String>> medicinas = DatabaseFunctions.SELECT("medicines", new String[0], "name", txtFieldName.getText());
        String medId = medicinas.get(0).get("id");
        values[1] = medId;
        values[2] = txtFieldQuantity.getText();
        values[3] = "0";
        values[4] = "2024-10-04 08:00:00.000";
        values[5] = txtFieldDose.getText();
        DatabaseFunctions.INSERT("user_meds", values);
        dispose();
    }//GEN-LAST:event_btnAnadirMouseClicked

    private void txtFieldDoseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDoseFocusGained
        if(txtFieldDose.getText().equals("Ingrese la dosis de la medicina")){
            txtFieldDose.setText("");
        }
    }//GEN-LAST:event_txtFieldDoseFocusGained

    private void txtFieldDoseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDoseFocusLost
        if(txtFieldDose.getText().equals("")){
            txtFieldDose.setText("Ingrese la dosis de la medicina");
        }
    }//GEN-LAST:event_txtFieldDoseFocusLost

    private void txtFieldDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDoseActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setOpaque(true);
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setOpaque(false);
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged
    
    private void setImageLabel(JLabel labelN, String root){
        ImageIcon imagen = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelN.getWidth(), labelN.getHeight(), Image.SCALE_SMOOTH));
        labelN.setIcon(icon);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JTextField txtFieldDose;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
