import javax.swing.JOptionPane;
public class Q1 extends javax.swing.JFrame {
    long[] PhoneNumbers = {3439020239l, 3439555964l, 3139919131l};
    String[] Names = {"Osama Khan", "Irfan Shabir", "Malik Mehmood"};
    private javax.swing.JButton BackSpace;
    private javax.swing.JTextField DisplayFrame;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton hash;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton star;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;

    public Q1() {
        initComponents();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q1().setVisible(true);
            }
        });
    }
    private void initComponents() {

        DisplayFrame = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        six = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        hash = new javax.swing.JButton();
        star = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        BackSpace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dialer");
        setLocation(new java.awt.Point(250, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        DisplayFrame.setEditable(false);
        DisplayFrame.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        DisplayFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayFrameActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(153, 255, 204));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(153, 255, 204));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(153, 255, 204));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(153, 255, 204));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(153, 255, 204));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(153, 255, 204));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(153, 255, 204));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(153, 255, 204));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(153, 255, 204));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        hash.setBackground(new java.awt.Color(102, 255, 255));
        hash.setText("#");
        hash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashActionPerformed(evt);
            }
        });

        star.setBackground(new java.awt.Color(153, 153, 255));
        star.setText("*");
        star.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(153, 255, 204));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 255, 51));
        jButton9.setText("DIAL");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("END");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        BackSpace.setText("<--");
        BackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DisplayFrame)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(BackSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                                        .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                                        .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                                        .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(three, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(hash, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{eight, five, four, hash, nine, one, seven, six, star, three, two, zero});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DisplayFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                                        .addComponent(BackSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(one)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(three)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hash, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{eight, five, four, hash, nine, one, seven, six, star, three, two, zero});

        pack();
    }

    private void DisplayFrameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "1");
    }

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "2");
    }

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "4");
    }

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "5");
    }

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "7");
    }

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "8");
    }

    private void starActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "*");
    }

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "0");
    }

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "9");
    }

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "3");
    }

    private void hashActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "#");
    }

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {
        DisplayFrame.setText(DisplayFrame.getText() + "6");
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (Long.parseLong(DisplayFrame.getText()) == PhoneNumbers[0]) {
                int opt = JOptionPane.showConfirmDialog(this, "Do you want to call\nName: " + Names[0] + "\nNumber: " + PhoneNumbers[0], "Call Confiramation", JOptionPane.YES_OPTION);
                if (opt == 0) {
                    DisplayFrame.setText("" + "Dialing....");
                } else {
                    DisplayFrame.setText("");
                }
            } else if (Long.parseLong(DisplayFrame.getText()) == PhoneNumbers[1]) {
                int opt = JOptionPane.showConfirmDialog(this, "Do you want to call\nName: " + Names[1] + "\nNumber: " + PhoneNumbers[1], "Call Confiramation", JOptionPane.YES_OPTION);
                if (opt == 0) {
                    DisplayFrame.setText("" + "Dialing....");
                } else {
                    DisplayFrame.setText("");
                }
            } else if (Long.parseLong(DisplayFrame.getText()) == PhoneNumbers[2]) {
                int opt = JOptionPane.showConfirmDialog(this, "Do you want to call\nName: " + Names[2] + "\nNumber: " + PhoneNumbers[2], "Call Confiramation", JOptionPane.YES_OPTION);
                if (opt == 0) {
                    DisplayFrame.setText("" + "Dialing....");
                } else {
                    DisplayFrame.setText("");
                }
            } else {
                int opt = JOptionPane.showConfirmDialog(this, "Do you want to call\nNumber: " + Long.parseLong(DisplayFrame.getText()), "Call Confiramation", JOptionPane.YES_OPTION);
                if (opt == 0) {
                    DisplayFrame.setText("" + "Dialing....");
                } else {
                    DisplayFrame.setText("");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Number invalid!");
        }

    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void BackSpaceActionPerformed(java.awt.event.ActionEvent evt) {
        if (DisplayFrame.getText().equals("")) {
        } else {
            char[] temp = DisplayFrame.getText().toCharArray();
            temp[temp.length - 1] = ' ';
            DisplayFrame.setText(String.valueOf(temp).trim());
        }
    }
}
