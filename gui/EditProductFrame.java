/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import planetfood.dao.CategoryDao;
import planetfood.dao.EmployeeDao;
import planetfood.dao.ProductDao;
import planetfood.pojo.Employee;
import planetfood.pojo.Product;
import planetfood.pojo.UserProfile;

/**
 *
 * @author Dell
 */
public class EditProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditProductFrame
     */HashMap<String,String> categories=new HashMap<>();
    HashMap<String ,Product> productList=new HashMap<>();
   
    public EditProductFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
            jlName.setText("Hello "+UserProfile.getUserName());
    loadProductDetails();
            //super.setLocationRelativeTo(null);
      //   jlName.setText("Hello "+UserProfile.getUserName());
   

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbIsActive = new javax.swing.JCheckBox();
        jcCatId = new javax.swing.JComboBox<>();
        jcPrdId = new javax.swing.JComboBox<>();
        jtfProductPrice = new javax.swing.JTextField();
        jtfProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlName = new javax.swing.JLabel();
        jlLogout = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(10, 10, 10, 10));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(10, 10, 10, 10));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCT EDITING PANEL");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose Product To Edit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Category");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Price");

        jcbIsActive.setBackground(new java.awt.Color(0, 153, 102));
        jcbIsActive.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jcbIsActive.setForeground(new java.awt.Color(255, 255, 255));
        jcbIsActive.setText("Is Active");

        jcCatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCatIdActionPerformed(evt);
            }
        });

        jcPrdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPrdIdActionPerformed(evt);
            }
        });

        jtfProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProductNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3))
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbIsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcPrdId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPrdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcbIsActive)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\vege.png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jlName.setForeground(new java.awt.Color(255, 255, 255));
        jlName.setText("jLabel3");

        jlLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlLogout.setText("Logout");
        jlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(146, 146, 146)
                        .addComponent(jlLogout))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlLogout)
                            .addComponent(jlName)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(97, 97, 97)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         if(validateInput()==true)
        {
            JOptionPane.showMessageDialog(null,"PLEASE FILL ALL THE FILLEDS", "Empty Value", JOptionPane.ERROR_MESSAGE);
            return;     
        }  
        try
        {
           Product p=new Product();
         String catName=jcCatId.getSelectedItem().toString();
          String catId=categories.get(catName);
            p.setCatId(catId);
           p.setProdId((String)jcPrdId.getSelectedItem());
        p.setProdName(jtfProductName.getText());
          p.setProdPrice(Integer.parseInt(jtfProductPrice.getText()));
       if(jcbIsActive.isSelected())
          p.setIsActive("Y");
       else
           p.setIsActive("N");
         if(ProductDao.editProduct(p))
          {
              JOptionPane.showMessageDialog(null,"UPDATE SUCCESSFULLY", "SUCCESS!!", JOptionPane.INFORMATION_MESSAGE);
         jtfProductName.setText("");jtfProductPrice.setText("");jcbIsActive.setSelected(false);
          }
          else
          {
              JOptionPane.showMessageDialog(null,"NOT UPDATE", "ERROR!!", JOptionPane.ERROR_MESSAGE);
            jtfProductName.setText("");jtfProductPrice.setText("");jcbIsActive.setSelected(false);
      
          }
        //  jtfProductName.setText("");jtfProductPrice.setText("");jcbIsActive.setSelected(false);
        }
          catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CORRECT INFORMATION", "!!SUCCESS!!", JOptionPane.ERROR_MESSAGE); 
            jtfProductName.setText("");jtfProductPrice.setText("");jcbIsActive.setSelected(false);
        }
        catch(SQLException ex){ex.printStackTrace();}
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseClicked
        this.dispose();
        LoginFrame l=new LoginFrame();
        l.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlLogoutMouseClicked

    private void jlLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseEntered
        jlLogout.setForeground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlLogoutMouseEntered

    private void jlLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoutMouseExited
        jlLogout.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlLogoutMouseExited

    private void jtfProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProductNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.dispose();
        AdminOptionsFrame af=new AdminOptionsFrame();
        af.setVisible(true);
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcCatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCatIdActionPerformed
        // TODO add your handling code here:
          try
        {
          String catName=jcCatId.getSelectedItem().toString();
          String catId=categories.get(catName);
        productList=ProductDao.getProductsByCategory(catId);
  
        jcPrdId.removeAllItems();
        for(String prdId:productList.keySet())
        {jcPrdId.addItem(prdId);
        }
        }
        catch(SQLException ex)
        {
            
        }
    
    }//GEN-LAST:event_jcCatIdActionPerformed

    private void jcPrdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPrdIdActionPerformed
        // TODO add your handling code here:
                    if(jcPrdId.getSelectedItem()==null)
            return;
        String prodId=jcPrdId.getSelectedItem().toString();
        Product p=productList.get(prodId);
     //   txtProdName.setText(p.getProdName());
       // txtProdPrice.setText(String.valueOf(p.getProdPrice()));
     jtfProductName.setText(p.getProdName());
        jtfProductPrice.setText(String.valueOf(p.getProdPrice()));
        String prodIsActive=p.getIsActive();
        if(prodIsActive.equalsIgnoreCase("Y"))
    jcbIsActive.setSelected(true);
        else
           jcbIsActive.setSelected(false);

    }//GEN-LAST:event_jcPrdIdActionPerformed

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
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProductFrame().setVisible(true);
            }
        });
    }

    public void loadProductDetails()
    {
        try
        {
            categories =CategoryDao.getAllCategoryId();
            for(String catName:categories.keySet())
                jcCatId.addItem(catName);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
     private boolean validateInput()
    {
        if(jtfProductName.getText().isEmpty())      
        {
            return true;
            
        }else{return false;}
    }
    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcCatId;
    private javax.swing.JComboBox<String> jcPrdId;
    private javax.swing.JCheckBox jcbIsActive;
    private javax.swing.JLabel jlLogout;
    private javax.swing.JLabel jlName;
    private javax.swing.JTextField jtfProductName;
    private javax.swing.JTextField jtfProductPrice;
    // End of variables declaration//GEN-END:variables
}
