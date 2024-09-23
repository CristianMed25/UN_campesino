/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MenuTareas;

import Classes.Tarea;
import Funcionalidades.GestorTareas;
import javax.swing.JOptionPane;

/**
 *
 * @author CristianM
 */
public class NecesidadesCultivo extends javax.swing.JPanel {
    public static GestorTareas gestorTareas = new GestorTareas();
    /**
     * Creates new form NecesidadesCultivo
     */
    public NecesidadesCultivo() {
        initComponents();
        verTareas();
        verColaTareas();
    }
    
    public void verTareas(){
        StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i<gestorTareas.necesidadesCultivos.length(); i++){
                if(gestorTareas.necesidadesCultivos != null){
                    sb.append("ID: ").append(gestorTareas.necesidadesCultivos.find(i).getId()).append("\n");               
                    sb.append("Descripción: ").append(gestorTareas.necesidadesCultivos.find(i).getDescripcion()).append("\n");               
                    sb.append("Completado: ").append(String.valueOf(gestorTareas.necesidadesCultivos.find(i).isCompletada())).append("\n"); 
                    sb.append("\n");
                }                      
            }
            String resultado = sb.toString().trim();
            jtNecesidadesCRUD.setText(resultado);
    }
    
    public void verColaTareas(){
        String tareas = gestorTareas.colaTareas.toString();
        jtColaNec.setText(tareas);       
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
        jtIdNec = new javax.swing.JTextField();
        bBuscarNecCultivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtIdCRUD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcionCRUD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNecesidadesCRUD = new javax.swing.JTextArea();
        bAgregarNec = new javax.swing.JButton();
        bBorrarNec = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtIdEncolar = new javax.swing.JTextField();
        bEncolarTarea = new javax.swing.JButton();
        bDesencolarTarea = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtColaNec = new javax.swing.JTextArea();
        bRefrescar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gestión necesidades cultivo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 26, -1, -1));
        add(jtIdNec, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 64, 598, -1));

        bBuscarNecCultivo.setText("Buscar");
        bBuscarNecCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarNecCultivoActionPerformed(evt);
            }
        });
        add(bBuscarNecCultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 60, -1, -1));

        jLabel2.setText("id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        add(jtIdCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 230, -1));

        jLabel3.setText("descripción");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        add(jtDescripcionCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, -1));

        jLabel4.setText("estado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jcEstado.setText("Completado");
        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });
        add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setText("Lista completa");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jtNecesidadesCRUD.setColumns(20);
        jtNecesidadesCRUD.setRows(5);
        jScrollPane1.setViewportView(jtNecesidadesCRUD);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, 290));

        bAgregarNec.setText("Agregar Necesidad");
        bAgregarNec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarNecActionPerformed(evt);
            }
        });
        add(bAgregarNec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        bBorrarNec.setText("Borrar Necesidad Más Reciente");
        bBorrarNec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarNecActionPerformed(evt);
            }
        });
        add(bBorrarNec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        bLimpiar.setText("Limpiar Campos");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });
        add(bLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel6.setText("Gestion Tareas");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel7.setText("id Tarea a encolar o desencolar");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));
        add(jtIdEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 430, -1));

        bEncolarTarea.setText("Encolar tarea");
        bEncolarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEncolarTareaActionPerformed(evt);
            }
        });
        add(bEncolarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 210, -1));

        bDesencolarTarea.setText("Desencolar tarea");
        bDesencolarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDesencolarTareaActionPerformed(evt);
            }
        });
        add(bDesencolarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 210, -1));

        jLabel8.setText("Ver cola de tareas");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        jtColaNec.setColumns(20);
        jtColaNec.setRows(5);
        jScrollPane2.setViewportView(jtColaNec);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 430, 140));

        bRefrescar.setText("Refrescar");
        bRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefrescarActionPerformed(evt);
            }
        });
        add(bRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
       
    }//GEN-LAST:event_jcEstadoActionPerformed

    private void bBuscarNecCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarNecCultivoActionPerformed
        Tarea tarea = gestorTareas.buscarNecesidadCultivo(jtIdNec.getText());
        if(tarea != null){
            jtIdCRUD.setText(tarea.getId());
            jtDescripcionCRUD.setText(tarea.getDescripcion());
            jcEstado.setSelected(tarea.isCompletada());                   
            JOptionPane.showMessageDialog(this, "Necesidad encontrada exitosamente!");            
        }else{
            jtIdCRUD.setText("");
            jtDescripcionCRUD.setText("");
            jcEstado.setSelected(false);
            JOptionPane.showMessageDialog(this, "Necesidad no encontrada!");  
        }
    }//GEN-LAST:event_bBuscarNecCultivoActionPerformed

    private void bRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefrescarActionPerformed
        verTareas();
    }//GEN-LAST:event_bRefrescarActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
         jtIdCRUD.setText("");
         jtIdEncolar.setText("");
         jtDescripcionCRUD.setText("");
         jcEstado.setSelected(false);
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bAgregarNecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarNecActionPerformed
        gestorTareas.agregarNecesidadCultivo(jtIdCRUD.getText(), jtDescripcionCRUD.getText());
        verTareas();
        JOptionPane.showMessageDialog(this, "Necesidad agregada exitosamente!");
    }//GEN-LAST:event_bAgregarNecActionPerformed

    private void bBorrarNecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarNecActionPerformed
        gestorTareas.eliminarNecesidadCultivoReciente();
        verTareas();
        JOptionPane.showMessageDialog(this, "Necesidad eliminada exitosamente!");
    }//GEN-LAST:event_bBorrarNecActionPerformed

    private void bEncolarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEncolarTareaActionPerformed
        Tarea tarea = gestorTareas.buscarNecesidadCultivo(jtIdEncolar.getText());
        if(tarea != null){
            gestorTareas.encolarTarea(tarea);
            verColaTareas();
            JOptionPane.showMessageDialog(this, "Necesidad encolada exitosamente!");            
        }else{
            jtIdEncolar.setText("");            
            JOptionPane.showMessageDialog(this, "Necesidad no encontrada, no se encolo la tarea!");  
        }
    }//GEN-LAST:event_bEncolarTareaActionPerformed

    private void bDesencolarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDesencolarTareaActionPerformed
        gestorTareas.desencolarTarea();
        verColaTareas();
        JOptionPane.showMessageDialog(this, "Necesidad desencolada exitosamente!");      
        
    }//GEN-LAST:event_bDesencolarTareaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarNec;
    private javax.swing.JButton bBorrarNec;
    private javax.swing.JButton bBuscarNecCultivo;
    private javax.swing.JButton bDesencolarTarea;
    private javax.swing.JButton bEncolarTarea;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JTextArea jtColaNec;
    private javax.swing.JTextField jtDescripcionCRUD;
    private javax.swing.JTextField jtIdCRUD;
    private javax.swing.JTextField jtIdEncolar;
    private javax.swing.JTextField jtIdNec;
    private javax.swing.JTextArea jtNecesidadesCRUD;
    // End of variables declaration//GEN-END:variables
}
