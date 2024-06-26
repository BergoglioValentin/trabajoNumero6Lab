/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajonumero6lab.gui;

import entidades.producto;
import java.util.TreeSet;
import proyectolaboratorioclase.gui.consultaPorPrecio;

/**
 *
 * @author Frank
 */
public class principal extends javax.swing.JFrame {
    
    private static TreeSet<producto> productos = new TreeSet();
    private static producto aux = new producto();

    /**
     * Creates new form principal
     */
    public principal() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        altaProducto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jConsultaProducto = new javax.swing.JMenuItem();
        jConsultaRubro = new javax.swing.JMenuItem();
        jConsultaPrecio = new javax.swing.JMenuItem();
        jConsultaNombre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        altaProducto.setText("Alta");
        altaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaProductoActionPerformed(evt);
            }
        });
        jMenu1.add(altaProducto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jConsultaProducto.setText("Consulta y baja");
        jConsultaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultaProducto);

        jConsultaRubro.setText("Consulta Rubro");
        jConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultaRubro);

        jConsultaPrecio.setText("Consulta Precio");
        jConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultaPrecio);

        jConsultaNombre.setText("Consulta Nombre");
        jConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultaNombre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaProductoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        altaProducto ap = new altaProducto();
        ap.setVisible(true);
        escritorio.add(ap);
        escritorio.moveToFront(ap);
    }//GEN-LAST:event_altaProductoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jConsultaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaProductoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        consultaProducto cp = new consultaProducto();
        cp.setVisible(true);
        escritorio.add(cp);
        escritorio.moveToFront(cp);
    }//GEN-LAST:event_jConsultaProductoActionPerformed

    private void jConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaRubroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        consultaPorRubro cpr = new consultaPorRubro();
        cpr.setVisible(true);
        escritorio.add(cpr);
        escritorio.moveToFront(cpr);
    }//GEN-LAST:event_jConsultaRubroActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaPrecioActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        consultaPorPrecio cpp = new consultaPorPrecio();
        cpp.setVisible(true);
        escritorio.add(cpp);
        escritorio.moveToFront(cpp);
    }//GEN-LAST:event_jConsultaPrecioActionPerformed

    private void jConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaNombreActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        consultaPorNombre cpn = new consultaPorNombre();
        cpn.setVisible(true);
        escritorio.add(cpn);
        escritorio.moveToFront(cpn);
        
    }//GEN-LAST:event_jConsultaNombreActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaProducto;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jConsultaNombre;
    private javax.swing.JMenuItem jConsultaPrecio;
    private javax.swing.JMenuItem jConsultaProducto;
    private javax.swing.JMenuItem jConsultaRubro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public static TreeSet<producto> getProductos() {
        return productos;
    }

    public static producto getAux() {
        return aux;
    } 

    public static void setAux(producto aux) {
        principal.aux = aux;
    }
        
   
}
