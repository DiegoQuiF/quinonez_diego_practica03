/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Programa;

/**
 *
 * @author Diego
 */
public class frmUser extends javax.swing.JFrame {

    /** Creates new form frmUser */
    public frmUser() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panControles = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        panBotones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        RECARGAR = new javax.swing.JButton();
        RECARGAR1 = new javax.swing.JButton();
        RECARGAR2 = new javax.swing.JButton();
        RECARGAR3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        RECARGAR4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 430));

        panTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU DE USUARIO");

        org.jdesktop.layout.GroupLayout panTituloLayout = new org.jdesktop.layout.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 720, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(panTitulo, java.awt.BorderLayout.NORTH);

        panControles.setBackground(new java.awt.Color(255, 255, 255));
        panControles.setPreferredSize(new java.awt.Dimension(720, 440));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setText("A. Paterno");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("A. Materno");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setText("Nombres");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Doc.");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setText("Documento");

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel8.setText("Edad");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRAR USUARIO");

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTRAR NUEVA TARJETA");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setText("Nro. Celular");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de documento", "DNI", "Pasaporte" }));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel11.setText("Tipo Doc.");

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel12.setText("Documento");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de documento", "DNI", "Pasaporte" }));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel13.setText("Nro. Tarjeta");

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel14.setText("Nom. de Usuario");

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel15.setText("Contraseña");

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel16.setText("Monto inicial");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un monto inicial", "Estandar", "S/. 10", "S/. 20", "S/. 40", "S/. 80", "S/. 160" }));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel17.setText("Costo de uso");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un costo de uso", "Estandar", "S/. 1.00", "S/. 1.50", "S/. 3.00", "S/. 5.00" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panControlesLayout = new org.jdesktop.layout.GroupLayout(panControles);
        panControles.setLayout(panControlesLayout);
        panControlesLayout.setHorizontalGroup(
            panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panControlesLayout.createSequentialGroup()
                .add(29, 29, 29)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panControlesLayout.createSequentialGroup()
                        .add(jLabel7)
                        .add(60, 60, 60)
                        .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(panControlesLayout.createSequentialGroup()
                            .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(panControlesLayout.createSequentialGroup()
                                    .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel8)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel3)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2))
                                    .add(0, 0, Short.MAX_VALUE))
                                .add(panControlesLayout.createSequentialGroup()
                                    .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel4)
                                        .add(jLabel5)
                                        .add(jLabel6))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 62, Short.MAX_VALUE)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panControlesLayout.createSequentialGroup()
                        .add(jLabel15)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panControlesLayout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panControlesLayout.createSequentialGroup()
                        .add(jLabel13)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panControlesLayout.createSequentialGroup()
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panControlesLayout.createSequentialGroup()
                        .add(jLabel11)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(panControlesLayout.createSequentialGroup()
                        .add(jLabel16)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panControlesLayout.createSequentialGroup()
                        .add(jLabel17)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(29, 29, 29))
        );
        panControlesLayout.setVerticalGroup(
            panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panControlesLayout.createSequentialGroup()
                .addContainerGap()
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabel10))
                .add(18, 18, 18)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panControlesLayout.createSequentialGroup()
                        .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel11)
                            .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)
                            .add(jLabel12)
                            .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel4)
                        .add(jLabel13)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(jLabel14)
                    .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6)
                    .add(jLabel15)
                    .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel16)
                    .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panControlesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel17)
                    .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panControles, java.awt.BorderLayout.CENTER);

        panBotones.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        jButton2.setText("REGISTRAR");

        jButton3.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        jButton3.setText("MODO INVITADO");
        jButton3.setMaximumSize(new java.awt.Dimension(120, 21));
        jButton3.setMinimumSize(new java.awt.Dimension(120, 21));
        jButton3.setPreferredSize(new java.awt.Dimension(120, 21));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        jButton4.setText("LIMPIAR");
        jButton4.setPreferredSize(new java.awt.Dimension(120, 21));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        RECARGAR.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        RECARGAR.setText("RECARGAR");
        RECARGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECARGARActionPerformed(evt);
            }
        });

        RECARGAR1.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        RECARGAR1.setText("UTILIZAR");
        RECARGAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECARGAR1ActionPerformed(evt);
            }
        });

        RECARGAR2.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        RECARGAR2.setText("VER TARJETAS");
        RECARGAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECARGAR2ActionPerformed(evt);
            }
        });

        RECARGAR3.setBackground(new java.awt.Color(255, 0, 0));
        RECARGAR3.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        RECARGAR3.setText("SALIR");
        RECARGAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECARGAR3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        jButton5.setText("IMPRIMIR USUARIOS");

        RECARGAR4.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        RECARGAR4.setText("VER MOVIMIENTOS");
        RECARGAR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECARGAR4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        jButton6.setText("LIMPIAR");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 21));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panBotonesLayout = new org.jdesktop.layout.GroupLayout(panBotones);
        panBotones.setLayout(panBotonesLayout);
        panBotonesLayout.setHorizontalGroup(
            panBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panBotonesLayout.createSequentialGroup()
                .add(28, 28, 28)
                .add(panBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(panBotonesLayout.createSequentialGroup()
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 158, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(panBotonesLayout.createSequentialGroup()
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(77, 77, 77)
                .add(panBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(panBotonesLayout.createSequentialGroup()
                        .add(RECARGAR2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(RECARGAR4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(panBotonesLayout.createSequentialGroup()
                        .add(RECARGAR)
                        .add(28, 28, 28)
                        .add(RECARGAR1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 14, Short.MAX_VALUE)
                        .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(30, 30, 30))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panBotonesLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(RECARGAR3)
                .add(323, 323, 323))
        );
        panBotonesLayout.setVerticalGroup(
            panBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .add(panBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton2)
                    .add(RECARGAR)
                    .add(RECARGAR1)
                    .add(jButton5)
                    .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(panBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(RECARGAR2)
                    .add(RECARGAR4))
                .add(18, 18, 18)
                .add(RECARGAR3)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panBotones, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void RECARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECARGARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECARGARActionPerformed

    private void RECARGAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECARGAR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECARGAR1ActionPerformed

    private void RECARGAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECARGAR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECARGAR2ActionPerformed

    private void RECARGAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECARGAR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECARGAR3ActionPerformed

    private void RECARGAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECARGAR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECARGAR4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RECARGAR;
    private javax.swing.JButton RECARGAR1;
    private javax.swing.JButton RECARGAR2;
    private javax.swing.JButton RECARGAR3;
    private javax.swing.JButton RECARGAR4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panBotones;
    private javax.swing.JPanel panControles;
    private javax.swing.JPanel panTitulo;
    // End of variables declaration//GEN-END:variables

}
