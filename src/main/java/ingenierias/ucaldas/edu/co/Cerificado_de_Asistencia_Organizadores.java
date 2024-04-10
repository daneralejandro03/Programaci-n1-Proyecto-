/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ingenierias.ucaldas.edu.co;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author daner
 */
public class Cerificado_de_Asistencia_Organizadores extends javax.swing.JFrame {

    /**
     * Creates new form Cerificado_de_Asistencia
     */
    private final ArrayList<Organizador> List;
    public Cerificado_de_Asistencia_Organizadores() {
        List = new ArrayList<>();
        initComponents();
        this.setLocationRelativeTo(null);
        Cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Descargar = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        jTextField_Buscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Organizadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("CERTIFICADO DE ASISTENCIA");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Debe seleccionar una fila para poder generar su certificado");

        jButton_Descargar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Descargar.setText("Descargar");
        jButton_Descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DescargarActionPerformed(evt);
            }
        });

        jButton_Volver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        jButton_Actualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });

        jButton_Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jTextField_Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("(ORGANIZADORES)");

        jTable_Organizadores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable_Organizadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Dia del evento", "Salon", "N° de Puesto"
            }
        ));
        jScrollPane1.setViewportView(jTable_Organizadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(164, 164, 164)
                                    .addComponent(jButton_Descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(228, 228, 228)
                                    .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Buscar)
                    .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Cargar(){
       
        
        File Archivo = new File ("Organizador.txt");
        FileReader Leer;
        BufferedReader Almacen;
        
        Organizador persona, auxiliar = new Organizador();
        
        try {
            
            Leer = new FileReader(Archivo);
            Almacen = new BufferedReader(Leer);
            persona = auxiliar.Cargar(Almacen);
            
            while (persona != null){
            
                List.add(persona);
                persona = auxiliar.Cargar(Almacen);
            }
         Almacen.close();
         Leer.close();
            
        } catch (Exception e) {
        }
        Mostrar_datos();
    }
    
    private void Mostrar_datos(){
        String Matriz [][] = new String [List.size()][6];
        
        Organizador auxiliar;
        
        for (int i = 0; i < List.size(); i++) {
            auxiliar = List.get(i);
            Matriz [i][0] = auxiliar.getNombre();
            Matriz [i][1] = auxiliar.getCedula();
            Matriz [i][2] = auxiliar.getDia();
            Matriz [i][3] = auxiliar.getSalon();
            Matriz [i][4] = Integer.toString(auxiliar.getsilla());
            
                    jTable_Organizadores.setModel(new javax.swing.table.DefaultTableModel(
Matriz,
            new String [] {
                "Nombre", "Cedula", "Dia del evento", "Salon", "N° de Puesto"
            }
        ));
        }
        
        
    }
    
    private void jButton_DescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DescargarActionPerformed
        int fila;
        Organizador auxiliar;
        try {
            fila = jTable_Organizadores.getSelectedRow();
            auxiliar = List.get(fila);
            JOptionPane.showMessageDialog(null,"Gracias por asistir, ya se le genero su certificado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccionar una fila para generar el certificado");
        }
        Mostrar_datos();
    }//GEN-LAST:event_jButton_DescargarActionPerformed

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
       
        Certificado_de_Asistencia Me = new Certificado_de_Asistencia();
        Me.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_VolverActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

        Mostrar_datos();
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

   private void MostrarPersona(Organizador auxiliar) {
        
            String Matriz [][] = new String [1][5];
        
            Matriz [0][0] = auxiliar.getNombre();
            Matriz [0][1] = auxiliar.getCedula();
            Matriz [0][2] = auxiliar.getDia();
            Matriz [0][3] = auxiliar.getSalon();
            Matriz [0][4] = Integer.toString(auxiliar.getsilla());
           
            
                    jTable_Organizadores.setModel(new javax.swing.table.DefaultTableModel(
Matriz,
            new String [] {
                "Nombre", "Cedula", "Dia del evento", "Salon", "N° de Puesto"
            }
        ));
        
     
    }
    
    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        if (!jTextField_Buscar.getText().isEmpty()){
            Organizador auxiliar = null;
            String Buscar = jTextField_Buscar.getText();

            for (int i = 0; i < List.size(); i++) {

                auxiliar = List.get(i);

                if (auxiliar.getCedula().equals(Buscar)) {
                    MostrarPersona(auxiliar);

                }
            }

        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la cedula");
        }
    }//GEN-LAST:event_jButton_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Cerificado_de_Asistencia_Organizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cerificado_de_Asistencia_Organizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cerificado_de_Asistencia_Organizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cerificado_de_Asistencia_Organizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cerificado_de_Asistencia_Organizadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Descargar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Organizadores;
    private javax.swing.JTextField jTextField_Buscar;
    // End of variables declaration//GEN-END:variables
}