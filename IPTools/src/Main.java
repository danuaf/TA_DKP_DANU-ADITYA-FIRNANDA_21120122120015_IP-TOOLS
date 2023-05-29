import com.tools.*;

import javax.swing.*;
import java.awt.*;

public class Main extends javax.swing.JFrame {

    final private javax.swing.JPanel Background = new javax.swing.JPanel();
    final private javax.swing.JPanel Calculate = new javax.swing.JPanel();
    final private javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    final private javax.swing.JTextField jtOctet1 = new javax.swing.JTextField();
    final private javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    final private javax.swing.JTextField jtOctet4 = new javax.swing.JTextField();
    final private javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    final private javax.swing.JTextField jtOctet3 = new javax.swing.JTextField();
    final private javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    final private javax.swing.JTextField jtPrefix = new javax.swing.JTextField();
    final private javax.swing.JButton btnCalculate = new javax.swing.JButton();
    final private javax.swing.JTextField jtOctet2 = new javax.swing.JTextField();
    final private javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryNetmask = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryIpAddress = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel26 = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalIpAddress = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalNetmask = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalWildcard = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryWildcard = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalNetwork = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryNetwork = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalBroadcast = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalFirstHostIp = new javax.swing.JLabel();
    final private javax.swing.JLabel jlDecimalLastHostIp = new javax.swing.JLabel();
    final private javax.swing.JLabel jlTotalHost = new javax.swing.JLabel();
    final private javax.swing.JLabel jlTotalIp = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryBroadcast = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryFirstHostIp = new javax.swing.JLabel();
    final private javax.swing.JLabel jlBinaryLastHostIp = new javax.swing.JLabel();
    final private javax.swing.JButton btnExit = new javax.swing.JButton();
    final private javax.swing.JLabel jLabel27 = new javax.swing.JLabel();
    final private javax.swing.JLabel jLabel28 = new javax.swing.JLabel();
    final private javax.swing.JLabel jlIpClass = new javax.swing.JLabel();

    public Main() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 53, 65));
        setMinimumSize(new java.awt.Dimension(690, 520));
        setPreferredSize(new java.awt.Dimension(690, 520));
        setResizable(false);

        Background.setBackground(new java.awt.Color(52, 53, 65));
        Background.setForeground(new java.awt.Color(52, 53, 65));
        Background.setPreferredSize(new java.awt.Dimension(690, 520));

        Calculate.setBackground(new java.awt.Color(242, 255, 255, 80));

        jLabel2.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(".");
        jLabel2.setIconTextGap(2);
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 0));

        jtOctet1.setBackground(new java.awt.Color(102, 102, 102));
        jtOctet1.setFont(new java.awt.Font("Montserrat", Font.PLAIN, 14)); // NOI18N
        jtOctet1.setForeground(new java.awt.Color(255, 255, 255));
        jtOctet1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtOctet1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtOctet1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtOctet1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtOctet1.setMinimumSize(new java.awt.Dimension(5, 26));
        jtOctet1.setPreferredSize(new java.awt.Dimension(27, 26));
        jtOctet1.setSelectionColor(new java.awt.Color(102, 102, 255));
        jtOctet1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtOctet1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address :");

        jLabel4.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(".");
        jLabel4.setIconTextGap(2);
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));

        jtOctet4.setBackground(new java.awt.Color(102, 102, 102));
        jtOctet4.setFont(new java.awt.Font("Montserrat", Font.PLAIN, 14)); // NOI18N
        jtOctet4.setForeground(new java.awt.Color(255, 255, 255));
        jtOctet4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtOctet4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtOctet4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtOctet4.setMinimumSize(new java.awt.Dimension(5, 26));
        jtOctet4.setPreferredSize(new java.awt.Dimension(27, 26));
        jtOctet4.setSelectionColor(new java.awt.Color(102, 102, 255));
        jtOctet4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtOctet4KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(".");
        jLabel5.setIconTextGap(2);
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));

        jtOctet3.setBackground(new java.awt.Color(102, 102, 102));
        jtOctet3.setFont(new java.awt.Font("Montserrat", Font.PLAIN, 14)); // NOI18N
        jtOctet3.setForeground(new java.awt.Color(255, 255, 255));
        jtOctet3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtOctet3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtOctet3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtOctet3.setMinimumSize(new java.awt.Dimension(5, 26));
        jtOctet3.setPreferredSize(new java.awt.Dimension(27, 26));
        jtOctet3.setSelectionColor(new java.awt.Color(102, 102, 255));
        jtOctet3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtOctet3KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("/");
        jLabel6.setIconTextGap(2);
        jLabel6.setMinimumSize(new java.awt.Dimension(0, 0));

        jtPrefix.setBackground(new java.awt.Color(102, 102, 102));
        jtPrefix.setFont(new java.awt.Font("Montserrat", Font.PLAIN, 14)); // NOI18N
        jtPrefix.setForeground(new java.awt.Color(255, 255, 255));
        jtPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPrefix.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtPrefix.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtPrefix.setMinimumSize(new java.awt.Dimension(5, 26));
        jtPrefix.setPreferredSize(new java.awt.Dimension(27, 26));
        jtPrefix.setSelectionColor(new java.awt.Color(102, 102, 255));
        jtPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrefixKeyTyped(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(137, 130, 243));
        btnCalculate.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(this::btnCalculateActionPerformed);

        jtOctet2.setBackground(new java.awt.Color(102, 102, 102));
        jtOctet2.setFont(new java.awt.Font("Montserrat", Font.PLAIN, 14)); // NOI18N
        jtOctet2.setForeground(new java.awt.Color(255, 255, 255));
        jtOctet2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtOctet2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtOctet2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jtOctet2.setMinimumSize(new java.awt.Dimension(5, 26));
        jtOctet2.setPreferredSize(new java.awt.Dimension(27, 26));
        jtOctet2.setSelectionColor(new java.awt.Color(102, 102, 255));
        jtOctet2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtOctet2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout CalculateLayout = new javax.swing.GroupLayout(Calculate);
        Calculate.setLayout(CalculateLayout);
        CalculateLayout.setHorizontalGroup(
                CalculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CalculateLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtOctet1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtOctet2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtOctet3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtOctet4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addContainerGap())
        );
        CalculateLayout.setVerticalGroup(
                CalculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculateLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(CalculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtOctet1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtOctet4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtOctet3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                        .addComponent(jtOctet2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("MV Boli", Font.BOLD, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("IPv4 Subnet Calculator ");

        jLabel7.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("IP Address");

        jlBinaryNetmask.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryNetmask.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryNetmask.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryNetmask.setText("   ");
        jlBinaryNetmask.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryNetmask.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryNetmask.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryNetmask.setPreferredSize(new java.awt.Dimension(270, 17));

        jlBinaryIpAddress.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryIpAddress.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryIpAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryIpAddress.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryIpAddress.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryIpAddress.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryIpAddress.setPreferredSize(new java.awt.Dimension(270, 17));

        jLabel10.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("Netmask");

        jLabel11.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("Wildcard");

        jLabel12.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 255));
        jLabel12.setText("Network");

        jLabel13.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 255));
        jLabel13.setText("Broadcast");

        jLabel14.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 255));
        jLabel14.setText("First Host IP");

        jLabel15.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 255));
        jLabel15.setText("Last Host IP");

        jLabel16.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 255));
        jLabel16.setText("Total Host");

        jLabel17.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 255));
        jLabel17.setText("Total IP");

        jLabel18.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 255));
        jLabel18.setText(":");

        jLabel19.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 255));
        jLabel19.setText(":");

        jLabel20.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 255));
        jLabel20.setText(":");

        jLabel21.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 255));
        jLabel21.setText(":");

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 255));
        jLabel22.setText(":");

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 255));
        jLabel23.setText(":");

        jLabel24.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 255));
        jLabel24.setText(":");

        jLabel25.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 255));
        jLabel25.setText(":");

        jLabel26.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 255));
        jLabel26.setText(":");

        jlDecimalIpAddress.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalIpAddress.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalIpAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalIpAddress.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalIpAddress.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalIpAddress.setPreferredSize(new java.awt.Dimension(115, 17));

        jlDecimalNetmask.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalNetmask.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalNetmask.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalNetmask.setText("   ");
        jlDecimalNetmask.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalNetmask.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalNetmask.setPreferredSize(new java.awt.Dimension(115, 17));

        jlDecimalWildcard.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalWildcard.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalWildcard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalWildcard.setText("   ");
        jlDecimalWildcard.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalWildcard.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalWildcard.setPreferredSize(new java.awt.Dimension(115, 17));

        jlBinaryWildcard.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryWildcard.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryWildcard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryWildcard.setText("     ");
        jlBinaryWildcard.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryWildcard.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryWildcard.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryWildcard.setPreferredSize(new java.awt.Dimension(270, 17));

        jlDecimalNetwork.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalNetwork.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalNetwork.setText("   ");
        jlDecimalNetwork.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalNetwork.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalNetwork.setPreferredSize(new java.awt.Dimension(115, 17));

        jlBinaryNetwork.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryNetwork.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryNetwork.setText("     ");
        jlBinaryNetwork.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryNetwork.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryNetwork.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryNetwork.setPreferredSize(new java.awt.Dimension(270, 17));

        jlDecimalBroadcast.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalBroadcast.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalBroadcast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalBroadcast.setText("   ");
        jlDecimalBroadcast.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalBroadcast.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalBroadcast.setPreferredSize(new java.awt.Dimension(115, 17));

        jlDecimalFirstHostIp.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalFirstHostIp.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalFirstHostIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalFirstHostIp.setText("   ");
        jlDecimalFirstHostIp.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalFirstHostIp.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalFirstHostIp.setPreferredSize(new java.awt.Dimension(115, 17));

        jlDecimalLastHostIp.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlDecimalLastHostIp.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimalLastHostIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDecimalLastHostIp.setText("   ");
        jlDecimalLastHostIp.setMaximumSize(new java.awt.Dimension(115, 17));
        jlDecimalLastHostIp.setMinimumSize(new java.awt.Dimension(115, 17));
        jlDecimalLastHostIp.setPreferredSize(new java.awt.Dimension(115, 17));

        jlTotalHost.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlTotalHost.setForeground(new java.awt.Color(255, 255, 255));
        jlTotalHost.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlTotalHost.setText("   ");
        jlTotalHost.setMaximumSize(new java.awt.Dimension(115, 17));
        jlTotalHost.setMinimumSize(new java.awt.Dimension(115, 17));
        jlTotalHost.setPreferredSize(new java.awt.Dimension(115, 17));

        jlTotalIp.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlTotalIp.setForeground(new java.awt.Color(255, 255, 255));
        jlTotalIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlTotalIp.setText("   ");
        jlTotalIp.setMaximumSize(new java.awt.Dimension(115, 17));
        jlTotalIp.setMinimumSize(new java.awt.Dimension(115, 17));
        jlTotalIp.setPreferredSize(new java.awt.Dimension(115, 17));

        jlBinaryBroadcast.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryBroadcast.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryBroadcast.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryBroadcast.setText("    ");
        jlBinaryBroadcast.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryBroadcast.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryBroadcast.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryBroadcast.setPreferredSize(new java.awt.Dimension(270, 17));

        jlBinaryFirstHostIp.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryFirstHostIp.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryFirstHostIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryFirstHostIp.setText("   ");
        jlBinaryFirstHostIp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryFirstHostIp.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryFirstHostIp.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryFirstHostIp.setPreferredSize(new java.awt.Dimension(270, 17));

        jlBinaryLastHostIp.setFont(new java.awt.Font("Lato Black", Font.ITALIC, 14)); // NOI18N
        jlBinaryLastHostIp.setForeground(new java.awt.Color(255, 255, 255));
        jlBinaryLastHostIp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlBinaryLastHostIp.setText("   ");
        jlBinaryLastHostIp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlBinaryLastHostIp.setMaximumSize(new java.awt.Dimension(270, 17));
        jlBinaryLastHostIp.setMinimumSize(new java.awt.Dimension(270, 17));
        jlBinaryLastHostIp.setPreferredSize(new java.awt.Dimension(270, 17));

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(this::btnExitActionPerformed);

        jLabel27.setFont(new java.awt.Font("Montserrat", Font.BOLD, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 255));
        jLabel27.setText("IP Class");

        jLabel28.setFont(new java.awt.Font("MS Reference Sans Serif", Font.BOLD, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 255));
        jLabel28.setText(":");

        jlIpClass.setFont(new java.awt.Font("Lato Black", Font.PLAIN, 14)); // NOI18N
        jlIpClass.setForeground(new java.awt.Color(255, 255, 255));
        jlIpClass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlIpClass.setMaximumSize(new java.awt.Dimension(200, 17));
        jlIpClass.setMinimumSize(new java.awt.Dimension(200, 17));
        jlIpClass.setPreferredSize(new java.awt.Dimension(200, 17));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel15)
                                                                        .addComponent(jLabel16)
                                                                        .addComponent(jLabel17)
                                                                        .addComponent(jLabel27))
                                                                .addGap(93, 93, 93)
                                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel25)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jlTotalHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                .addComponent(jLabel26)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jlTotalIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel24)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalLastHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel23)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalFirstHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel22)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel21)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel20)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalWildcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel19)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalNetmask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel18)
                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jlDecimalIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(34, 34, 34)
                                                                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jlBinaryWildcard, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jlBinaryNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jlBinaryBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jlBinaryFirstHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jlBinaryLastHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jlBinaryNetmask, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(jlBinaryIpAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                                                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                                                .addComponent(jLabel28)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jlIpClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGap(194, 194, 194)
                                                .addComponent(jLabel1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
        );
        BackgroundLayout.setVerticalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel18)
                                                        .addComponent(jlDecimalIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlBinaryIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel19)
                                        .addComponent(jlDecimalNetmask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlBinaryNetmask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel20)
                                        .addComponent(jlDecimalWildcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlBinaryWildcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel21)
                                        .addComponent(jlDecimalNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlBinaryNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel22)
                                        .addComponent(jlDecimalBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlBinaryBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel23)
                                        .addComponent(jlDecimalFirstHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlBinaryFirstHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel24)
                                        .addComponent(jlDecimalLastHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlBinaryLastHostIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel27))
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel25)
                                                        .addComponent(jlTotalHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel26)
                                                        .addComponent(jlTotalIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel28)
                                                        .addComponent(jlIpClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(btnExit)
                                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void jtOctet1KeyTyped(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) || jtOctet1.getText().length() >= 3){
            evt.consume();
        }
    }

    private void jtOctet2KeyTyped(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) || jtOctet2.getText().length() >= 3){
            evt.consume();
        }
    }

    private void jtOctet3KeyTyped(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) || jtOctet3.getText().length() >= 3){
            evt.consume();
        }
    }

    private void jtOctet4KeyTyped(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) || jtOctet4.getText().length() >= 3){
            evt.consume();
        }
    }

    private void jtPrefixKeyTyped(java.awt.event.KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) || jtPrefix.getText().length() >= 2){
            evt.consume();
        }
    }

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
        String prefix = jtPrefix.getText();
        String[] ipAddress = {
                jtOctet1.getText(),
                jtOctet2.getText(),
                jtOctet3.getText(),
                jtOctet4.getText()
        };

        IpTools subCal = new Ipv4SubnetCalculator(ipAddress, prefix);

        if (!subCal.isValidPrefix() && !subCal.isValidIp()){
            JOptionPane.showMessageDialog(null, "Invalid IP Address and Prefix/CIDR");
        }else if (!subCal.isValidIp()){
            JOptionPane.showMessageDialog(null, "Invalid IP Address");
        }else if (!subCal.isValidPrefix()){
            JOptionPane.showMessageDialog(null, "Invalid Prefix/CIDR");
        }else {
            String decimalIpAddress = subCal.getDecimalIpAddress(),
                    binaryIpAddress = subCal.getBinaryIpAddress(),
                    decimalNetmask = subCal.getDecimalNetmask(),
                    binaryNetmask = subCal.getBinaryNetmask(),
                    decimalWildcard = subCal.getDecimalWildcard(),
                    binaryWildcard = subCal.getBinaryWildcard(),
                    decimalNetworkAddress = subCal.getDecimalNetworkAddress(),
                    binaryNetworkAddress  = subCal.getBinaryNetworkAddress(),
                    decimalBroadcastAddress = subCal.getDecimalBroadcastAddress(),
                    binaryBroadcastAddress = subCal.getBinaryBroadcastAddress(),
                    decimalFirstHostIp = subCal.getDecimalFirstHostAddress(),
                    binaryFirsHostIp = subCal.getBinaryFirstHostAddress(),
                    decimalLastHostIp = subCal.getDecimalLastHostAddress(),
                    binaryLastHostIp = subCal.getBinaryLastHostAddress(),
                    ipClass = subCal.getipClass(),
                    totalHost = String.valueOf(subCal.getTotalHost()),
                    totalIp = String.valueOf(subCal.getTotalIp());

            jlDecimalIpAddress.setText(decimalIpAddress);
            jlBinaryIpAddress.setText(binaryIpAddress);
            jlDecimalNetmask.setText(decimalNetmask);
            jlBinaryNetmask.setText(binaryNetmask);
            jlDecimalWildcard.setText(decimalWildcard);
            jlBinaryWildcard.setText(binaryWildcard);
            jlDecimalNetwork.setText(decimalNetworkAddress);
            jlBinaryNetwork.setText(binaryNetworkAddress);
            jlDecimalBroadcast.setText(decimalBroadcastAddress);
            jlBinaryBroadcast.setText(binaryBroadcastAddress);
            jlDecimalFirstHostIp.setText(decimalFirstHostIp);
            jlBinaryFirstHostIp.setText(binaryFirsHostIp);
            jlDecimalLastHostIp.setText(decimalLastHostIp);
            jlBinaryLastHostIp.setText(binaryLastHostIp);
            jlTotalHost.setText(totalHost);
            jlTotalIp.setText(totalIp);
            jlIpClass.setText(ipClass);

        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

}
