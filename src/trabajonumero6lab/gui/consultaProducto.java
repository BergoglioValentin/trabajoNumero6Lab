/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajonumero6lab.gui;

import entidades.producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class consultaProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form consultaProducto
     */
    public consultaProducto() {
        initComponents();
        jConsultaDescripcion.setEnabled(false);
        jConsultaPrecio.setEnabled(false);
        jConsultaRubro.setEnabled(false);
        jConsultaStock.setEnabled(false);
        eliminarProducto.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDescripcionProducto = new javax.swing.JTextField();
        jPrecioProducto = new javax.swing.JTextField();
        jStockProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jConsultaProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jConsultaDescripcion = new javax.swing.JTextField();
        jConsultaPrecio = new javax.swing.JTextField();
        jConsultaStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jConsultaRubro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:");

        jLabel6.setText("Stock:");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Producto");

        jLabel2.setText("Codigo:");

        jLabel5.setText("Descripción:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Stock:");

        jLabel9.setText("Rubro:");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        eliminarProducto.setText("Eliminar");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jConsultaProducto)
                            .addComponent(jConsultaStock)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jConsultaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jConsultaPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jConsultaRubro)))
                    .addComponent(eliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jConsultaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jConsultaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jConsultaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jConsultaStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConsultaRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarProducto)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int consultaCodigo;
        boolean encontrado = false;
             
        try{
            consultaCodigo = Integer.parseInt(jConsultaProducto.getText());
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this,"Error(No ingresó un numero)");
            jConsultaProducto.setText("");
            jConsultaProducto.requestFocus();
            return;
        }

       for(producto p : principal.getProductos()){
           if(consultaCodigo == p.getCodigo()){
               jConsultaDescripcion.setText(p.getDescripcion());
               jConsultaPrecio.setText(String.valueOf(p.getPrecio()));
               jConsultaRubro.setText(p.getRubro());
               jConsultaStock.setText(String.valueOf(p.getStock()));
               jConsultaProducto.setText("");
               encontrado = true;
               eliminarProducto.setEnabled(true);
               principal.setAux(p);
           }
       }
       
       if(!encontrado){
           JOptionPane.showMessageDialog(this,"Producto no encontrado");
           eliminarProducto.setEnabled(false);
           jConsultaProducto.setText("");
           jConsultaProducto.requestFocus();
           limpiar();
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea eliminar este producto (" + principal.getAux().getDescripcion() + ")?","Confirmar",JOptionPane.YES_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            principal.getProductos().remove(principal.getAux());
            JOptionPane.showMessageDialog(this,"Producto eliminado...");
            limpiar();
        }
    }//GEN-LAST:event_eliminarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jConsultaDescripcion;
    private javax.swing.JTextField jConsultaPrecio;
    private javax.swing.JTextField jConsultaProducto;
    private javax.swing.JTextField jConsultaRubro;
    private javax.swing.JTextField jConsultaStock;
    private javax.swing.JTextField jDescripcionProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPrecioProducto;
    private javax.swing.JTextField jStockProducto;
    // End of variables declaration//GEN-END:variables
    public void limpiar(){
        jConsultaDescripcion.setText("");
        jConsultaPrecio.setText("");
        jConsultaRubro.setText("");
        jConsultaStock.setText("");
    }
}
