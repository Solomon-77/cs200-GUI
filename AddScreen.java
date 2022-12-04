/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Eustaquio
 */
public class AddScreen extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public AddScreen() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addEmployeePnl = new javax.swing.JPanel();
        addEmployeeLabel = new javax.swing.JLabel();
        addCustomerPnl = new javax.swing.JPanel();
        addCustomerLabel = new javax.swing.JLabel();
        addPropertyBtn = new javax.swing.JPanel();
        addPropertyLabel = new javax.swing.JLabel();
        addBookingBtn = new javax.swing.JPanel();
        addBookingPnl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 11, 80));

        addLabel.setBackground(java.awt.Color.red);
        addLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        addLabel.setForeground(java.awt.Color.red);
        addLabel.setText("Add");

        BackBtn.setBackground(java.awt.Color.white);
        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackBtn.setForeground(java.awt.Color.white);
        BackBtn.setText("<");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(addLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BackBtn)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(addLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(76, 17, 123));

        addEmployeePnl.setBackground(new java.awt.Color(76, 17, 123));
        addEmployeePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 11, 80), 2));
        addEmployeePnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeePnlMouseClicked(evt);
            }
        });

        addEmployeeLabel.setBackground(java.awt.Color.white);
        addEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addEmployeeLabel.setForeground(java.awt.Color.white);
        addEmployeeLabel.setText("Employee");

        javax.swing.GroupLayout addEmployeePnlLayout = new javax.swing.GroupLayout(addEmployeePnl);
        addEmployeePnl.setLayout(addEmployeePnlLayout);
        addEmployeePnlLayout.setHorizontalGroup(
            addEmployeePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmployeePnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addEmployeeLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        addEmployeePnlLayout.setVerticalGroup(
            addEmployeePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        addCustomerPnl.setBackground(new java.awt.Color(76, 17, 123));
        addCustomerPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 11, 80), 2));
        addCustomerPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCustomerPnlMouseClicked(evt);
            }
        });

        addCustomerLabel.setBackground(java.awt.Color.white);
        addCustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCustomerLabel.setForeground(java.awt.Color.white);
        addCustomerLabel.setText("Customer");

        javax.swing.GroupLayout addCustomerPnlLayout = new javax.swing.GroupLayout(addCustomerPnl);
        addCustomerPnl.setLayout(addCustomerPnlLayout);
        addCustomerPnlLayout.setHorizontalGroup(
            addCustomerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustomerPnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addCustomerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addCustomerPnlLayout.setVerticalGroup(
            addCustomerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCustomerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        addPropertyBtn.setBackground(new java.awt.Color(76, 17, 123));
        addPropertyBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 11, 80), 2));
        addPropertyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPropertyBtnMouseClicked(evt);
            }
        });

        addPropertyLabel.setBackground(java.awt.Color.white);
        addPropertyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addPropertyLabel.setForeground(java.awt.Color.white);
        addPropertyLabel.setText("Property");

        javax.swing.GroupLayout addPropertyBtnLayout = new javax.swing.GroupLayout(addPropertyBtn);
        addPropertyBtn.setLayout(addPropertyBtnLayout);
        addPropertyBtnLayout.setHorizontalGroup(
            addPropertyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPropertyBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPropertyLabel)
                .addGap(16, 16, 16))
        );
        addPropertyBtnLayout.setVerticalGroup(
            addPropertyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPropertyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        addBookingBtn.setBackground(new java.awt.Color(76, 17, 123));
        addBookingBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 11, 80), 2));
        addBookingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookingBtnMouseClicked(evt);
            }
        });

        addBookingPnl.setBackground(java.awt.Color.white);
        addBookingPnl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBookingPnl.setForeground(java.awt.Color.white);
        addBookingPnl.setText("Inspection Booking");

        javax.swing.GroupLayout addBookingBtnLayout = new javax.swing.GroupLayout(addBookingBtn);
        addBookingBtn.setLayout(addBookingBtnLayout);
        addBookingBtnLayout.setHorizontalGroup(
            addBookingBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookingBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookingPnl)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        addBookingBtnLayout.setVerticalGroup(
            addBookingBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBookingPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addEmployeePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCustomerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPropertyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(addBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(addEmployeePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addCustomerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPropertyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        Menu main = new Menu();
        main.show();
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void addEmployeePnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeePnlMouseClicked
        AddEmployeeScreen employee = new AddEmployeeScreen();
        employee.show();
        this.dispose();
    }//GEN-LAST:event_addEmployeePnlMouseClicked

    private void addCustomerPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustomerPnlMouseClicked
        AddCustomerScreen customer = new AddCustomerScreen();
        customer.show();
        this.dispose();
    }//GEN-LAST:event_addCustomerPnlMouseClicked

    private void addPropertyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPropertyBtnMouseClicked
        AddPropertiesScreen properties = new AddPropertiesScreen();
        properties.show();
        this.dispose();
    }//GEN-LAST:event_addPropertyBtnMouseClicked

    private void addBookingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookingBtnMouseClicked
        AddInspectionBooking inspection = new AddInspectionBooking();
        inspection.show();
        this.dispose();
    }//GEN-LAST:event_addBookingBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JPanel addBookingBtn;
    private javax.swing.JLabel addBookingPnl;
    private javax.swing.JLabel addCustomerLabel;
    private javax.swing.JPanel addCustomerPnl;
    private javax.swing.JLabel addEmployeeLabel;
    private javax.swing.JPanel addEmployeePnl;
    private javax.swing.JLabel addLabel;
    private javax.swing.JPanel addPropertyBtn;
    private javax.swing.JLabel addPropertyLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
