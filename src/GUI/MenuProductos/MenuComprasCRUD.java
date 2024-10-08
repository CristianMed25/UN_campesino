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
import Funcionalidades.GestorComprasQuaHeap;

/**
 *
 * @author CristianM
 */
public class MenuComprasCRUD extends javax.swing.JPanel {
    public static GestorProductos gestorProductos = new GestorProductos();
    /**
     * Creates new form productosCRUD
     */
    public GestorComprasQuaHeap listaQ= new GestorComprasQuaHeap();
    public MenuComprasCRUD() {
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

        cont = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtNombreCRUD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrecioCRUD = new javax.swing.JTextField();
        bAgregarProducto = new javax.swing.JButton();
        bMostrarProducto = new javax.swing.JButton();
        bMostrarProductos = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("nombre");

        jtNombreCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreCRUDActionPerformed(evt);
            }
        });

        jLabel3.setText("precio");

        bAgregarProducto.setText("Agregar Prod. a la cola");
        bAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarProductoActionPerformed(evt);
            }
        });

        bMostrarProducto.setText("Mostrar un producto");
        bMostrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarProductoActionPerformed(evt);
            }
        });

        bMostrarProductos.setText("Mostrar todos los productos");
        bMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarProductosActionPerformed(evt);
            }
        });

        bLimpiar.setText("Limpiar Campos");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        scroll.setViewportView(texto);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Organizador de compras");

        javax.swing.GroupLayout contLayout = new javax.swing.GroupLayout(cont);
        cont.setLayout(contLayout);
        contLayout.setHorizontalGroup(
            contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contLayout.createSequentialGroup()
                        .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombreCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtPrecioCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAgregarProducto)
                            .addComponent(bLimpiar))
                        .addGap(18, 18, 18)
                        .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMostrarProducto)
                            .addComponent(bMostrarProductos))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        contLayout.setVerticalGroup(
            contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jtNombreCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecioCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bMostrarProducto)
                            .addComponent(bAgregarProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bLimpiar)
                            .addComponent(bMostrarProductos)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed

        jtNombreCRUD.setText("");
        jtPrecioCRUD.setText("");
        texto.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarProductosActionPerformed
        StringBuilder sb = new StringBuilder();
        Producto[] datos=listaQ.ExtraerDatos();

        for(int i = 0; i<datos.length; i++){
            if(datos[i] != null){
                sb.append("Nombre: ").append(datos[i].getNombre()).append("\n");
                sb.append("Precio: ").append(Double.toString(datos[i].getPrecio())).append("\n");
                sb.append("\n");
            }
        }
        String resultado = sb.toString().trim();
        texto.setText(resultado);
    }//GEN-LAST:event_bMostrarProductosActionPerformed

    private void bMostrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarProductoActionPerformed
        StringBuilder sb = new StringBuilder();
        Producto dato=listaQ.ExtraerDato();
        if(dato != null){
            sb.append("Nombre: ").append(dato.getNombre()).append("\n");
            sb.append("Precio: ").append(Double.toString(dato.getPrecio())).append("\n");
            sb.append("\n");
        }
        String resultado = sb.toString().trim();
        texto.setText(resultado);
    }//GEN-LAST:event_bMostrarProductoActionPerformed

    private void bAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarProductoActionPerformed
        listaQ.Insertar(Double.parseDouble(jtPrecioCRUD.getText()), jtNombreCRUD.getText());
        JOptionPane.showMessageDialog(this, "Producto agregado exitosamente!");
    }//GEN-LAST:event_bAgregarProductoActionPerformed

    private void jtNombreCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreCRUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreCRUDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarProducto;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bMostrarProducto;
    private javax.swing.JButton bMostrarProductos;
    private javax.swing.JPanel cont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtNombreCRUD;
    private javax.swing.JTextField jtPrecioCRUD;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
