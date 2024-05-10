/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Engilo Grave
 */
public class Avatar implements Stats{
    
    private float Health=0, Mana=0, Shield=0;
    private int Strength=0, Intelligence=0, Agility=0;
    
    private JLabel JCharacter;
    
    private ImageIcon[] img;
    private Timer animationTimer;
    private int currImageIndex;
    
    public Avatar(){
        
    }
    public Avatar(float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        this.Health = Health;
        this.Mana = Mana;
        this.Shield = Shield; 
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Agility = Agility;
    }
    
    private void OnIdleAnimation(){
        animationTimer = new Timer(200, (e)->{
            JCharacter.setIcon(img[currImageIndex]);
            currImageIndex = (currImageIndex + 1) % img.length;
        });
    }
    private void OnAttackAnimation(){
        animationTimer = new Timer(200, (e)->{
            JCharacter.setIcon(img[currImageIndex]);
            currImageIndex = (currImageIndex + 1) % img.length;
        });
    }
    private void OnDamageAnimation(){
        animationTimer = new Timer(200, (e)->{
            JCharacter.setIcon(img[currImageIndex]);
            currImageIndex = (currImageIndex + 1) % img.length;
        });
    }
    
    public void Animation(int onInstance){
        switch(onInstance){
            case 1 -> OnIdleAnimation();
            case 2 -> OnAttackAnimation();
            case 3 -> OnDamageAnimation();
            default -> System.out.print("No Animation Instance that is > than 3");
        }
    }
    
    
    public void setJCharacter(JLabel JCharacter){
        this.JCharacter = JCharacter;
    }
    
    @Override
    public float getHealth() {
        return this.Health;
    }
    @Override
    public float getMana() {
        return this.Mana;
    }
    @Override
    public float getShield() {
        return this.Shield;
    }
    @Override
    public int getStrength() {
        return this.Strength;
    }
    @Override
    public int getIntelligence() {
        return this.Intelligence;
    }
    @Override
    public int getAgility() {
        return this.Agility;
    }
    @Override
    public void setHealth(float Health) {
        this.Health = Health;
    }
    @Override
    public void setMana(float Mana) {
        this.Mana = Mana;
    }
    @Override
    public void setShield(float Shield) {
        this.Shield = Shield;
    }
    @Override
    public void setStrength(int Strength) {
        this.Strength = Strength;
    }
    @Override
    public void setIntelligence(int Intelligence) {
        this.Intelligence = Intelligence;
    }
    @Override
    public void setAgility(int Agility) {
        this.Agility = Agility;
    }
    
}
