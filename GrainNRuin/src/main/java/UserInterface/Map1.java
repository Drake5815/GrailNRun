/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
/**
 *
 * @author acer
 */
public class Map1 extends javax.swing.JPanel {

        private Image backgroundImage;
        private GameFrame parentFrame;
    public Map1() {
        this.setSize(new Dimension(640,360));
        initComponents();
        initBG();
    } 
    
    
    public void initBG(){
        try {
            URL imageURL = getClass().getResource("/images/background.png");
            if (imageURL != null) {
                System.out.println("Image loaded successfully: " + imageURL.toString());
                backgroundImage = new ImageIcon(imageURL).getImage();
            } else {
                System.err.println("Image not found in resources.");
            }
        } catch (Exception e) {
            System.err.println("Error loading background image: " + e.getMessage());
        }
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            } else {
                g.setColor(Color.RED);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param args
     */
        public void setOccIcon(JButton btn){
            btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OccurenceEvent.png")));
        }
    
        public void setBattleIcon(JButton btn){
            btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enemy.gif")));
        }
        
        public void setRestIcon(JButton btn){
            btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rest.gif")));
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startPoint1 = new javax.swing.JButton();
        restM1 = new javax.swing.JButton();
        Rare_Occ2 = new javax.swing.JButton();
        fightp1 = new javax.swing.JButton();
        fightp2 = new javax.swing.JButton();
        FIght_MidBoss = new javax.swing.JButton();
        Rare_Occ1 = new javax.swing.JButton();
        fightp4 = new javax.swing.JButton();
        fightp3 = new javax.swing.JButton();
        restp1 = new javax.swing.JButton();
        fightp5 = new javax.swing.JButton();
        fightp6 = new javax.swing.JButton();
        fightp8 = new javax.swing.JButton();
        fightp7 = new javax.swing.JButton();
        restp2 = new javax.swing.JButton();
        Rare_Occ3 = new javax.swing.JButton();
        Finale = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fightp9 = new javax.swing.JButton();

        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMaximumSize(new java.awt.Dimension(640, 365));
        setMinimumSize(new java.awt.Dimension(640, 365));

        startPoint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Attack.png"))); // NOI18N
        startPoint1.setBorder(null);
        startPoint1.setBorderPainted(false);
        startPoint1.setContentAreaFilled(false);

        restM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        restM1.setBorder(null);
        restM1.setBorderPainted(false);
        restM1.setContentAreaFilled(false);
        restM1.setMaximumSize(new java.awt.Dimension(34, 10));
        restM1.setMinimumSize(new java.awt.Dimension(34, 10));
        restM1.setPreferredSize(new java.awt.Dimension(34, 10));
        restM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restM1ActionPerformed(evt);
            }
        });

        Rare_Occ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        Rare_Occ2.setBorder(null);
        Rare_Occ2.setBorderPainted(false);
        Rare_Occ2.setContentAreaFilled(false);
        Rare_Occ2.setMaximumSize(new java.awt.Dimension(34, 10));
        Rare_Occ2.setMinimumSize(new java.awt.Dimension(34, 10));
        Rare_Occ2.setPreferredSize(new java.awt.Dimension(34, 10));
        Rare_Occ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rare_Occ2ActionPerformed(evt);
            }
        });

        fightp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp1.setBorder(null);
        fightp1.setBorderPainted(false);
        fightp1.setContentAreaFilled(false);
        fightp1.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp1.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp1.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp1ActionPerformed(evt);
            }
        });

        fightp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp2.setBorder(null);
        fightp2.setBorderPainted(false);
        fightp2.setContentAreaFilled(false);
        fightp2.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp2.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp2.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp2ActionPerformed(evt);
            }
        });

        FIght_MidBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        FIght_MidBoss.setBorder(null);
        FIght_MidBoss.setBorderPainted(false);
        FIght_MidBoss.setContentAreaFilled(false);
        FIght_MidBoss.setMaximumSize(new java.awt.Dimension(34, 10));
        FIght_MidBoss.setMinimumSize(new java.awt.Dimension(34, 10));
        FIght_MidBoss.setPreferredSize(new java.awt.Dimension(34, 10));
        FIght_MidBoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIght_MidBossActionPerformed(evt);
            }
        });

        Rare_Occ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        Rare_Occ1.setBorder(null);
        Rare_Occ1.setBorderPainted(false);
        Rare_Occ1.setContentAreaFilled(false);
        Rare_Occ1.setMaximumSize(new java.awt.Dimension(34, 10));
        Rare_Occ1.setMinimumSize(new java.awt.Dimension(34, 10));
        Rare_Occ1.setPreferredSize(new java.awt.Dimension(34, 10));
        Rare_Occ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rare_Occ1ActionPerformed(evt);
            }
        });

        fightp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp4.setBorder(null);
        fightp4.setContentAreaFilled(false);
        fightp4.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp4.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp4.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp4ActionPerformed(evt);
            }
        });

        fightp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp3.setBorder(null);
        fightp3.setBorderPainted(false);
        fightp3.setContentAreaFilled(false);
        fightp3.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp3.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp3.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp3ActionPerformed(evt);
            }
        });

        restp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        restp1.setBorder(null);
        restp1.setBorderPainted(false);
        restp1.setContentAreaFilled(false);
        restp1.setMaximumSize(new java.awt.Dimension(34, 10));
        restp1.setMinimumSize(new java.awt.Dimension(34, 10));
        restp1.setPreferredSize(new java.awt.Dimension(34, 10));
        restp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restp1ActionPerformed(evt);
            }
        });

        fightp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp5.setBorder(null);
        fightp5.setBorderPainted(false);
        fightp5.setContentAreaFilled(false);
        fightp5.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp5.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp5.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp5ActionPerformed(evt);
            }
        });

        fightp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp6.setBorder(null);
        fightp6.setBorderPainted(false);
        fightp6.setContentAreaFilled(false);
        fightp6.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp6.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp6.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp6ActionPerformed(evt);
            }
        });

        fightp8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp8.setBorder(null);
        fightp8.setBorderPainted(false);
        fightp8.setContentAreaFilled(false);
        fightp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp8ActionPerformed(evt);
            }
        });

        fightp7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp7.setBorder(null);
        fightp7.setBorderPainted(false);
        fightp7.setContentAreaFilled(false);
        fightp7.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp7.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp7.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp7ActionPerformed(evt);
            }
        });

        restp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        restp2.setBorder(null);
        restp2.setBorderPainted(false);
        restp2.setContentAreaFilled(false);
        restp2.setMaximumSize(new java.awt.Dimension(34, 10));
        restp2.setMinimumSize(new java.awt.Dimension(34, 10));
        restp2.setPreferredSize(new java.awt.Dimension(34, 10));
        restp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restp2ActionPerformed(evt);
            }
        });

        Rare_Occ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        Rare_Occ3.setBorder(null);
        Rare_Occ3.setBorderPainted(false);
        Rare_Occ3.setContentAreaFilled(false);
        Rare_Occ3.setMaximumSize(new java.awt.Dimension(34, 10));
        Rare_Occ3.setMinimumSize(new java.awt.Dimension(34, 10));
        Rare_Occ3.setPreferredSize(new java.awt.Dimension(34, 10));
        Rare_Occ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rare_Occ3ActionPerformed(evt);
            }
        });

        Finale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boss.gif"))); // NOI18N
        Finale.setBorder(null);
        Finale.setBorderPainted(false);
        Finale.setContentAreaFilled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/legend.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        fightp9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UnknownP.png"))); // NOI18N
        fightp9.setBorder(null);
        fightp9.setBorderPainted(false);
        fightp9.setContentAreaFilled(false);
        fightp9.setMaximumSize(new java.awt.Dimension(34, 10));
        fightp9.setMinimumSize(new java.awt.Dimension(34, 10));
        fightp9.setPreferredSize(new java.awt.Dimension(34, 10));
        fightp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightp9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startPoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(fightp1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Rare_Occ2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FIght_MidBoss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(fightp2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Rare_Occ1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(fightp8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fightp4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(restp2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addComponent(Finale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restM1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(fightp3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fightp5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addComponent(restp1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fightp6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(fightp9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Rare_Occ3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(fightp7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Finale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(fightp8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(fightp9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(fightp7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(restp2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(fightp6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(Rare_Occ3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FIght_MidBoss, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(fightp5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGap(63, 63, 63))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startPoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(restM1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fightp1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fightp2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fightp4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rare_Occ2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addComponent(restp1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(fightp3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Rare_Occ1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        startPoint1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void fightp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp1ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp1);
        
    }//GEN-LAST:event_fightp1ActionPerformed

    private void Rare_Occ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rare_Occ3ActionPerformed
        // TODO add your handling code here:
        setOccIcon(Rare_Occ3);
    }//GEN-LAST:event_Rare_Occ3ActionPerformed

    private void restM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restM1ActionPerformed
        // TODO add your handling code here:
        setRestIcon(restM1);
        parentFrame = (GameFrame) SwingUtilities.getWindowAncestor(this);
        parentFrame.changePanel(new RestingScene());
    }//GEN-LAST:event_restM1ActionPerformed

    private void fightp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp2ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp2);
        
    }//GEN-LAST:event_fightp2ActionPerformed

    private void Rare_Occ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rare_Occ2ActionPerformed
        // TODO add your handling code here:
        setOccIcon(Rare_Occ2);
        
    }//GEN-LAST:event_Rare_Occ2ActionPerformed

    private void Rare_Occ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rare_Occ1ActionPerformed
        // TODO add your handling code here:
        setOccIcon(Rare_Occ1);
        //Call method for Rare Occasion room
    }//GEN-LAST:event_Rare_Occ1ActionPerformed

    private void fightp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp3ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp3);
    }//GEN-LAST:event_fightp3ActionPerformed

    private void fightp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp8ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp8);
    }//GEN-LAST:event_fightp8ActionPerformed

    private void fightp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp5ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp5);
    }//GEN-LAST:event_fightp5ActionPerformed

    private void FIght_MidBossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIght_MidBossActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FIght_MidBossActionPerformed

    private void fightp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp4ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp4);
    }//GEN-LAST:event_fightp4ActionPerformed

    private void restp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restp1ActionPerformed
        // TODO add your handling code here:
        setRestIcon(restp1);
        parentFrame = (GameFrame) SwingUtilities.getWindowAncestor(this);
        parentFrame.changePanel(new RestingScene());
    }//GEN-LAST:event_restp1ActionPerformed

    private void fightp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp6ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp6);
    }//GEN-LAST:event_fightp6ActionPerformed

    private void fightp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp7ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp7);
    }//GEN-LAST:event_fightp7ActionPerformed

    private void fightp9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightp9ActionPerformed
        // TODO add your handling code here:
        setBattleIcon(fightp9);
    }//GEN-LAST:event_fightp9ActionPerformed

    private void restp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restp2ActionPerformed
        // TODO add your handling code here:
        setRestIcon(restp2);
        parentFrame = (GameFrame) SwingUtilities.getWindowAncestor(this);
        parentFrame.changePanel(new RestingScene());
    }//GEN-LAST:event_restp2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FIght_MidBoss;
    private javax.swing.JButton Finale;
    private javax.swing.JButton Rare_Occ1;
    private javax.swing.JButton Rare_Occ2;
    private javax.swing.JButton Rare_Occ3;
    private javax.swing.JButton fightp1;
    private javax.swing.JButton fightp2;
    private javax.swing.JButton fightp3;
    private javax.swing.JButton fightp4;
    private javax.swing.JButton fightp5;
    private javax.swing.JButton fightp6;
    private javax.swing.JButton fightp7;
    private javax.swing.JButton fightp8;
    private javax.swing.JButton fightp9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton restM1;
    private javax.swing.JButton restp1;
    private javax.swing.JButton restp2;
    private javax.swing.JButton startPoint1;
    // End of variables declaration//GEN-END:variables


}
