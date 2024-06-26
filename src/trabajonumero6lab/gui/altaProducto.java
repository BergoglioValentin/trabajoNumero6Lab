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
public class altaProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form altaProducto
     */
    public altaProducto() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCodigoProducto = new javax.swing.JTextField();
        jDescripcionProducto = new javax.swing.JTextField();
        jPrecioProducto = new javax.swing.JTextField();
        jStockProducto = new javax.swing.JTextField();
        jRubroProducto = new javax.swing.JComboBox<>();
        jAgregarProducto = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta de producto");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Rubro:");

        jLabel6.setText("Stock:");

        jRubroProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestibles", "Limpieza", "Perfumeria", "Bebidas" }));

        jAgregarProducto.setText("Agregar");
        jAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDescripcionProducto)
                            .addComponent(jCodigoProducto)
                            .addComponent(jPrecioProducto)
                            .addComponent(jStockProducto)
                            .addComponent(jRubroProducto, 0, 278, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRubroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jAgregarProducto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarProductoActionPerformed
        // TODO add your handling code here:
        int codigo;
        double precio;
        int stock;
        
        try{
            codigo = Integer.parseInt(jCodigoProducto.getText());
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Error(Ingrese un numero)");
            jCodigoProducto.setText("");
            jCodigoProducto.requestFocus();
            return;
        }
        
        String descripcion = jDescripcionProducto.getText();
        
        try{
            precio = Double.parseDouble(jPrecioProducto.getText());
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Error(Ingrese un numero)");
            jPrecioProducto.setText("");
            jPrecioProducto.requestFocus();
            return;
        }
         
        try{
            stock = Integer.parseInt(jStockProducto.getText());
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Error(Ingrese un numero)");
            jStockProducto.setText("");
            jStockProducto.requestFocus();
            return;
        }
        
        String rubro = jRubroProducto.getSelectedItem().toString();
        
        producto p = new producto(codigo,descripcion,precio,stock,rubro);
        
        principal.getProductos().add(p);
    
        JOptionPane.showMessageDialog(this, "Producto Agregado");
        
        limpiarInputs();
    }//GEN-LAST:event_jAgregarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregarProducto;
    private javax.swing.JTextField jCodigoProducto;
    private javax.swing.JTextField jDescripcionProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jPrecioProducto;
    private javax.swing.JComboBox<String> jRubroProducto;
    private javax.swing.JTextField jStockProducto;
    // End of variables declaration//GEN-END:variables
    public void limpiarInputs(){
        jCodigoProducto.setText("");
        jDescripcionProducto.setText("");
        jPrecioProducto.setText("");
        jStockProducto.setText("");
    }
}
