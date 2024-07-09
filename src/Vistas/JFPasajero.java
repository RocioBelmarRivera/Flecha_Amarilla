package Vistas;

import GestorOperaciones.CQManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.CModelosPasajero;
import utilitarios.CUtilitarios;

public class JFPasajero extends javax.swing.JFrame {

    //permitir llamar las cconsultas de los modelos
    private CQManager mngr = new CQManager();
    CModelosPasajero modelos = new CModelosPasajero();
    ArrayList<String[]> resultados = new ArrayList<>();
    int numero;

    //***************************METODOS PROPIOS****************************
    private void limpiar_campos() {
        jTFNombre.setText("");
        jTFAP.setText("");
        jTFAM.setText("");
        jTFCorreo.setText("");
        //  jTFTipo.setText("");
    }

    private boolean campos_vacios() {
        return (jTFNombre.getText().isEmpty()
                || jTFAP.getText().isEmpty()
                || jTFAM.getText().isEmpty()
                || jTFCorreo.getText().isEmpty() //|| jTFTipo.getText().isEmpty()
                );

    }

    private void limpiar_tabla() {
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTpasajero.getModel();
        for (int i = (modelTabla.getRowCount() - 1); i >= 0; i--) {
            modelTabla.removeRow(i);
        }
    }

    private void lee_datos() {
        //numero = 1;
        //2. obtener el modelo de la tabla de datos 
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTpasajero.getModel();
        try {
            //3.leer los datos
            resultados = modelos.busca_objetos_model();
            //4. limpiar tabla
            limpiar_tabla();
            //5.asignar datos a la tabla
            for (String[] resultado : resultados) {
                //añadirle datos al modelo de la tabla
                modelTabla.addRow(new Object[]{
                    resultado[0],
                    resultado[1],
                    resultado[2],
                    resultado[3],
                    resultado[4],
                    resultado[5]});

            }
        } catch (SQLException e) {
        }

    }

    /*
    private void inserta_datos() {

        if (campos_vacios()) {
            CUtilitarios.msg_adver("hay campos vacios", "Inserta datos");

        } else {
            //1.obteniendo los datos del cuadro de texto
            String nombre = jTFNombre.getText();
            String AP = jTFAP.getText();
            String AM = jTFAM.getText();
            String correo = jTFCorreo.getText();
          //  int tipo = Integer.parseInt(mngr.datos()[0]);
            //  int tipo= Tipo.
            // String tipo = jTFTipo.getText();
            //2.inserta datos
            
            
            int tipo; // Valor por defecto o inicialización adecuada
        try {
            tipo = Integer.parseInt(mngr.datos()[0]); // Convertir a entero
        } catch (NumberFormatException e) {
            CUtilitarios.msg_adver("Tipo no válido", "Insertar datos");
            return; // Salir del método si no se puede convertir
        }
            try {
                if (modelos.inserta_objeto_model(nombre, AP, AM, correo, tipo)) {
                    //CUtilitarios.msg("insercion correcta", "inserta dato");
                } else {
                    CUtilitarios.msg_adver("problemas al insertar", "insertar datos");
                }
                limpiar_campos();
                lee_datos();
            } catch (Exception e) {
            }
        }

    }
     */
    private void inserta_datos() {
        if (campos_vacios()) {
            CUtilitarios.msg_adver("Hay campos vacíos", "Inserta datos");
        } else {
            // 1. Obtener los datos del cuadro de texto
            String nombre = jTFNombre.getText();
            String AP = jTFAP.getText();
            String AM = jTFAM.getText();
            String correo = jTFCorreo.getText();

            // 2. Obtener el tipo seleccionado del ComboBox y separar el primer campo
            int tipo; // Declarar la variable tipo

            try {
                // Obtener el texto seleccionado del ComboBox
                String textoSeleccionado = (String) Tipo.getSelectedItem();

                // Separar el primer campo (antes del primer " - ")
                String primerCampo = textoSeleccionado.split(" - ")[0];

                // Convertir el primer campo a entero
                tipo = Integer.parseInt(primerCampo);
            } catch (NumberFormatException | NullPointerException e) {
                CUtilitarios.msg_adver("Tipo no válido", "Insertar datos");
                return; // Salir del método si hay un problema con la conversión o si el ComboBox no tiene selección válida
            }

            // 3. Insertar datos usando el tipo obtenido
            try {
                if (modelos.inserta_objeto_model(nombre, AP, AM, correo, tipo)) {
                    // Mensaje de inserción correcta si deseas
                    // CUtilitarios.msg("Inserción correcta", "Inserta dato");
                } else {
                    CUtilitarios.msg_adver("Problemas al insertar", "Insertar datos");
                }
                limpiar_campos();
                lee_datos();
            } catch (Exception e) {
                // Manejo de excepciones si es necesario
            }
        }
    }

    private int lee_fila_seleccionada() {
        int id = -1;
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTpasajero.getModel();
        if (modelTabla.getRowCount() != 0) {//tabla con filas
            if (jTpasajero.getSelectedRow() != -1) {
                id = Integer.parseInt((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 0));
                jTFNombre.setText((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 1));
                jTFAP.setText((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 2));
                jTFAM.setText((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 3));
                jTFCorreo.setText((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 4));
                //  jTFTipo.setText((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 5));

            }

        }
        return id;
    }
/*
    private void actualiza_datos() {
        int id;
        DefaultTableModel modelTabla
                = (DefaultTableModel) jTpasajero.getModel();
        if (campos_vacios()) {
            CUtilitarios.msg_adver("campos vacios", "actualizar datos");
        } else {

            try {
                id = Integer.parseInt((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 0));
                String nombre = jTFNombre.getText();
                String AP = jTFAP.getText();
                String AM = jTFAM.getText();
                String correo = jTFCorreo.getText();
                //     String tipo = jTFTipo.getText();
                modelos.actualiza_objeto_model(id, nombre, AP, AM, correo, tipo);
                lee_datos();
            } catch (Exception e) {
            }

        }
    }
*/
    
    private void actualiza_datos1() {
    int id;
    DefaultTableModel modelTabla = (DefaultTableModel) jTpasajero.getModel();
    
    if (campos_vacios()) {
        CUtilitarios.msg_adver("Campos vacíos", "Actualizar datos");
    } else {
        try {
            // Obtener el ID desde la tabla
            id = Integer.parseInt((String) modelTabla.getValueAt(jTpasajero.getSelectedRow(), 0));
            
            // Obtener el nombre, AP, AM, correo desde los campos de texto
            String nombre = jTFNombre.getText();
            String AP = jTFAP.getText();
            String AM = jTFAM.getText();
            String correo = jTFCorreo.getText();
            
            // Obtener el tipo seleccionado del ComboBox
            int tipo;
            try {
                String tipoSeleccionado = (String) Tipo.getSelectedItem();
                tipo = Integer.parseInt(tipoSeleccionado.split(" - ")[0]); // Obtener el primer campo antes de " - "
            } catch (NumberFormatException | NullPointerException e) {
                CUtilitarios.msg_adver("Tipo no válido", "Actualizar datos");
                return; // Salir del método si hay un problema con el tipo seleccionado
            }
            
            // Actualizar el modelo con los nuevos datos
            modelos.actualiza_objeto_model(id, nombre, AP, AM, correo, tipo);
            
            // Volver a cargar los datos en la tabla
            lee_datos();
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
        }
    }
}

    
    
    public JFPasajero() {
        initComponents();
        mngr.rellenar_combo(Tipo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFAP = new javax.swing.JTextField();
        jTFAM = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTpasajero = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Tipo = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Pasajero ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido Materno");

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tipo");

        jTFAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAMActionPerformed(evt);
            }
        });

        jTpasajero.setBackground(new java.awt.Color(204, 204, 255));
        jTpasajero.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jTpasajero.setForeground(new java.awt.Color(51, 51, 51));
        jTpasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido P", "Apellido M", "Correo", "Tipo"
            }
        ));
        jTpasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTpasajeroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTpasajero);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Insertar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Limpiar tabla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFAP, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(jTFAM)
                                        .addComponent(jTFCorreo)))))
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAMActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        inserta_datos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        actualiza_datos1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lee_datos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        limpiar_tabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFVistaPrincipal cliente = new JFVistaPrincipal();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTpasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpasajeroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpasajeroMouseClicked

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
            java.util.logging.Logger.getLogger(JFPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPasajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAM;
    private javax.swing.JTextField jTFAP;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jTpasajero;
    // End of variables declaration//GEN-END:variables
}
