/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import UserInterface.Map1;
import javax.swing.JFrame;

/**
 *
 * @author Engilo Grave
 */
public class Map_Controller extends Map1{
    
    public static void main(String[] args) {
            JFrame frame = new JFrame("Map Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(640, 369);

            Map1 mapPanel = new Map1();        
            frame.add(mapPanel);

            frame.setVisible(true);
    }
    
}
