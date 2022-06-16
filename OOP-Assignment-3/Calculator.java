
import javax.swing.*;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 * @author FA20-BSE-023(NajeebSaid)
 */
public class Calculator extends javax.swing.JFrame {

    String expression;
    double result;
    BigDecimal Full_result;
    boolean PointStatus = false;
    private javax.swing.JMenuItem about;
    private javax.swing.JButton ac;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cbrt;
    private javax.swing.JButton cos;
    private javax.swing.JButton cot;
    private javax.swing.JButton csc;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton fullAnswer;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem helpcall;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton ln;
    private javax.swing.JButton log;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton power;
    private javax.swing.JMenuItem scientific_calc;
    private javax.swing.JButton sec;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton sqrt;
    private javax.swing.JMenuItem standard_calc;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;

    public Calculator() {
        initComponents();
        this.setSize(355, 415);
        ToggleOnOff(false);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    public void ToggleFunctions(boolean opt) {
        sin.setEnabled(opt);
        cos.setEnabled(opt);
        tan.setEnabled(opt);
        sqrt.setEnabled(opt);
        cbrt.setEnabled(opt);
        ln.setEnabled(opt);
        log.setEnabled(opt);
        cot.setEnabled(opt);
        csc.setEnabled(opt);
        sec.setEnabled(opt);

        ToggleArithmaticOperators(opt);

    }

    public void ToggleArithmaticOperators(boolean opt) {
        multiply.setEnabled(opt);
        plus.setEnabled(opt);
        minus.setEnabled(opt);
        divide.setEnabled(opt);
        power.setEnabled(opt);
    }

    public void ToggleOnOff(boolean opt) {
        display.setText("");
        Full_result = new BigDecimal(0);
        result = 0;
        one.setEnabled(opt);
        two.setEnabled(opt);
        three.setEnabled(opt);
        four.setEnabled(opt);
        five.setEnabled(opt);
        six.setEnabled(opt);
        seven.setEnabled(opt);
        eight.setEnabled(opt);
        nine.setEnabled(opt);
        zero.setEnabled(opt);
        minus.setEnabled(opt);
        plus.setEnabled(opt);
        multiply.setEnabled(opt);
        divide.setEnabled(opt);
        on.setEnabled(!opt);
        off.setEnabled(opt);
        display.setEnabled(opt);
        ac.setEnabled(opt);
        point.setEnabled(opt);
        equal.setEnabled(opt);
        power.setEnabled(opt);
        sin.setEnabled(opt);
        cos.setEnabled(opt);
        tan.setEnabled(opt);
        sqrt.setEnabled(opt);
        backspace.setEnabled(opt);
        cbrt.setEnabled(opt);
        cot.setEnabled(opt);
        csc.setEnabled(opt);
        sec.setEnabled(opt);
        log.setEnabled(opt);
        ln.setEnabled(opt);
        fullAnswer.setEnabled(false);
        if (!opt) {
            off.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        off = new javax.swing.JRadioButton();
        on = new javax.swing.JRadioButton();
        display = new javax.swing.JTextField();
        ac = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        four = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        one = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        point = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        power = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        fullAnswer = new javax.swing.JButton();
        cbrt = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        log = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        sec = new javax.swing.JButton();
        csc = new javax.swing.JButton();
        cot = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        standard_calc = new javax.swing.JMenuItem();
        scientific_calc = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        helpcall = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(520, 230));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        buttonGroup1.add(off);
        off.setFont(new java.awt.Font("Tahoma", 1, 11));
        off.setSelected(true);
        off.setText("OFF");
        off.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        buttonGroup1.add(on);
        on.setFont(new java.awt.Font("Tahoma", 1, 11));
        on.setText("ON");
        on.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        display.setEditable(false);
        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Tahoma", 1, 18));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(51, 51, 51), null, new java.awt.Color(255, 255, 255)));
        display.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        ac.setBackground(new java.awt.Color(255, 51, 51));
        ac.setFont(new java.awt.Font("Tahoma", 1, 10));
        ac.setForeground(new java.awt.Color(255, 255, 255));
        ac.setText("AC");
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 10));
        divide.setText("/");
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 1, 10));
        eight.setText("8");
        eight.setMaximumSize(new java.awt.Dimension(45, 45));
        eight.setMinimumSize(new java.awt.Dimension(45, 45));
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 1, 10));
        nine.setText("9");
        nine.setMaximumSize(new java.awt.Dimension(45, 45));
        nine.setMinimumSize(new java.awt.Dimension(45, 45));
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 1, 10));
        seven.setText("7");
        seven.setMaximumSize(new java.awt.Dimension(45, 45));
        seven.setMinimumSize(new java.awt.Dimension(45, 45));
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Tahoma", 1, 10));
        multiply.setText("*");
        multiply.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 1, 10));
        five.setText("5");
        five.setMaximumSize(new java.awt.Dimension(45, 45));
        five.setMinimumSize(new java.awt.Dimension(45, 45));
        five.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 1, 10));
        six.setText("6");
        six.setMaximumSize(new java.awt.Dimension(45, 45));
        six.setMinimumSize(new java.awt.Dimension(45, 45));
        six.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 1, 10));
        four.setText("4");
        four.setMaximumSize(new java.awt.Dimension(45, 45));
        four.setMinimumSize(new java.awt.Dimension(45, 45));
        four.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 10));
        minus.setText("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Tahoma", 1, 10));
        two.setText("2");
        two.setMaximumSize(new java.awt.Dimension(45, 45));
        two.setMinimumSize(new java.awt.Dimension(45, 45));
        two.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 1, 10));
        three.setText("3");
        three.setMaximumSize(new java.awt.Dimension(45, 45));
        three.setMinimumSize(new java.awt.Dimension(45, 45));
        three.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 1, 10));
        one.setText("1");
        one.setMaximumSize(new java.awt.Dimension(45, 45));
        one.setMinimumSize(new java.awt.Dimension(45, 45));
        one.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 1, 10));
        plus.setText("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        point.setFont(new java.awt.Font("Tahoma", 1, 10));
        point.setText(".");
        point.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 1, 10));
        equal.setText("=");
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 1, 10));
        zero.setText("0");
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        power.setFont(new java.awt.Font("Tahoma", 1, 10));
        power.setText("^");
        power.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(255, 255, 153));
        cos.setFont(new java.awt.Font("Tahoma", 1, 12));
        cos.setText("cos");
        cos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cos.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(255, 255, 153));
        sin.setFont(new java.awt.Font("Tahoma", 1, 12));
        sin.setText("sin");
        sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sin.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(255, 255, 153));
        tan.setFont(new java.awt.Font("Tahoma", 1, 12));
        tan.setText("tan");
        tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tan.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        sqrt.setBackground(new java.awt.Color(255, 255, 153));
        sqrt.setFont(new java.awt.Font("Tahoma", 1, 14));
        sqrt.setText("√");
        sqrt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        fullAnswer.setFont(new java.awt.Font("Tahoma", 1, 11));
        fullAnswer.setText("Full Answer");
        fullAnswer.setEnabled(false);
        fullAnswer.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullAnswerActionPerformed(evt);
            }
        });

        cbrt.setBackground(new java.awt.Color(255, 255, 153));
        cbrt.setFont(new java.awt.Font("Tahoma", 1, 14));
        cbrt.setText("3√");
        cbrt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbrt.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrtActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(51, 51, 255));
        backspace.setFont(new java.awt.Font("Tahoma", 1, 10));
        backspace.setForeground(new java.awt.Color(255, 255, 255));
        backspace.setText("<--");
        backspace.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(255, 255, 153));
        log.setFont(new java.awt.Font("Tahoma", 1, 12));
        log.setText("log");
        log.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        ln.setBackground(new java.awt.Color(255, 255, 153));
        ln.setFont(new java.awt.Font("Tahoma", 1, 12));
        ln.setText("ln");
        ln.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ln.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        sec.setBackground(new java.awt.Color(255, 255, 153));
        sec.setFont(new java.awt.Font("Tahoma", 1, 12));
        sec.setText("sec");
        sec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sec.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });

        csc.setBackground(new java.awt.Color(255, 255, 153));
        csc.setFont(new java.awt.Font("Tahoma", 1, 12));
        csc.setText("csc");
        csc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        csc.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cscActionPerformed(evt);
            }
        });

        cot.setBackground(new java.awt.Color(255, 255, 153));
        cot.setFont(new java.awt.Font("Tahoma", 1, 12));
        cot.setText("cot");
        cot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cot.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("Type");

        standard_calc.setText("Standard Calculator");
        standard_calc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        standard_calc.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standard_calcActionPerformed(evt);
            }
        });
        jMenu1.add(standard_calc);

        scientific_calc.setText("Scientific Calculator");
        scientific_calc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scientific_calc.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientific_calcActionPerformed(evt);
            }
        });
        jMenu1.add(scientific_calc);
        jMenu1.add(jSeparator2);

        jMenuBar1.add(jMenu1);

        help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        help.setText("More");

        about.setText("About");
        about.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        about.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        helpcall.setText("Help");
        helpcall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        helpcall.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpcallActionPerformed(evt);
            }
        });
        help.add(helpcall);
        help.add(jSeparator1);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(display)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(fullAnswer)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(off)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(on)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(backspace)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ac))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(eight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(six, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(log, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ln, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(csc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(fullAnswer)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(off)
                                                                        .addComponent(on))))
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(46, 46, 46)
                                                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(csc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(sqrt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                        .addComponent(ln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void onActionPerformed(java.awt.event.ActionEvent evt) {
        ToggleOnOff(true);
        expression = "";
        point.setEnabled(true);
    }

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "1");
        ToggleFunctions(true);
    }

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "2");
        ToggleFunctions(true);
    }

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "3");
        ToggleFunctions(true);
    }

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "4");
        ToggleFunctions(true);
    }

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "5");
        ToggleFunctions(true);
    }

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "6");
        ToggleFunctions(true);
    }

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "7");
        ToggleFunctions(true);
    }

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "8");
        ToggleFunctions(true);
    }

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "9");
        ToggleFunctions(true);
    }

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "0");
        ToggleFunctions(true);
    }

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + ".");
        PointStatus = true;
        point.setEnabled(false);
    }

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "+");
        point.setEnabled(true);

    }

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "-");
        point.setEnabled(true);

    }

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {
        expression = display.getText();
        if (expression.contains("/0")) {
            if (expression.contains("/0.")) {
                try {
                    result = eval(expression);
                    Full_result = new BigDecimal(eval(expression));
                } catch (ArithmeticException e) {
                    ToggleOnOff(false);
                    off.setSelected(true);
                    display.setText("Infinity");
                } catch (RuntimeException e) {
                    ToggleOnOff(false);
                    off.setSelected(true);
                    display.setText("Error");
                }
                display.setText(String.valueOf(result));
                fullAnswer.setEnabled(display.getText().contains("E"));
            } else {
                display.setText("Infinity");
            }
        } else {
            try {
                result = eval(expression);
                Full_result = new BigDecimal(eval(expression));
            } catch (ArithmeticException e) {
                ToggleOnOff(false);
                off.setSelected(true);
                display.setText("Infinity");
            } catch (RuntimeException e) {
                ToggleOnOff(false);
                off.setSelected(true);
                display.setText("Error");
            }
            if((result-(int)result)==0) {
                display.setText(String.valueOf((int)result));
            }else{
                display.setText(String.valueOf(result));
            }
            fullAnswer.setEnabled(display.getText().contains("E"));
        }
    }

    private void offActionPerformed(java.awt.event.ActionEvent evt) {
        ToggleOnOff(false);
        expression = "";

    }

    private void acActionPerformed(java.awt.event.ActionEvent evt) {
        ToggleOnOff(true);
    }

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "/");
        point.setEnabled(true);

    }

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "*");
        point.setEnabled(true);
    }

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "^");
        point.setEnabled(true);
        ToggleFunctions(false);
    }

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void fullAnswerActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            JOptionPane.showMessageDialog(null, Full_result.toPlainString(), "Full Answer", JOptionPane.PLAIN_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Null", "Full Answer", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {
        if (display.getText().equals("")) {
        } else {
            expression = display.getText();
            char[] exp = expression.toCharArray();
            exp[(exp.length) - 1] = ' ';
            expression = (String.valueOf(exp)).trim();
            display.setText(expression);
        }
    }

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "tan");
        ToggleFunctions(false);

    }

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "sin");
        ToggleFunctions(false);

    }

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "cos");
        ToggleFunctions(false);

    }

    private void cotActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "cot");
        ToggleFunctions(false);
    }

    private void cscActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "csc");
        ToggleFunctions(false);
    }

    private void secActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "sec");
        ToggleFunctions(false);

    }

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "ln");
        ToggleFunctions(false);

    }

    private void logActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "log");
        ToggleFunctions(false);

    }

    private void cbrtActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "cbrt");
        ToggleFunctions(false);

    }

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {
        display.setText(display.getText() + "sqrt");
        ToggleFunctions(false);

    }

    private void helpcallActionPerformed(java.awt.event.ActionEvent evt) {
        String message = """
                Welcome!
                To use this calculator properly and avoid issues. Follow this \nessential guide.

                USAGE:
                1.     Enter an Arithmetic Expression.

                2.     Press equal sign to get the result

                3.     For functions like cos, sin, etc. Click the specified \nbutton and enter the value.


                AVOID:
                1.     In case the result is in exponential form, then you \ncan view the entire result by pressing the full \nresult button.

                2.     Do not use two functions consecutively as it may \ngenerate a garbage value.

                3.     After pressing equal, do not use the functions \ndirectly after the result; instead, use an \narithmetic operator and then use functions.


                                        """;

        JOptionPane.showMessageDialog(this, message, "Instruction!", JOptionPane.INFORMATION_MESSAGE);
    }

    private void standard_calcActionPerformed(java.awt.event.ActionEvent evt) {
        expression = "";
        result = 0;
        Full_result = new BigDecimal(0);
        PointStatus = false;
        this.setSize(250, 415);
        display.setText("");
        power.setEnabled(false);
        power.setVisible(false);
        fullAnswer.setEnabled(false);
        fullAnswer.setVisible(false);
        ToggleOnOff(false);
    }

    private void scientific_calcActionPerformed(java.awt.event.ActionEvent evt) {
        expression = "";
        result = 0;
        Full_result = new BigDecimal(0);
        PointStatus = false;
        this.setSize(355, 415);
        display.setText("");
        power.setEnabled(true);
        power.setVisible(true);
        fullAnswer.setEnabled(true);
        fullAnswer.setVisible(true);
        ToggleOnOff(false);
    }

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, """
                This application is developed by
                Najeeb Said (FA20-BSE-023).
                It is programmed in JAVA using
                Apache Netbeans IDE 12.5 with
                JDK 17.0.1 .
                """, "About", JOptionPane.INFORMATION_MESSAGE);
    }

    public double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) {
                        x += parseTerm();
                    } else if (eat('-')) {
                        x -= parseTerm();
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) {
                        x *= parseFactor();
                    } else if (eat('/')) {
                        x /= parseFactor();
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (eat('+')) {
                    return parseFactor();
                }
                if (eat('-')) {
                    return -parseFactor();
                }
                double x;
                int startPos = this.pos;
                if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') {
                        nextChar();
                    }
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) {
                        x = Math.sqrt(x);
                    } else if (func.equals("sin")) {
                        x = Math.sin(Math.toRadians(x));
                    } else if (func.equals("cos")) {
                        x = Math.cos(Math.toRadians(x));
                    } else if (func.equals("tan")) {
                        x = Math.tan(Math.toRadians(x));
                    } else if (func.equals("sec")) {
                        x = 1.0 / (Math.sin(Math.toRadians(x)));
                    } else if (func.equals("csc")) {
                        x = 1.0 / (Math.cos(Math.toRadians(x)));
                    } else if (func.equals("cot")) {
                        x = 1.0 / (Math.tan(Math.toRadians(x)));
                    } else if (func.equals("cbrt")) {
                        x = Math.cbrt(x);
                    } else if (func.equals("log")) {
                        x = Math.log10(x);
                    } else if (func.equals("ln")) {
                        x = Math.log(x);
                    } else {
                        ErrorMessage("Function not found");
                        throw new RuntimeException();
                    }
                } else {
                    display.setText("Syntax Error");
                    ErrorMessage("Syntax Error encountered");
                    throw new RuntimeException();
                }

                if (eat('^')) {
                    x = Math.pow(x, parseFactor());
                }
                return x;
            }
        }.parse();
    }

    public void ErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.WARNING_MESSAGE);
    }
}

