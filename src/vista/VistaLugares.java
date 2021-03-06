package vista;

import controlador.ControladorIngreso;
import controlador.ControladorLugares;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import servicios.AdministradorDatos;
import modelo.Estado;
import modelo.Lugar;
import java.awt.event.KeyEvent;

public class VistaLugares extends javax.swing.JFrame {

    /**
     * Creates new form VistaLugar
     */
    public VistaLugares() {
        initComponents();
        aparienciaInicial();
        CentrarDatos();
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono/images.png"));
        this.setIconImage(ico);
    }

    private void aparienciaInicial() {
        DefaultTableModel grilla = new DefaultTableModel();
        Estado estOcupado = Estado.OCUPADO;

        grilla = (DefaultTableModel) jTable1.getModel();

        ArrayList<Lugar> lugares = new ArrayList();

        lugares = AdministradorDatos.getLugares();

        for (Lugar lugar : lugares) {
            Object[] fila = new Object[3];

            fila[0] = lugar.getNumero();

            if (lugar.isTecho()) {
                fila[1] = "Techado";
            } else {
                fila[1] = "Aire Libre";
            }

            if (lugar.getEstado() == estOcupado) {
                fila[2] = true;
            } else {
                fila[2] = false;
            }

            grilla.addRow(fila);
        }
        jTable1.setModel(grilla);
    }

    public void Actualizar() {
        this.aparienciaInicial();
    }

    public void CentrarDatos() {
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(Alinear);
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seleccionar Lugar");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(18, 59, 102));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lugares");
        jLabel6.setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N?? Lugar", "Techo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(23, 41, 224));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTable1.getSelectedRowCount() == 1) {
            int lugar;
            lugar = ControladorLugares.buscarLugar((DefaultTableModel) jTable1.getModel(), jTable1.getSelectedRow());
            setVisible(false);
            ControladorIngreso.mostrar();
            ControladorIngreso.setLugar(Integer.toString(lugar));

            //    ControladorIngreso.cambiarEstado(lugar);
        } else if (jTable1.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Seleccione solo un Lugar");
        } else if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un Lugar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTable1.getSelectedRowCount() == 1) {
                int lugar;
                lugar = ControladorLugares.buscarLugar((DefaultTableModel) jTable1.getModel(), jTable1.getSelectedRow());
                setVisible(false);
                ControladorIngreso.mostrar();
                ControladorIngreso.setLugar(Integer.toString(lugar));

                //    ControladorIngreso.cambiarEstado(lugar);
            } else if (jTable1.getSelectedRowCount() > 1) {
                JOptionPane.showMessageDialog(this, "Seleccione solo un Lugar");
            } else if (jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un Lugar");
            }
        }
    }//GEN-LAST:event_jTable1KeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
