/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Manager.Database_Manager;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Engilo Grave
 */
public class Enemies implements Stats {
    private String name;
    private float Health=0, Mana=0, Shield=0;
    private int Strength=0, Intelligence=0, Agility=0;
    
    private ImageIcon[] img;
    private ArrayList<Image> anim = new ArrayList<>();

    private Database_Manager dbManager = new Database_Manager();
    
    //Constructor
    public Enemies(){
        
    }
    public Enemies(String name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        this.name = name;
        
        this.Health=Health;
        this.Mana=Mana;
        this.Shield=Shield;
        this.Strength=Strength;
        this.Intelligence=Intelligence;
        this.Agility=Agility;
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
