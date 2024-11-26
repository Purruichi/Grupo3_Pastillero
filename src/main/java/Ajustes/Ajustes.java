/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ajustes;

import Database.DatabaseFunctions;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;




/**
 *
 * @author bolli
 */
public class Ajustes extends javax.swing.JFrame {

    private static HashMap<String, String> userData;
    int xMouse;
    int yMouse;
    boolean notificacion;
    
    /**
     * Creates new form Ajustes
     */
    public Ajustes(HashMap<String, String> userData) {
        initComponents();
        jComboBoxIdiomas.addActionListener(evt -> cambiarIdioma());
        jNotificacionONOFF.setVisible(false);
        jNumContacto.setVisible(false);
        jManualUso.setVisible(false);
        jComboBoxIdiomas.setVisible(false);
        //panelManualUso.setVisible(false);
    
    }
    public boolean getNotificacion(){
        return notificacion;
    }
    
    
    //POR IMPLEMENTAR
    private void cambiarIdioma() {
        String selectedLanguage = (String) jComboBoxIdiomas.getSelectedItem();
        if ("English".equals(selectedLanguage)) {
        } else if ("Español".equals(selectedLanguage)) {
        }
    }
    
    private void actualizarTextos(){


        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAjustes = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        lblMyPills = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblAjustes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jNotificacionONOFF = new javax.swing.JToggleButton();
        jComboBoxIdiomas = new javax.swing.JComboBox<>();
        jNumContacto = new javax.swing.JToggleButton();
        jManualUso = new javax.swing.JButton();
        jDeleteCuenta = new javax.swing.JToggleButton();
        jButtonSoporte = new javax.swing.JButton();
        jButtonNotificacion = new javax.swing.JButton();
        jButtonIdioma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        pnlAjustes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAjustes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(204, 204, 204));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        lblMyPills.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMyPills.setText("MyPills");

        lblX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("x");
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMyPills, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyPills, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlAjustes.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 20));

        lblAjustes.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAjustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjustes.setText("Settings");
        pnlAjustes.add(lblAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 46, 169, 50));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jNotificacionONOFF.setText("Notifications OFF");
        jNotificacionONOFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNotificacionONOFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNotificacionONOFFMouseClicked(evt);
            }
        });
        jNotificacionONOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNotificacionONOFFActionPerformed(evt);
            }
        });

        jComboBoxIdiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spanish", "English", "French" }));
        jComboBoxIdiomas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxIdiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdiomasActionPerformed(evt);
            }
        });

        jNumContacto.setText("Contact number");
        jNumContacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNumContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumContactoActionPerformed(evt);
            }
        });

        jManualUso.setText("App Manual");
        jManualUso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jManualUso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jManualUsoMouseClicked(evt);
            }
        });
        jManualUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManualUsoActionPerformed(evt);
            }
        });

        jDeleteCuenta.setText("Delete your account");
        jDeleteCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDeleteCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNotificacionONOFF, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(jComboBoxIdiomas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jManualUso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDeleteCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jNotificacionONOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jComboBoxIdiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jDeleteCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jNumContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jManualUso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pnlAjustes.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 510, 500));

        jButtonSoporte.setText("Help and support");
        jButtonSoporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSoporteMouseClicked(evt);
            }
        });
        jButtonSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoporteActionPerformed(evt);
            }
        });
        pnlAjustes.add(jButtonSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 40));

        jButtonNotificacion.setText("Notifications");
        jButtonNotificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNotificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNotificacionMouseClicked(evt);
            }
        });
        jButtonNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotificacionActionPerformed(evt);
            }
        });
        pnlAjustes.add(jButtonNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 40));

        jButtonIdioma.setText("Language");
        jButtonIdioma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIdiomaMouseClicked(evt);
            }
        });
        jButtonIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdiomaActionPerformed(evt);
            }
        });
        pnlAjustes.add(jButtonIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAjustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoporteActionPerformed
       
        
    }//GEN-LAST:event_jButtonSoporteActionPerformed

    private void jButtonNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNotificacionActionPerformed

    private void jButtonIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIdiomaActionPerformed

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x=evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblXMouseClicked

    private void jNotificacionONOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNotificacionONOFFActionPerformed
        if (jNotificacionONOFF.isSelected()){
            jNotificacionONOFF.setText("Notifications ON");
            notificacion = true;
        }
        else{
            jNotificacionONOFF.setText("Notifictions OFF");
            notificacion=false;
        }
    }//GEN-LAST:event_jNotificacionONOFFActionPerformed

    private void jComboBoxIdiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdiomasActionPerformed
        // TODO add your handling code here:  
        
    }//GEN-LAST:event_jComboBoxIdiomasActionPerformed

    private void jNumContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumContactoActionPerformed
        
    }//GEN-LAST:event_jNumContactoActionPerformed

    private void jButtonNotificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNotificacionMouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==jButtonNotificacion){
            jNotificacionONOFF.setVisible(true);
            jComboBoxIdiomas.setVisible(false);
            jNumContacto.setVisible(false);
            jManualUso.setVisible(false);
            //panelManualUso.setVisible(false);
        }   
    }//GEN-LAST:event_jButtonNotificacionMouseClicked

    private void jButtonSoporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSoporteMouseClicked
        // TODO add your handling code here:
        if (evt.getSource() == jButtonSoporte) {
            jNumContacto.setVisible(true);
            jManualUso.setVisible(true);
            jNotificacionONOFF.setVisible(false);
            jComboBoxIdiomas.setVisible(false);
            //panelManualUso.setVisible(false);
        }
    }//GEN-LAST:event_jButtonSoporteMouseClicked

    private void jButtonIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIdiomaMouseClicked
        if (evt.getSource() == jButtonIdioma) {
            jNumContacto.setVisible(false);
            jManualUso.setVisible(false);
            jNotificacionONOFF.setVisible(false);
            jComboBoxIdiomas.setVisible(true);
            //panelManualUso.setVisible(false);
        }
    }//GEN-LAST:event_jButtonIdiomaMouseClicked

    private void jNotificacionONOFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNotificacionONOFFMouseClicked
       
    }//GEN-LAST:event_jNotificacionONOFFMouseClicked

    private void jManualUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManualUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jManualUsoActionPerformed

    private void jManualUsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jManualUsoMouseClicked
        if (evt.getSource() == jManualUso) {
            jNumContacto.setVisible(false);
            jManualUso.setVisible(false);
            jNotificacionONOFF.setVisible(false);
            jComboBoxIdiomas.setVisible(false);

            try {
                InputStream pdfStream = getClass().getResourceAsStream("/resources/UserManual.pdf");
                if (pdfStream == null) {
                    throw new FileNotFoundException("No se pudo encontrar UserManual.pdf en el classpath.");
                }

                File tempFile = File.createTempFile("UserManual", ".pdf");
                tempFile.deleteOnExit();

                try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = pdfStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(tempFile);
                } else {
                    JOptionPane.showMessageDialog(this, 
                        "La funcionalidad para abrir archivos no está soportada en este sistema.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, 
                    "Ocurrió un error al intentar abrir el manual de usuario.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        
}

    }//GEN-LAST:event_jManualUsoMouseClicked

    private void jDeleteCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteCuentaActionPerformed
        // TODO add your handling code here:
        DatabaseFunctions.DELETE(users);
    }//GEN-LAST:event_jDeleteCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIdioma;
    private javax.swing.JButton jButtonNotificacion;
    private javax.swing.JButton jButtonSoporte;
    private javax.swing.JComboBox<String> jComboBoxIdiomas;
    private javax.swing.JToggleButton jDeleteCuenta;
    private javax.swing.JButton jManualUso;
    private javax.swing.JToggleButton jNotificacionONOFF;
    private javax.swing.JToggleButton jNumContacto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblMyPills;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlAjustes;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
