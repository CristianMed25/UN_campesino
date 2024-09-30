/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MenuAnimales;
import Classes.Animal.Porcino;
import Funcionalidades.GestorAnimales;
import javax.swing.JOptionPane;

/**
 *
 * @author CristianM
 */
public class PorcinoCRUD extends javax.swing.JPanel {
    public static GestorAnimales gestorAnimales = new GestorAnimales();
    /**
     * Creates new form AveCRUD
     */
    public PorcinoCRUD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtIdAve = new javax.swing.JTextField();
        bBusquedaAve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtIdCRUD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtEdadCRUD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtSaludCRUD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPesoCRUD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtTipoCRUD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bAgregarAve = new javax.swing.JButton();
        bActualizarAve = new javax.swing.JButton();
        bBorrarAve = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtIdAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdAveActionPerformed(evt);
            }
        });
        add(jtIdAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 586, -1));

        bBusquedaAve.setText("Buscar");
        bBusquedaAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBusquedaAveActionPerformed(evt);
            }
        });
        add(bBusquedaAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, 40));

        jLabel1.setText("id");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        add(jtIdCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, -1));

        jLabel2.setText("edad");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jtEdadCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEdadCRUDActionPerformed(evt);
            }
        });
        add(jtEdadCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 210, -1));

        jLabel3.setText("salud");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        add(jtSaludCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, -1));

        jLabel4.setText("peso");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(jtPesoCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, -1));

        jLabel5.setText("tipo");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        add(jtTipoCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 210, -1));

        jLabel6.setText("Gestor de Porcinos");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        bAgregarAve.setText("Agregar Porcino");
        bAgregarAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarAveActionPerformed(evt);
            }
        });
        add(bAgregarAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        bActualizarAve.setText("Actualizar Porcino");
        bActualizarAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarAveActionPerformed(evt);
            }
        });
        add(bActualizarAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        bBorrarAve.setText("Borrar Porcino");
        bBorrarAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarAveActionPerformed(evt);
            }
        });
        add(bBorrarAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        bLimpiar.setText("Limpiar Campos");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });
        add(bLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bBusquedaAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBusquedaAveActionPerformed
        String id = jtIdAve.getText();
        Porcino porcino = gestorAnimales.buscarIdPorcino(id);
        
        if(porcino != null){
            jtIdCRUD.setText(porcino.getId());
            jtEdadCRUD.setText(String.valueOf(porcino.getEdad()));
            jtSaludCRUD.setText(porcino.getSalud());
            jtPesoCRUD.setText(String.valueOf(porcino.getPeso()));
            jtTipoCRUD.setText(porcino.getTipo());
            JOptionPane.showMessageDialog(this, "Porcino encontrado exitosamente!");
        }else{
            jtIdCRUD.setText("");
            jtEdadCRUD.setText("");
            jtSaludCRUD.setText("");
            jtPesoCRUD.setText("");
            jtTipoCRUD.setText("");
            JOptionPane.showMessageDialog(this, "Porcino no encontrado!");
        }
    }//GEN-LAST:event_bBusquedaAveActionPerformed

    private void jtIdAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdAveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAveActionPerformed

    private void jtEdadCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEdadCRUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEdadCRUDActionPerformed

    private void bAgregarAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarAveActionPerformed
        gestorAnimales.agregarPorcino(jtIdCRUD.getText(), Integer.parseInt(jtEdadCRUD.getText()), jtSaludCRUD.getText(), Double.parseDouble(jtPesoCRUD.getText()));
        JOptionPane.showMessageDialog(this, "Porcino agregado exitosamente!");
    }//GEN-LAST:event_bAgregarAveActionPerformed

    private void bBorrarAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarAveActionPerformed
        Porcino porcino = gestorAnimales.buscarIdPorcino(jtIdCRUD.getText());
        if(porcino != null){
            gestorAnimales.eliminarPorcino(jtIdCRUD.getText());
            jtIdCRUD.setText("");
            jtEdadCRUD.setText("");
            jtSaludCRUD.setText("");
            jtPesoCRUD.setText("");
            jtTipoCRUD.setText("");
            JOptionPane.showMessageDialog(this, "Porcino eliminado exitosamente!");
        }else{
            JOptionPane.showMessageDialog(this, "Porcino no encontrado, no se realizo eliminación!");
        }         
    }//GEN-LAST:event_bBorrarAveActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
         jtIdCRUD.setText("");
         jtEdadCRUD.setText("");
         jtSaludCRUD.setText("");
         jtPesoCRUD.setText("");
         jtTipoCRUD.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bActualizarAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarAveActionPerformed
        Porcino porcino = gestorAnimales.buscarIdPorcino(jtIdCRUD.getText());
        if(porcino != null){
            gestorAnimales.actualizarPorcinoEdad(porcino.getId(), Integer.parseInt(jtEdadCRUD.getText()));
            gestorAnimales.actualizarPorcinoSalud(porcino.getId(), jtSaludCRUD.getText());
            gestorAnimales.actualizarPorcinoPeso(porcino.getId(), Double.parseDouble(jtPesoCRUD.getText()));
            jtIdCRUD.setText("");
            jtEdadCRUD.setText("");
            jtSaludCRUD.setText("");
            jtPesoCRUD.setText("");
            jtTipoCRUD.setText("");
            JOptionPane.showMessageDialog(this, "Porcino actualizado exitosamente!");
        }else{
            JOptionPane.showMessageDialog(this, "Porcino no encontrado, no se realizo actualización!");
        }    
    }//GEN-LAST:event_bActualizarAveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizarAve;
    private javax.swing.JButton bAgregarAve;
    private javax.swing.JButton bBorrarAve;
    private javax.swing.JButton bBusquedaAve;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtEdadCRUD;
    private javax.swing.JTextField jtIdAve;
    private javax.swing.JTextField jtIdCRUD;
    private javax.swing.JTextField jtPesoCRUD;
    private javax.swing.JTextField jtSaludCRUD;
    private javax.swing.JTextField jtTipoCRUD;
    // End of variables declaration//GEN-END:variables
}