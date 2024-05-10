/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Manager.Level_Manager;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Engilo Grave
 */
public class RestingScene extends javax.swing.JPanel {
    private ImageIcon[] iconArr = new ImageIcon[4];
    private Timer animationTimer,timer;
    private Level_Manager lvlManager;
    private int currImageIndex=0;
    /**
     * Creates new form RestingScene
     */
    public RestingScene() {
        this.setSize(new Dimension(1280,720));
        startAnimation();
    }
    public RestingScene(Level_Manager lvlManager){
        this.setSize(new Dimension(1280,720));
        this.lvlManager = lvlManager;
        startAnimation();
    }
    
    private void startAnimation(){
        
            
            iconArr[0] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading01.png");
            iconArr[1] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading02.png");
            iconArr[2] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading03.png");
            iconArr[3] = new ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Loading04.png");

            initComponents();
            jAnimation.setHorizontalAlignment(JLabel.CENTER);
            
            if(this.lvlManager != null){
                lvlManager.RestScene();
            }
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
            game.changePanel(game.getMap());
        });
        timer.setRepeats(false);
        timer.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAnimation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 240, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\Resting.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnimation;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
