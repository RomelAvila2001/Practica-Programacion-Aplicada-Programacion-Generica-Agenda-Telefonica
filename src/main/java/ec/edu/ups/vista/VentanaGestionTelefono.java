/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.Controlador;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Telefono;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NANCY
 */
public class VentanaGestionTelefono extends javax.swing.JInternalFrame {

    private Controlador<Persona> controladorPersona;
    private Controlador<Telefono> controladorTelefono;
    

    private Persona persona;
    private Telefono telefono;
    /**
     * Creates new form VentanaGestionTelefono

     * @param controladorPersona
     * @param controladorTelefono
     */
    public VentanaGestionTelefono(Controlador<Persona> controladorPersona, Controlador<Telefono> controladorTelefono) {
        initComponents();
      
        this.controladorTelefono = controladorTelefono;
        this.controladorPersona = controladorPersona;
        telefono = new Telefono();
        botonesInicio();
    }
    public void setUsuario(Persona persona) {
        this.persona = persona;
    }
    public void cargarCodigo() {
        int cod = controladorPersona.codigoTelefono();
        txtCodigo.setText(String.valueOf(cod));
    }
    
    public void botonesInicio() {

        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    public void botones() {

        btnAgregar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
    
    public void llenarTablaTelefono() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblTelefonos.getModel();

        modeloTabla.setRowCount(0);
        for (Telefono tele : persona.getListaTelefonos()) {
            Object[] rowData = {tele.getCodigo(), tele.getNumero(), tele.getTipo(), tele.getOperadora()};
            modeloTabla.addRow(rowData);
        }

        tblTelefonos.setModel(modeloTabla);
    }
    public void limpiar() {
        txtCodigo.setText("");
        txtNumero.setText("");
        cbxTipo.setSelectedIndex(0);
        cbxOperadora.setSelectedIndex(0);
        btnAgregar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        cargarCodigo();
        tblTelefonos.clearSelection();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxOperadora = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTelefonos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Gestion Telefono");

        jLabel2.setText("Codigo");

        jLabel3.setText("Tipo");

        jLabel4.setText("Numero");

        jLabel5.setText("Operadora");

        txtCodigo.setEditable(false);

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opcion", "Casa ", "Celular" }));

        cbxOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opcion", "Movistar", "Claro", "Tuenti", "CNT", "ETAPA" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumero)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setForeground(new java.awt.Color(255, 153, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 153, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 153, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Numero", "Tipo", "Operadora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTelefonosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTelefonos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregar)
                                    .addGap(47, 47, 47)
                                    .addComponent(btnActualizar)
                                    .addGap(41, 41, 41)
                                    .addComponent(btnEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        String numero = txtNumero.getText();
        String tipo = (String) cbxTipo.getSelectedItem();
        String operadora = (String) cbxOperadora.getSelectedItem();
        Telefono telefono = new Telefono(numero, codigo, tipo, operadora);

        if (numero.isEmpty() || tipo.equals("Seleccione una Opcion") || operadora.equals("Seleccione una Opcion")) {
            JOptionPane.showMessageDialog(this, "Llenar todos los campos");
        } else {
            controladorTelefono.create(telefono);
            persona.agregarTelefono(telefono);
            controladorPersona.update(persona,persona);
            JOptionPane.showMessageDialog(this, "Teléfono creado con exito");
            llenarTablaTelefono();
            limpiar();
            System.out.println(persona);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(this, "¿Seguro quieres eliminar este teléfono?");
        if(eliminar == JOptionPane.YES_OPTION){
            int codigo = Integer.parseInt(txtCodigo.getText());
            String numero = (String) txtNumero.getText();
            String tipo = (String) cbxTipo.getSelectedItem();
            String operadora = (String) cbxOperadora.getSelectedItem();
            Telefono telefono = new Telefono(numero, codigo, tipo, operadora);
            
            controladorTelefono.delete(telefono);
            persona.eliminarTelefono(codigo);
            controladorPersona.update(persona, persona);
            JOptionPane.showMessageDialog(this, "Teléfono eliminado con exito");
            llenarTablaTelefono();
            limpiar();
            System.out.println(persona);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarCodigo();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTelefonosMouseClicked
        int fila = tblTelefonos.getSelectedRow();
        int cod = (int) tblTelefonos.getValueAt(fila, 0);
        String num = (String) tblTelefonos.getValueAt(fila, 1);
        String tipo = (String) tblTelefonos.getValueAt(fila, 2);
        String opera = (String) tblTelefonos.getValueAt(fila, 3);

        txtCodigo.setText(String.valueOf(cod));
        txtNumero.setText(num);
        cbxTipo.setSelectedItem(tipo);
        cbxOperadora.setSelectedItem(opera);
        botones();
    }//GEN-LAST:event_tblTelefonosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        botonesInicio();
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int codigo = Integer.parseInt(txtCodigo.getText());
        String numero = txtNumero.getText();
        String tipo = (String) cbxTipo.getSelectedItem();
        String operadora = (String) cbxOperadora.getSelectedItem();
        Telefono telefono = new Telefono(numero, codigo, tipo, operadora);

        if (numero.isEmpty() || tipo.equals("Seleccione una Opcion") || operadora.equals("Seleccione una Opcion")) {
            JOptionPane.showMessageDialog(this, "Llenar todos los campos");
        } else {
            controladorTelefono.update(telefono, telefono);
            persona.actualizarTelefono(telefono);
            controladorPersona.update(persona,persona);
            JOptionPane.showMessageDialog(this, "Teléfono actualizado correctamente");
            llenarTablaTelefono();
            limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        limpiar();

        DefaultTableModel modeloTabla = (DefaultTableModel) tblTelefonos.getModel();
        modeloTabla.setRowCount(0);
        tblTelefonos.setModel(modeloTabla);
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxOperadora;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTelefonos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
