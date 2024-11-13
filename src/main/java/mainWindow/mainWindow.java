/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainWindow;

import login.LogIn;
import Database.DatabaseFunctions;
import anadir.anadir;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import quitar.quitar;
import Languages.*;

/**
 *
 * @author andre
 */
public class mainWindow extends javax.swing.JFrame implements IdiomaListener{
    
    private boolean isMouseInside = false;
    int xMouse, yMouse;
    private quitar quitarWindow;
    private anadir anadirWindow;
    
    public HashMap<String, String> userData = new HashMap<>();
    /**
     * Creates new form mainWindow
     * @param userData
     */
    public mainWindow(HashMap<String, String> userData){    
        this.userData = userData;
        initComponents();
        setImageLabel(windowIcon, "/small-logo.png");
        setImageLabel(lblMaximize, "/Maximizar.png");
        setImageLabel(lblMinimize, "/Guion.png");
        setImageLabel(lblFoto,"/usuario.png");
        setImageLabel(lblAjustes,"/engranaje.png");
        setImageLabel(lblAdd,"/agregar.png");
        setImageLabel(lblRemove,"/borrar.png");
        btnMINIMIZAR.setOpaque(true);
        lblMinimize.setOpaque(false);
        btnMAXIMIZAR.setOpaque(true);
        lblMaximize.setOpaque(false);
        lblFoto.setOpaque(false);
        lblAjustes.setOpaque(false);
        lblAdd.setOpaque(true);
        lblRemove.setOpaque(true);
        setLocationRelativeTo(null);
        pnlInfoMedicine1.setOpaque(true);
        configurarListeners();
        showMeds();
        IdiomaManager.getInstance().addIdiomaListener(this);
        actualizarTextos();
    }
    /*public mainWindow(){
        this(new HashMap<>(){{
            put("username", "Salvador Cabrera Parra");
            put("email", "demo@example.com");
        }});
        configurarListeners();
        
    }*/
    
    private void actualizarTextos() {
        
    }
    @Override
    public void onIdiomaChanged() {
        actualizarTextos();
    }
    
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFondo = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        btnX = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        btnMAXIMIZAR = new javax.swing.JPanel();
        lblMaximize = new javax.swing.JLabel();
        btnMINIMIZAR = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        windowIcon = new javax.swing.JLabel();
        lblMyPills = new javax.swing.JLabel();
        NorthPan = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        lblAdd = new javax.swing.JLabel();
        pnlUsername = new javax.swing.JPanel();
        CodigoNombreUsuario = new javax.swing.JLabel();
        pnlEmail = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        CodigoEmail = new javax.swing.JLabel();
        pnlFoto = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        pnlDate = new javax.swing.JPanel();
        datename = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        pnlAjustes = new javax.swing.JPanel();
        lblAjustes = new javax.swing.JLabel();
        QuitPanel = new javax.swing.JPanel();
        lblRemove = new javax.swing.JLabel();
        EastPan = new javax.swing.JPanel();
        pnlScrollMedicines = new javax.swing.JScrollPane();
        pnlMedicines = new javax.swing.JPanel();
        pnlInfoMedicine1 = new PanelMedicines();
        pnlInfoMedicine2 = new javax.swing.JPanel();
        lblName2 = new javax.swing.JLabel();
        lblNameMedicine2 = new javax.swing.JLabel();
        lblRemainig2 = new javax.swing.JLabel();
        lblRemainingMedicine2 = new javax.swing.JLabel();
        lblDose2 = new javax.swing.JLabel();
        lblDoseMedicines2 = new javax.swing.JLabel();
        lblFrequency2 = new javax.swing.JLabel();
        lblFrequencyMedicine2 = new javax.swing.JLabel();
        pnlInfoMedicine = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblNameMedicine = new javax.swing.JLabel();
        lblRemainig = new javax.swing.JLabel();
        lblRemainingMedicine = new javax.swing.JLabel();
        lblDose = new javax.swing.JLabel();
        lblDoseMedicines = new javax.swing.JLabel();
        lblFrequency = new javax.swing.JLabel();
        lblFrequencyMedicine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        JPanelFondo.setBackground(new java.awt.Color(153, 204, 255));
        JPanelFondo.setPreferredSize(new java.awt.Dimension(800, 500));
        JPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        JPanelFondo.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        NorthPan.setBackground(new java.awt.Color(51, 153, 255));
        NorthPan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NorthPanMouseDragged(evt);
            }
        });
        NorthPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NorthPanMousePressed(evt);
            }
        });
        NorthPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addPanel.setBackground(new java.awt.Color(51, 153, 255));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
        });
        addPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdd.setBackground(new java.awt.Color(51, 153, 255));
        lblAdd.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(255, 255, 255));
        lblAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMouseExited(evt);
            }
        });
        addPanel.add(lblAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        NorthPan.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 40, 40));

        pnlUsername.setBackground(new java.awt.Color(51, 153, 255));
        pnlUsername.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CodigoNombreUsuario.setFont(new java.awt.Font("PT Mono", 1, 24)); // NOI18N
        CodigoNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        CodigoNombreUsuario.setText(userData.get("username")
        );
        pnlUsername.add(CodigoNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        NorthPan.add(pnlUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 420, 40));

        pnlEmail.setBackground(new java.awt.Color(51, 153, 255));
        pnlEmail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Email.setFont(new java.awt.Font("PT Mono", 3, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email:");
        pnlEmail.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 132, 40));

        CodigoEmail.setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        CodigoEmail.setForeground(new java.awt.Color(255, 255, 255));
        CodigoEmail.setText(userData.get("email")
        );
        pnlEmail.add(CodigoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 290, 40));

        NorthPan.add(pnlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 420, 40));

        pnlFoto.setBackground(new java.awt.Color(51, 153, 255));
        pnlFoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setForeground(new java.awt.Color(51, 153, 255));
        lblFoto.setText("jLabel2");
        pnlFoto.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 110));

        NorthPan.add(pnlFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 110));

        pnlDate.setBackground(new java.awt.Color(51, 153, 255));
        pnlDate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datename.setFont(new java.awt.Font("PT Mono", 3, 18)); // NOI18N
        datename.setForeground(new java.awt.Color(255, 255, 255));
        datename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datename.setText("Date: ");
        pnlDate.add(datename, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        date.setFont(new java.awt.Font("PT Mono", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        pnlDate.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 32));

        NorthPan.add(pnlDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 220, 30));

        pnlAjustes.setBackground(new java.awt.Color(51, 153, 255));
        pnlAjustes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAjustes.setBackground(new java.awt.Color(51, 153, 255));
        lblAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAjustesMouseClicked(evt);
            }
        });
        pnlAjustes.add(lblAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        NorthPan.add(pnlAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 40));

        QuitPanel.setBackground(new java.awt.Color(51, 153, 255));
        QuitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRemove.setBackground(new java.awt.Color(51, 153, 255));
        lblRemove.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRemove.setForeground(new java.awt.Color(255, 255, 255));
        lblRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRemoveMouseExited(evt);
            }
        });
        QuitPanel.add(lblRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        NorthPan.add(QuitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 40, 40));

        JPanelFondo.add(NorthPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 150));

        EastPan.setBackground(new java.awt.Color(102, 204, 255));
        EastPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelFondo.add(EastPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 156, -1, -1));

        pnlMedicines.setBackground(new java.awt.Color(255, 255, 255));
        pnlMedicines.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlMedicines.add(pnlInfoMedicine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 140));

        pnlInfoMedicine2.setBackground(new java.awt.Color(153, 204, 255));
        pnlInfoMedicine2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInfoMedicine2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName2.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblName2.setText("NAME:");
        pnlInfoMedicine2.add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        lblNameMedicine2.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblNameMedicine2.setText("jLabel1");
        pnlInfoMedicine2.add(lblNameMedicine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 240, 20));

        lblRemainig2.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblRemainig2.setText("REMAINING:");
        pnlInfoMedicine2.add(lblRemainig2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        lblRemainingMedicine2.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblRemainingMedicine2.setText("jLabel1");
        pnlInfoMedicine2.add(lblRemainingMedicine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 20));

        lblDose2.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblDose2.setText("DOSE:");
        pnlInfoMedicine2.add(lblDose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 20));

        lblDoseMedicines2.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblDoseMedicines2.setText("jLabel1");
        pnlInfoMedicine2.add(lblDoseMedicines2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 20));

        lblFrequency2.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblFrequency2.setText("FREQUENCY:");
        pnlInfoMedicine2.add(lblFrequency2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        lblFrequencyMedicine2.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblFrequencyMedicine2.setText("jLabel1");
        pnlInfoMedicine2.add(lblFrequencyMedicine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 20));

        pnlMedicines.add(pnlInfoMedicine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 330, 140));

        pnlInfoMedicine.setBackground(new java.awt.Color(153, 204, 255));
        pnlInfoMedicine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInfoMedicine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblName.setText("NAME:");
        pnlInfoMedicine.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        lblNameMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblNameMedicine.setText("jLabel1");
        pnlInfoMedicine.add(lblNameMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 240, 20));

        lblRemainig.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblRemainig.setText("REMAINING:");
        pnlInfoMedicine.add(lblRemainig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        lblRemainingMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblRemainingMedicine.setText("jLabel1");
        pnlInfoMedicine.add(lblRemainingMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 20));

        lblDose.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblDose.setText("DOSE:");
        pnlInfoMedicine.add(lblDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 20));

        lblDoseMedicines.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblDoseMedicines.setText("jLabel1");
        pnlInfoMedicine.add(lblDoseMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 20));

        lblFrequency.setFont(new java.awt.Font("PT Mono", 3, 13)); // NOI18N
        lblFrequency.setText("FREQUENCY:");
        pnlInfoMedicine.add(lblFrequency, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 20));

        lblFrequencyMedicine.setFont(new java.awt.Font("PT Mono", 0, 13)); // NOI18N
        lblFrequencyMedicine.setText("jLabel1");
        pnlInfoMedicine.add(lblFrequencyMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 20));

        pnlMedicines.add(pnlInfoMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, 140));

        pnlScrollMedicines.setViewportView(pnlMedicines);

        JPanelFondo.add(pnlScrollMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 750, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseClicked
        System.out.println("Patata");
        if (anadirWindow == null || !anadirWindow.isShowing()) {
            anadirWindow = new anadir(userData);
            anadirWindow.setVisible(true);
            anadirWindow.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent e) {
                    mainWindow.this.setVisible(true);
                    mainWindow.this.showMeds();
                }
                @Override
                public void windowOpened(java.awt.event.WindowEvent e) {
                    mainWindow.this.setVisible(false);
                }
            });
        }
    }//GEN-LAST:event_lblAddMouseClicked

    private void NorthPanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthPanMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_NorthPanMousePressed

    private void NorthPanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthPanMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);
        
    }//GEN-LAST:event_NorthPanMouseDragged

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        
    }//GEN-LAST:event_addPanelMouseClicked

    private void lblRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseClicked
        // Verificar si la ventana ya está abierta
        if (quitarWindow == null || !quitarWindow.isShowing()) {
            // Crear una nueva instancia de la ventana "quitar" si no está abierta
            quitarWindow = new quitar(userData);

            // Añadir un listener para detectar cuando se cierra la ventana "quitar"
            quitarWindow.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent e) {
                    mainWindow.this.setVisible(true);
                    mainWindow.this.showMeds();
                }
                @Override
                public void windowOpened(java.awt.event.WindowEvent e) {
                    mainWindow.this.setVisible(false);
                }
            });

            // Ocultar la ventana principal (opcional, si quieres ocultarla mientras está abierta "quitar")

            // Mostrar la ventana "quitar"
            quitarWindow.setVisible(true);
        }
    }//GEN-LAST:event_lblRemoveMouseClicked

    private void lblAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjustesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblAjustesMouseClicked

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

    private void lblAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseEntered
        // TODO add your handling code here:
        lblAdd.setBackground(Color.GREEN);
        lblAdd.setBorder(BorderFactory.createLineBorder(new Color(56,121,71), 2, true));
    }//GEN-LAST:event_lblAddMouseEntered

    private void lblAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseExited
        // TODO add your handling code here:
        lblAdd.setBackground(new Color(51,153,255));
        lblAdd.setBorder(null);
    }//GEN-LAST:event_lblAddMouseExited

    private void lblRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseEntered
        // TODO add your handling code here:
        lblRemove.setBackground(Color.RED);
        lblRemove.setBorder(BorderFactory.createLineBorder(new Color(139,51,69), 2, true));
    }//GEN-LAST:event_lblRemoveMouseEntered

    private void lblRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveMouseExited
        // TODO add your handling code here:
        lblRemove.setBackground(new Color(51,153,255));
        lblRemove.setBorder(null);
    }//GEN-LAST:event_lblRemoveMouseExited

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addPanelMouseEntered
    
    private void showMeds() {
        String userId = userData.get("id");
        ArrayList<HashMap<String, String>> meds = DatabaseFunctions.SELECT("user_meds", new String[]{}, "user_id", userId);
        String[] columnNames = {"Medicine", "Amount", "Dose", "Frequency"};
        Object[][] data = new Object[meds.size()][4];

        for (int i = 0; i < meds.size(); i++) {
            String medicineId = meds.get(i).get("medicine_id");
            ArrayList<HashMap<String, String>> medDetails = DatabaseFunctions.SELECT("medicines", new String[]{"name"}, "id", medicineId);
            if (!medDetails.isEmpty()) {
                data[i][0] = medDetails.get(0).get("name");
                data[i][1] = meds.get(i).get("remaining_amount");
                data[i][2] = meds.get(i).get("dose");
                data[i][3]=meds.get(i).get("frequency");
            }
            else{
                data[0][0] = "No medicine";
                data[0][1] = "NULL";
                data[0][2] = "NULL";
                data[0][3] = "NULL";
            }
        }
        
        
        
    }
    private void setImageLabel(JLabel labelN, String root){
        ImageIcon imagen = new ImageIcon(getClass().getResource(root));
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelN.getWidth(), labelN.getHeight(), Image.SCALE_SMOOTH));
        labelN.setIcon(icon);
        this.repaint();
    }
    
    //public static void main(String args[]) {
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
                new mainWindow().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoEmail;
    private javax.swing.JLabel CodigoNombreUsuario;
    private javax.swing.JPanel EastPan;
    private javax.swing.JLabel Email;
    private javax.swing.JPanel JPanelFondo;
    private javax.swing.JPanel NorthPan;
    private javax.swing.JPanel QuitPanel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel btnMAXIMIZAR;
    private javax.swing.JPanel btnMINIMIZAR;
    private javax.swing.JPanel btnX;
    private javax.swing.JLabel date;
    private javax.swing.JLabel datename;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblDose;
    private javax.swing.JLabel lblDose2;
    private javax.swing.JLabel lblDoseMedicines;
    private javax.swing.JLabel lblDoseMedicines2;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFrequency;
    private javax.swing.JLabel lblFrequency2;
    private javax.swing.JLabel lblFrequencyMedicine;
    private javax.swing.JLabel lblFrequencyMedicine2;
    private javax.swing.JLabel lblMaximize;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblMyPills;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblNameMedicine;
    private javax.swing.JLabel lblNameMedicine2;
    private javax.swing.JLabel lblRemainig;
    private javax.swing.JLabel lblRemainig2;
    private javax.swing.JLabel lblRemainingMedicine;
    private javax.swing.JLabel lblRemainingMedicine2;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlAjustes;
    private javax.swing.JPanel pnlDate;
    private javax.swing.JPanel pnlEmail;
    private javax.swing.JPanel pnlFoto;
    private javax.swing.JPanel pnlInfoMedicine;
    private javax.swing.JPanel pnlInfoMedicine1;
    private javax.swing.JPanel pnlInfoMedicine2;
    private javax.swing.JPanel pnlMedicines;
    private javax.swing.JScrollPane pnlScrollMedicines;
    private javax.swing.JPanel pnlUsername;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel windowIcon;
    // End of variables declaration//GEN-END:variables
}
