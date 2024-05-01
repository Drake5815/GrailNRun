/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Engilo Grave
 */
public class GameFrame extends JFrame {
    private JFrame jframe;
    
    public GameFrame(){
        testCommit();
    }
    
    private void Commit(JPanel gamePanel){
        jframe = new JFrame();
        gamePanel.setPreferredSize(new Dimension(640,360));
        
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().add(gamePanel);
        jframe.pack();
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
    private void testCommit(){
        jframe = new JFrame();
        
        
        jframe.setPreferredSize(new Dimension(1280, 720));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
    
    public static void main(String[] args){
        GameFrame gameFrame = new GameFrame();
    }
}
