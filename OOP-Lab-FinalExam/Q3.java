import javax.swing.JOptionPane;

public class Q3 extends javax.swing.JFrame {


    public Q3() {
        initComponents();
    }


        private void initComponents() {

        FastFoods = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ffQuantity = new javax.swing.JTextField();
        DrinkQuantity = new javax.swing.JTextField();
        Drinks = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Click = new javax.swing.JButton();
        Amounttotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FastFoods.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burger", "Pizza", "Sandwich", "Fries", "Pasta" }));

        jLabel1.setText("Fastfood");

        ffQuantity.setToolTipText("Enter Quantity of Chosen FastFood");
        ffQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ffQuantityActionPerformed(evt);
            }
        });

        DrinkQuantity.setToolTipText("Enter Quantity of Drinks");

        Drinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pepsi", "Coke", "Fanta", "Coffee", "Dew" }));

        jLabel2.setText("Drinks");

        Click.setText("Click");
        Click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FastFoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ffQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Drinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DrinkQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Click))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Amounttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Drinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrinkQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FastFoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ffQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Click)
                .addGap(18, 18, 18)
                .addComponent(Amounttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }
    private void ffQuantityActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void ClickActionPerformed(java.awt.event.ActionEvent evt) {        try {
            totalamount = 0;
            switch (FastFoods.getSelectedIndex()) {
                case 0: {
                    int Quantity = Integer.parseInt(ffQuantity.getText());
                    totalamount += Quantity * 400;
                    break;
                }
                case 1: {
                    int Quantity = Integer.parseInt(ffQuantity.getText());
                    totalamount += Quantity * 950;
                    break;
                }
                case 2: {
                    int Quantity = Integer.parseInt(ffQuantity.getText());
                    totalamount += Quantity * 170;
                    break;
                }
                case 3: {
                    int Quantity = Integer.parseInt(ffQuantity.getText());
                    totalamount += Quantity * 50;
                    break;
                }
                case 4: {
                    int Quantity = Integer.parseInt(ffQuantity.getText());
                    totalamount += Quantity * 500;
                    break;
                }
                default:
                    break;
            }
            int Quantity = Integer.parseInt(DrinkQuantity.getText());
            totalamount += Quantity * 110;
            Amounttotal.setText("" + totalamount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Choosen Quantity");
        }
    }
    int totalamount = 0;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q3().setVisible(true);
            }
        });
    }

        private javax.swing.JTextField Amounttotal;
    private javax.swing.JButton Click;
    private javax.swing.JTextField DrinkQuantity;
    private javax.swing.JComboBox<String> Drinks;
    private javax.swing.JComboBox<String> FastFoods;
    private javax.swing.JTextField ffQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    }
