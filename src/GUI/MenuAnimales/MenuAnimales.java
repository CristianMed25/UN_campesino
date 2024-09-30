/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MenuAnimales;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author CristianM
 */
public class MenuAnimales extends javax.swing.JPanel {

    /**
     * Creates new form MenuAnimales
     */
    public MenuAnimales() {
        initComponents();
    }
    
    private void cambiarPagina(JPanel p) {
        p.setSize(780,640);
        p.setLocation(0,0);
        contenido.removeAll();
        contenido.add(p,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        presentacion = new javax.swing.JLabel();
        bAveCRUD = new javax.swing.JButton();
        bBovinoCRUD = new javax.swing.JButton();
        bCaballoCRUD = new javax.swing.JButton();
        bOvinoCRUD = new javax.swing.JButton();
        bPezCRUD = new javax.swing.JButton();
        bPorcinoCRUD = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setPreferredSize(new java.awt.Dimension(780, 640));

        presentacion.setText("Seleccione el tipo de animal que desea modificar");

        bAveCRUD.setText("Ave");
        bAveCRUD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bAveCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAveCRUDActionPerformed(evt);
            }
        });

        bBovinoCRUD.setText("Bovino");
        bBovinoCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBovinoCRUDActionPerformed(evt);
            }
        });

        bCaballoCRUD.setText("Caballo");
        bCaballoCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCaballoCRUDActionPerformed(evt);
            }
        });

        bOvinoCRUD.setText("Ovino");
        bOvinoCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOvinoCRUDActionPerformed(evt);
            }
        });

        bPezCRUD.setText("Pez");
        bPezCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPezCRUDActionPerformed(evt);
            }
        });

        bPorcinoCRUD.setText("Porcino");
        bPorcinoCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPorcinoCRUDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presentacion)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(bAveCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bBovinoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bCaballoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addComponent(bOvinoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bPezCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bPorcinoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(presentacion)
                .addGap(44, 44, 44)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAveCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBovinoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCaballoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bOvinoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPezCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPorcinoCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bAveCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAveCRUDActionPerformed
        AveCRUD aveCRUD = new AveCRUD();
        cambiarPagina(aveCRUD);
    }//GEN-LAST:event_bAveCRUDActionPerformed

    private void bBovinoCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBovinoCRUDActionPerformed
        // TODO add your handling code here:
        BovinoCRUD bovinoCRUD = new BovinoCRUD();
        cambiarPagina(bovinoCRUD);
    }//GEN-LAST:event_bBovinoCRUDActionPerformed

    private void bCaballoCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCaballoCRUDActionPerformed
        // TODO add your handling code here:
        CaballoCRUD caballoCRUD = new CaballoCRUD();
        cambiarPagina(caballoCRUD);
    }//GEN-LAST:event_bCaballoCRUDActionPerformed

    private void bOvinoCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOvinoCRUDActionPerformed
        // TODO add your handling code here:
        OvinoCRUD ovinoCRUD = new OvinoCRUD();
        cambiarPagina(ovinoCRUD);
    }//GEN-LAST:event_bOvinoCRUDActionPerformed

    private void bPezCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPezCRUDActionPerformed
        // TODO add your handling code here:
        PezCRUD pezCRUD = new PezCRUD();
        cambiarPagina(pezCRUD);
    }//GEN-LAST:event_bPezCRUDActionPerformed

    private void bPorcinoCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPorcinoCRUDActionPerformed
        // TODO add your handling code here:
        PorcinoCRUD porcinoCRUD = new PorcinoCRUD();
        cambiarPagina(porcinoCRUD);
    }//GEN-LAST:event_bPorcinoCRUDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAveCRUD;
    private javax.swing.JButton bBovinoCRUD;
    private javax.swing.JButton bCaballoCRUD;
    private javax.swing.JButton bOvinoCRUD;
    private javax.swing.JButton bPezCRUD;
    private javax.swing.JButton bPorcinoCRUD;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel presentacion;
    // End of variables declaration//GEN-END:variables
}