/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package anadir;

import Database.DatabaseFunctions;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import login.LogIn;
import mainWindow.mainWindow;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 *
 * @author javieribarra
 */
public class anadir extends javax.swing.JFrame  {
    
    private boolean isMouseInside = false;
    int xMouse, yMouse;
    private JLabel selectedLabel = null;

    
    public HashMap<String, String> userData = new HashMap<>();
    
    /**
     * Creates new form anadir
     * @param userData
     */
    public anadir(HashMap<String, String> userData) {
        this.userData = userData;
        initComponents();
        setImageLabel(windowIcon, "/small-logo.png");
        setImageLabel(lblMaximize, "/Maximizar.png");
        setImageLabel(lblMinimize, "/Guion.png");
        setImageLabel(lblCapsule, "/meds.png");
        setImageLabel(lblTablet, "/pastillas.png");
        setImageLabel(lblDrops, "/jarabe.png");
        btnMINIMIZAR.setOpaque(true);
        lblMinimize.setOpaque(false);
        btnMAXIMIZAR.setOpaque(true);
        lblMaximize.setOpaque(false);
        configurarListeners();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    /*public anadir(){
        this(new HashMap<>(){{
            put("username", "Salvador Cabrera Parra");
            put("email", "demo@example.com");
        }});
        
        
    }*/

    
    private void configurarListeners() {
        // MouseListener compartido
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!isMouseInside) {
                    isMouseInside = true;
                    System.out.println("Ratón ha entrado en el área combinada");
                    btnMINIMIZAR.setBackground(Color.WHITE); // Cambia el color del JPanel
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Verifica si el ratón ha salido de ambas áreas (btnMINIMIZAR y lblMinimize)
                Component source = e.getComponent();
                if (source.equals(btnMINIMIZAR) && !lblMinimize.getBounds().contains(e.getPoint()) ||
                    source.equals(lblMinimize) && !btnMINIMIZAR.getBounds().contains(SwingUtilities.convertPoint(lblMinimize, e.getPoint(), btnMINIMIZAR))) {
                    isMouseInside = false;
                    System.out.println("Ratón ha salido del área combinada");
                    btnMINIMIZAR.setBackground(new Color(204,204,204)); // Restaura el color del JPanel
                }
            }
        };
        
        MouseAdapter mouseAdapter2 = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!isMouseInside) {
                    isMouseInside = true;
                    //System.out.println("Ratón ha entrado en el área combinada");
                    btnMAXIMIZAR.setBackground(Color.WHITE); // Cambia el color del JPanel
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Verifica si el ratón ha salido de ambas áreas (btnMINIMIZAR y lblMinimize)
                Component source = e.getComponent();
                if (source.equals(btnMAXIMIZAR) && !lblMaximize.getBounds().contains(e.getPoint()) ||
                    source.equals(lblMaximize) && !btnMAXIMIZAR.getBounds().contains(SwingUtilities.convertPoint(lblMaximize, e.getPoint(), btnMAXIMIZAR))) {
                    isMouseInside = false;
                    //System.out.println("Ratón ha salido del área combinada");
                    btnMAXIMIZAR.setBackground(new Color(204,204,204)); // Restaura el color del JPanel
                }
            }
        };
        
        

        // Agrega el MouseListener al JPanel y al JLabel
        btnMINIMIZAR.addMouseListener(mouseAdapter);
        lblMinimize.addMouseListener(mouseAdapter);
        btnMAXIMIZAR.addMouseListener(mouseAdapter2);
        lblMaximize.addMouseListener(mouseAdapter2);
    }
    
    private void selectImage(JLabel imageLabel) {
    // Deseleccionar la imagen actualmente seleccionada (si existe)
    if (selectedLabel != null) {
        selectedLabel.setBackground(Color.WHITE);
        selectedLabel.setOpaque(false);
    }

    // Seleccionar la nueva imagen
    selectedLabel = imageLabel;
    selectedLabel.setBackground(new Color(51,153,255));
    selectedLabel.setOpaque(true);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        pnlFondo = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        btnX = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        btnMAXIMIZAR = new javax.swing.JPanel();
        lblMaximize = new javax.swing.JLabel();
        btnMINIMIZAR = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        windowIcon = new javax.swing.JLabel();
        lblMyPills = new javax.swing.JLabel();
        pnlType = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        lblTablet = new javax.swing.JLabel();
        lblCapsule = new javax.swing.JLabel();
        lblDrops = new javax.swing.JLabel();
        pnlGeneralInformation = new javax.swing.JPanel();
        txtFieldName = new javax.swing.JTextField();
        txtFieldQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlTimeline = new javax.swing.JPanel();
        lblTimeline = new javax.swing.JLabel();
        boxDuration = new javax.swing.JComboBox<>();
        boxFrequency = new javax.swing.JComboBox<>();
        btnAnadir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnX.setBackground(new java.awt.Color(255, 0, 0));
        btnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnX.setOpaque(false);
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXMouseExited(evt);
            }
        });
        btnX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("x");
        lblX.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnX.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        titleBar.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 20));

        btnMAXIMIZAR.setBackground(new java.awt.Color(204, 204, 204));
        btnMAXIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMAXIMIZAR.setOpaque(false);
        btnMAXIMIZAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaximize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaximize.setToolTipText("");
        lblMaximize.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblMaximize.setMaximumSize(new java.awt.Dimension(8, 17));
        lblMaximize.setMinimumSize(new java.awt.Dimension(8, 17));
        lblMaximize.setPreferredSize(new java.awt.Dimension(8, 17));
        btnMAXIMIZAR.add(lblMaximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 20));

        titleBar.add(btnMAXIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 20));

        btnMINIMIZAR.setBackground(new java.awt.Color(204, 204, 204));
        btnMINIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMINIMIZAR.setOpaque(false);
        btnMINIMIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMINIMIZARMouseClicked(evt);
            }
        });
        btnMINIMIZAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setFont(new java.awt.Font("Shree Devanagari 714", 0, 13)); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        btnMINIMIZAR.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 20));

        titleBar.add(btnMINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 20));
        titleBar.add(windowIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        lblMyPills.setFont(new java.awt.Font("PT Mono", 1, 12)); // NOI18N
        lblMyPills.setText("MyPills");
        titleBar.add(lblMyPills, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 250, 20));

        pnlFondo.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        pnlType.setBackground(new java.awt.Color(255, 255, 255));
        pnlType.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblType.setBackground(new java.awt.Color(153, 204, 255));
        lblType.setFont(new java.awt.Font("PT Mono", 3, 18)); // NOI18N
        lblType.setText("TYPE");
        pnlType.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        lblTablet.setText("jLabel1");
        lblTablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTabletMouseClicked(evt);
            }
        });
        pnlType.add(lblTablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 60, 50));

        lblCapsule.setText("jLabel1");
        lblCapsule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCapsuleMouseClicked(evt);
            }
        });
        pnlType.add(lblCapsule, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 60, 50));

        lblDrops.setText("jLabel1");
        lblDrops.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDropsMouseClicked(evt);
            }
        });
        pnlType.add(lblDrops, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 60, 50));

        pnlFondo.add(pnlType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 720, 90));

        pnlGeneralInformation.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneralInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFieldName.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        txtFieldName.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldName.setText("Enter the name of the medication.");
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
        pnlGeneralInformation.add(txtFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 550, -1));

        txtFieldQuantity.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        txtFieldQuantity.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldQuantity.setText("Enter the dose of the medication.");
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
        pnlGeneralInformation.add(txtFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 550, -1));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("PT Mono", 3, 18)); // NOI18N
        jLabel1.setText("GENERAL INFORMATION");
        pnlGeneralInformation.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));

        pnlFondo.add(pnlGeneralInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 720, 140));

        pnlTimeline.setBackground(new java.awt.Color(255, 255, 255));
        pnlTimeline.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTimeline.setFont(new java.awt.Font("PT Mono", 3, 18)); // NOI18N
        lblTimeline.setText("TIMELINE & SCHEDULE");
        pnlTimeline.add(lblTimeline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        boxDuration.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        boxDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duration" }));
        boxDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDurationActionPerformed(evt);
            }
        });
        pnlTimeline.add(boxDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 450, -1));

        boxFrequency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frequency" }));
        pnlTimeline.add(boxFrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 450, -1));

        pnlFondo.add(pnlTimeline, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 720, 120));

        btnAnadir.setBackground(new java.awt.Color(0, 255, 51));
        btnAnadir.setFont(new java.awt.Font("PT Mono", 3, 18)); // NOI18N
        btnAnadir.setText("OK");
        btnAnadir.setBorder(null);
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnadirMouseClicked(evt);
            }
        });
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 50));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        btnCancelar.setText("CANCEL");
        btnCancelar.setBorder(null);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        pnlFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 90, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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
        values[5] = txtFieldQuantity.getText();
        DatabaseFunctions.INSERT("user_meds", values);
        dispose();
    }//GEN-LAST:event_btnAnadirMouseClicked

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnXMouseClicked

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setOpaque(true);
        lblX.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setOpaque(false);
        lblX.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnXMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnMINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMINIMIZARMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMINIMIZARMouseClicked

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void boxDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDurationActionPerformed

    private void lblCapsuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCapsuleMouseClicked
        // TODO add your handling code here:
        selectImage(lblCapsule);
    }//GEN-LAST:event_lblCapsuleMouseClicked

    private void lblDropsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDropsMouseClicked
        // TODO add your handling code here:
        selectImage(lblDrops);
    }//GEN-LAST:event_lblDropsMouseClicked

    private void lblTabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTabletMouseClicked
        // TODO add your handling code here:
        selectImage(lblTablet);
    }//GEN-LAST:event_lblTabletMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked
    
    private void setImageLabel(JLabel labelN, String root){
        ImageIcon imagen = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelN.getWidth(), labelN.getHeight(), Image.SCALE_SMOOTH));
        labelN.setIcon(icon);
        this.repaint();
    }
    
    
    public void cambiarIdioma(String idioma, String pais) {
        Locale localizacion = new Locale(idioma, pais);
        ResourceBundle bundle = ResourceBundle.getBundle("messages", localizacion);
    
        // Cambiar textos de la interfaz
        setTitle(bundle.getString("anadir_usuario"));  // Título de la ventana
        lblType.setText(bundle.getString("tipo"));
        lblTimeline.setText(bundle.getString("cronograma"));
        btnAnadir.setText(bundle.getString("boton_guardar"));
        btnCancelar.setText(bundle.getString("boton_cancelar"));
        txtFieldName.setText(bundle.getString("nombre_medicina"));
        txtFieldQuantity.setText(bundle.getString("cantidad_medicina"));
    }
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anadir().setVisible(true);
            }
        });
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDuration;
    private javax.swing.JComboBox<String> boxFrequency;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel btnMAXIMIZAR;
    private javax.swing.JPanel btnMINIMIZAR;
    private javax.swing.JPanel btnX;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCapsule;
    private javax.swing.JLabel lblDrops;
    private javax.swing.JLabel lblMaximize;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblMyPills;
    private javax.swing.JLabel lblTablet;
    private javax.swing.JLabel lblTimeline;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlGeneralInformation;
    private javax.swing.JPanel pnlTimeline;
    private javax.swing.JPanel pnlType;
    private javax.swing.JPanel titleBar;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldQuantity;
    private javax.swing.JLabel windowIcon;
    // End of variables declaration//GEN-END:variables
}
