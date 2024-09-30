/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MenuCultivos;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author CristianM
 */
public class MenuCultivos extends javax.swing.JPanel {

    /**
     * Creates new form MenuCultivos
     */
    public MenuCultivos() {
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
        bCerealCRUD = new javax.swing.JButton();
        bFrutalCRUD = new javax.swing.JButton();
        bHortalizaCRUD = new javax.swing.JButton();
        bLeguminosaCRUD = new javax.swing.JButton();
        bOleaginosaCRUD = new javax.swing.JButton();
        bOrnamentalCRUD = new javax.swing.JButton();
        bRaicesTuberculosCRUD = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setPreferredSize(new java.awt.Dimension(780, 640));
        contenido.setRequestFocusEnabled(false);

        presentacion.setText("Seleccione el tipo de cultivo que desea modificar");

        bCerealCRUD.setText("Cereal");
        bCerealCRUD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCerealCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerealCRUDActionPerformed(evt);
            }
        });

        bFrutalCRUD.setText("Frutal");
        bFrutalCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFrutalCRUDActionPerformed(evt);
            }
        });

        bHortalizaCRUD.setText("Hortaliza");
        bHortalizaCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHortalizaCRUDActionPerformed(evt);
            }
        });

        bLeguminosaCRUD.setText("Leguminosa");
        bLeguminosaCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLeguminosaCRUDActionPerformed(evt);
            }
        });

        bOleaginosaCRUD.setText("Oleaginosa");
        bOleaginosaCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOleaginosaCRUDActionPerformed(evt);
            }
        });

        bOrnamentalCRUD.setText("Ornamental");
        bOrnamentalCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrnamentalCRUDActionPerformed(evt);
            }
        });

        bRaicesTuberculosCRUD.setText("Raíces y tuberculos");
        bRaicesTuberculosCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRaicesTuberculosCRUDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bOleaginosaCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(contenidoLayout.createSequentialGroup()
                            .addComponent(bCerealCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(bFrutalCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bLeguminosaCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRaicesTuberculosCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bOrnamentalCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHortalizaCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(presentacion)
                .addGap(37, 37, 37)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCerealCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFrutalCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHortalizaCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLeguminosaCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOleaginosaCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOrnamentalCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(bRaicesTuberculosCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bCerealCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerealCRUDActionPerformed
        CerealCRUD cerealCRUD = new CerealCRUD();
        cambiarPagina(cerealCRUD);
    }//GEN-LAST:event_bCerealCRUDActionPerformed

    private void bFrutalCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFrutalCRUDActionPerformed
        FrutalCRUD frutalCRUD = new FrutalCRUD();
        cambiarPagina(frutalCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_bFrutalCRUDActionPerformed

    private void bHortalizaCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHortalizaCRUDActionPerformed
        HortalizaCRUD hortalizaCRUD = new HortalizaCRUD();
        cambiarPagina(hortalizaCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_bHortalizaCRUDActionPerformed

    private void bLeguminosaCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLeguminosaCRUDActionPerformed
        LeguminosaCRUD leguminosaCRUD = new LeguminosaCRUD();
        cambiarPagina(leguminosaCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_bLeguminosaCRUDActionPerformed

    private void bOleaginosaCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOleaginosaCRUDActionPerformed
        OleaginosaCRUD oleaginosaCRUD = new OleaginosaCRUD();
        cambiarPagina(oleaginosaCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_bOleaginosaCRUDActionPerformed

    private void bOrnamentalCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrnamentalCRUDActionPerformed
        OrnamentalCRUD ornamentalCRUD = new OrnamentalCRUD();
        cambiarPagina(ornamentalCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_bOrnamentalCRUDActionPerformed

    private void bRaicesTuberculosCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaicesTuberculosCRUDActionPerformed
        Raiz_Y_TuberculoCRUD raiz_Y_TuberculoCRUD = new Raiz_Y_TuberculoCRUD();
        cambiarPagina(raiz_Y_TuberculoCRUD);
        // TODO add your handling code here:
    }//GEN-LAST:event_bRaicesTuberculosCRUDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerealCRUD;
    private javax.swing.JButton bFrutalCRUD;
    private javax.swing.JButton bHortalizaCRUD;
    private javax.swing.JButton bLeguminosaCRUD;
    private javax.swing.JButton bOleaginosaCRUD;
    private javax.swing.JButton bOrnamentalCRUD;
    private javax.swing.JButton bRaicesTuberculosCRUD;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel presentacion;
    // End of variables declaration//GEN-END:variables
}
