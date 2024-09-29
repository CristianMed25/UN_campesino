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
        p.setSize(780,640);
        cont1.removeAll();
        cont1.revalidate();
        cont1.add(p,BorderLayout.CENTER);
        cont1.repaint();
    } 
    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont1 = new javax.swing.JPanel();
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

        bBuscarProducto.setText("Buscar");
        bBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("id");

        jLabel2.setText("nombre");

        jLabel3.setText("precio");

        jLabel4.setText("cantidad");

        bAgregarProducto.setText("Agregar Producto");
        bAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarProductoActionPerformed(evt);
            }
        });

        bActualizarProducto.setText("Actualizar Producto");
        bActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarProductoActionPerformed(evt);
            }
        });

        bEliminarProducto.setText("Eliminar Producto");
        bEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarProductoActionPerformed(evt);
            }
        });

        bLimpiar.setText("Limpiar Campos");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        gestorcompras.setText("Gestor de compras");
        gestorcompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestorcomprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont1Layout = new javax.swing.GroupLayout(cont1);
        cont1.setLayout(cont1Layout);
        cont1Layout.setHorizontalGroup(
            cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont1Layout.createSequentialGroup()
                .addGroup(cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(bBuscarProducto))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtIdCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(bAgregarProducto)
                        .addGap(16, 16, 16)
                        .addComponent(bActualizarProducto)
                        .addGap(16, 16, 16)
                        .addComponent(bEliminarProducto))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jtNombreCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jtCantidadCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jtPrecioCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bLimpiar))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(gestorcompras)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        cont1Layout.setVerticalGroup(
            cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bBuscarProducto))
                .addGap(26, 26, 26)
                .addGroup(cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jtIdCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cont1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(cont1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAgregarProducto)
                            .addComponent(bActualizarProducto)
                            .addComponent(bEliminarProducto))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jtNombreCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jtCantidadCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jtPrecioCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bLimpiar)
                .addGap(117, 117, 117)
                .addComponent(gestorcompras)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
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
        MenuComprasCRUD comprasCRUD=new MenuComprasCRUD();
        cambiarPagina(comprasCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_gestorcomprasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizarProducto;
    private javax.swing.JButton bAgregarProducto;
    private javax.swing.JButton bBuscarProducto;
    private javax.swing.JButton bEliminarProducto;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JPanel cont1;
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
