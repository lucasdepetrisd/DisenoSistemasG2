/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorEgreso;
import controlador.ControladorListado;
import controlador.ControladorLugares;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Vehiculo;

/**
 *
 * @author Lucas
 */
public class VistaEgreso extends javax.swing.JFrame {

    /**
     * Creates new form VistaEgreso
     */
    public VistaEgreso() {
        initComponents();
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono/images.png"));
        this.setIconImage(ico);
    }

    public int ConfirmarEgreso() {

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea confirmar el egreso?", "Confirmar Egreso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        System.out.println(opcion);

        return opcion;
    }

    public void VaciarTextFields() {
        patenteText.setText("");
        tipoText.setText("...");
        lugarText.setText("...");
        ingresoText.setText("...");
        tarifaText.setText("Calculando...");
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
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        confirmarEgreso = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tarifaText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patenteText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ingresoText = new javax.swing.JLabel();
        lugarText = new javax.swing.JLabel();
        tipoText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calcularTarifa = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Egreso");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        confirmarEgreso.setBackground(new java.awt.Color(23, 41, 224));
        confirmarEgreso.setForeground(new java.awt.Color(255, 255, 255));
        confirmarEgreso.setText("Confirmar Egreso");
        confirmarEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarEgresoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarifa calculada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(18, 59, 102))); // NOI18N

        tarifaText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tarifaText.setText("Calculando...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(tarifaText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tarifaText)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese la patente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(18, 59, 102))); // NOI18N

        jLabel1.setText("Patente");

        patenteText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 59, 102), 2, true));
        patenteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patenteTextActionPerformed(evt);
            }
        });
        patenteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patenteTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(patenteText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patenteText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(18, 59, 102))); // NOI18N

        jLabel3.setText("Tipo");

        jLabel2.setText("Lugar Nº");

        jLabel5.setText("Ingreso");

        ingresoText.setText("...");

        lugarText.setText("...");

        tipoText.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresoText)
                    .addComponent(lugarText)
                    .addComponent(tipoText))
                .addGap(105, 105, 105))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lugarText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingresoText))
                .addContainerGap())
        );

        jLabel6.setBackground(new java.awt.Color(18, 59, 102));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Egreso de Vehículos");
        jLabel6.setOpaque(true);

        calcularTarifa.setBackground(new java.awt.Color(23, 41, 224));
        calcularTarifa.setForeground(new java.awt.Color(255, 255, 255));
        calcularTarifa.setText("Calcular Tarifa");
        calcularTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularTarifaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(calcularTarifa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarEgreso))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcularTarifa)
                    .addComponent(confirmarEgreso))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patenteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patenteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patenteTextActionPerformed

    private void calcularTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularTarifaActionPerformed

        Vehiculo vehiculo = new Vehiculo();
        vehiculo = ControladorEgreso.llenarDatos(patenteText.getText());

        //Mostrar los datos en la vista
        if (vehiculo.getAuto() != null) {
            tipoText.setText("Auto");
        } else if (vehiculo.getMoto() != null) {
            tipoText.setText("Moto");
        } else if (vehiculo.getCamioneta() != null) {
            tipoText.setText("Camioneta");
        }
        lugarText.setText(String.valueOf(vehiculo.getLugar().getNumero()));
        ingresoText.setText(String.valueOf(vehiculo.getFechaIngreso().getHour()) + ":" + String.valueOf(vehiculo.getFechaIngreso().getMinute()));

        //Cálculo de tarifa
        tarifaText.setText("$" + String.valueOf(ControladorEgreso.calcularTarifa(patenteText.getText())));
    }//GEN-LAST:event_calcularTarifaActionPerformed

    private void confirmarEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarEgresoActionPerformed

        calcularTarifaActionPerformed(evt);

        int opcion = ConfirmarEgreso();
        if (opcion == 0) {
            ControladorEgreso.EliminarVehiculo(patenteText.getText());
            ControladorListado.actualizarLista();
            ControladorLugares.ActualizarGrilla();
            VaciarTextFields();
        }


    }//GEN-LAST:event_confirmarEgresoActionPerformed

    private void patenteTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patenteTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Vehiculo vehiculo = new Vehiculo();
            vehiculo = ControladorEgreso.llenarDatos(patenteText.getText());

            //Mostrar los datos en la vista
            if (vehiculo.getAuto() != null) {
                tipoText.setText("Auto");
            } else if (vehiculo.getMoto() != null) {
                tipoText.setText("Moto");
            } else if (vehiculo.getCamioneta() != null) {
                tipoText.setText("Camioneta");
            }
            lugarText.setText(String.valueOf(vehiculo.getLugar().getNumero()));
            ingresoText.setText(String.valueOf(vehiculo.getFechaIngreso().getHour()) + ":" + String.valueOf(vehiculo.getFechaIngreso().getMinute()));

            //Cálculo de tarifa
            tarifaText.setText("$" + String.valueOf(ControladorEgreso.calcularTarifa(patenteText.getText())));
        }
    }//GEN-LAST:event_patenteTextKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularTarifa;
    private javax.swing.JButton confirmarEgreso;
    private javax.swing.JLabel ingresoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lugarText;
    private javax.swing.JTextField patenteText;
    private javax.swing.JLabel tarifaText;
    private javax.swing.JLabel tipoText;
    // End of variables declaration//GEN-END:variables
}
