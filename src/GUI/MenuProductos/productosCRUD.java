/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MenuProductos;

import Classes.Product.Producto;
import Funcionalidades.GestorProductos;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author CristianM
 */
public class productosCRUD extends javax.swing.JPanel {
    public static GestorProductos gestorProductos = new GestorProductos();
    /**
     * Creates new form productosCRUD
     */
    public productosCRUD() {
        initComponents();
    }
    private void cambiarPagina(JPanel p){
        p.setSize(780,640);
        p.setLocation(0,0);
        cont.removeAll();
        cont.add(p,BorderLayout.CENTER);
        cont.revalidate();
        cont.repaint();
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont = new javax.swing.JPanel();
        jtIdProducto = new javax.swing.JTextField();
        bBuscarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtIdCRUD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNombreCRUD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtCantidadCRUD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPrecioCRUD = new javax.swing.JTextField();
        bAgregarProducto = new javax.swing.JButton();
        bActualizarProducto = new javax.swing.JButton();
        bEliminarProducto = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        gestorcompras = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cont.add(jtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 22, 590, -1));

        bBuscarProducto.setText("Buscar");
        bBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarProductoActionPerformed(evt);
            }
        });
        cont.add(bBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel1.setText("id");
        cont.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        cont.add(jtIdCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, -1));

        jLabel2.setText("nombre");
        cont.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        cont.add(jtNombreCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, -1));

        jLabel3.setText("precio");
        cont.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        cont.add(jtCantidadCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, -1));

        jLabel4.setText("cantidad");
        cont.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        cont.add(jtPrecioCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 220, -1));

        bAgregarProducto.setText("Agregar Producto");
        bAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarProductoActionPerformed(evt);
            }
        });
        cont.add(bAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        bActualizarProducto.setText("Actualizar Producto");
        bActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarProductoActionPerformed(evt);
            }
        });
        cont.add(bActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        bEliminarProducto.setText("Eliminar Producto");
        bEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarProductoActionPerformed(evt);
            }
        });
        cont.add(bEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        bLimpiar.setText("Limpiar Campos");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });
        cont.add(bLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        gestorcompras.setText("Gestor de compras");
        gestorcompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestorcomprasActionPerformed(evt);
            }
        });
        cont.add(gestorcompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarProductoActionPerformed
        String id = jtIdProducto.getText();
        Producto producto = gestorProductos.buscarIdProducto(id);
        
        if(producto != null){
            jtIdCRUD.setText(producto.getId());
            jtNombreCRUD.setText(producto.getNombre());
            jtPrecioCRUD.setText(String.valueOf(producto.getPrecio()));           
            jtCantidadCRUD.setText(String.valueOf(producto.getCantidad()));
            JOptionPane.showMessageDialog(this, "Producto encontrado exitosamente!");
        }else{
            jtIdCRUD.setText("");
            jtNombreCRUD.setText("");
            jtPrecioCRUD.setText("");           
            jtCantidadCRUD.setText("");
            JOptionPane.showMessageDialog(this, "Producto no encontrado!");
        }
    }//GEN-LAST:event_bBuscarProductoActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
         jtIdCRUD.setText("");
         jtNombreCRUD.setText("");
         jtPrecioCRUD.setText("");           
         jtCantidadCRUD.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarProductoActionPerformed
        gestorProductos.agregarProducto(jtIdCRUD.getText(), jtNombreCRUD.getText(), Double.parseDouble(jtPrecioCRUD.getText()), Integer.parseInt(jtCantidadCRUD.getText()));
        JOptionPane.showMessageDialog(this, "Producto agregado exitosamente!");
    }//GEN-LAST:event_bAgregarProductoActionPerformed

    private void bActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarProductoActionPerformed
        Producto producto = gestorProductos.buscarIdProducto(jtIdCRUD.getText());
        if(producto != null){
            gestorProductos.actualizarProductoNombre(producto.getId(), jtNombreCRUD.getText());
            gestorProductos.actualizarProductoPrecio(producto.getId(), Double.parseDouble(jtPrecioCRUD.getText()));
            gestorProductos.actualizarProductoCantidad(producto.getId(), Integer.parseInt(jtCantidadCRUD.getText()));            
            jtIdCRUD.setText("");
            jtNombreCRUD.setText("");
            jtPrecioCRUD.setText("");           
            jtCantidadCRUD.setText("");
            JOptionPane.showMessageDialog(this, "Producto actualizado exitosamente!");
        }else{
            JOptionPane.showMessageDialog(this, "Producto no encontrado, no se realizo actualización!");
        }
    }//GEN-LAST:event_bActualizarProductoActionPerformed

    private void bEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarProductoActionPerformed
        Producto producto = gestorProductos.buscarIdProducto(jtIdCRUD.getText());
        if(producto != null){
            gestorProductos.eliminarProducto(jtIdCRUD.getText());
            jtIdCRUD.setText("");
            jtNombreCRUD.setText("");
            jtPrecioCRUD.setText("");           
            jtCantidadCRUD.setText("");
            JOptionPane.showMessageDialog(this, "Producto eliminado exitosamente!");
        }else{
            JOptionPane.showMessageDialog(this, "Producto no encontrado, no se realizo eliminación!");
        }  
    }//GEN-LAST:event_bEliminarProductoActionPerformed

    private void gestorcomprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestorcomprasActionPerformed
        
    }//GEN-LAST:event_gestorcomprasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizarProducto;
    private javax.swing.JButton bAgregarProducto;
    private javax.swing.JButton bBuscarProducto;
    private javax.swing.JButton bEliminarProducto;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JPanel cont;
    private javax.swing.JButton gestorcompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtCantidadCRUD;
    private javax.swing.JTextField jtIdCRUD;
    private javax.swing.JTextField jtIdProducto;
    private javax.swing.JTextField jtNombreCRUD;
    private javax.swing.JTextField jtPrecioCRUD;
    // End of variables declaration//GEN-END:variables
}
