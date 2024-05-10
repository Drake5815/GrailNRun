/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Engilo Grave
 */
public class LoadingPanel extends JPanel {
    private ImageIcon[] iconArr = new ImageIcon[4];
    private Timer animationTimer,timer;
    private int currImageIndex=0;
    /**
     * Creates new form LoadingPanel
     */
    public LoadingPanel() {
        this.setSize( new Dimension(640,360));
        startAnimation();
        
    }
    
    private void startAnimation(){
        iconArr[0] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading01.png");
        iconArr[1] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading02.png");
        iconArr[2] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading03.png");
        iconArr[3] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading04.png");
        
        initComponents();
        jAnimation.setHorizontalAlignment(JLabel.CENTER);
        
        animationTimer = new Timer(200, (e)->{
           jAnimation.setIcon(iconArr[currImageIndex]);
           currImageIndex = (currImageIndex + 1) % iconArr.length;
        });
        animationTimer.start();
        endAnimation();
    }
    private void endAnimation(){
        timer = new Timer(2000, (e)->{
            GameFrame game = (GameFrame) SwingUtilities.getWindowAncestor(this);
            animationTimer.stop();
            game.setPanel(0);
        });
        timer.setRepeats(false);
        timer.start();
    }
    /**
     *  
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAnimation = new javax.swing.JLabel();
        jBackground = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAnimation.setAlignmentY(0.0F);
        add(jAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 97, 95, 125));

        jBackground.setIcon(new javax.swing.ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading05.png")); // NOI18N
        add(jBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 320));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnimation;
    private javax.swing.JLabel jBackground;
    // End of variables declaration//GEN-END:variables
}
