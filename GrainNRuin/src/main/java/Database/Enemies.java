<<<<<<< HEAD
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
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Manager.Database_Manager;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Engilo Grave
 */
public class Enemies implements Stats {
    private String Name;
    private float Health=0, Mana=0, Shield=0;
    private int Strength=0, Intelligence=0, Agility=0;
    private Image img;
    private ArrayList<Image> anim = new ArrayList<>();

    private Database_Manager dbManager = new Database_Manager();
    
    //Constructor
    public Enemies(){
        
    }
    public Enemies(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        this.Name=Name;;
        this.Health=Health;
        this.Mana=Mana;
        this.Shield=Shield;
        this.Strength=Strength;
        this.Intelligence=Intelligence;
        this.Agility=Agility;
    }
    
    
    public String getName(){
        return this.name;
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
    public void setName(String Name) {
        this.name = Name;
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

    public void attack(Avatar avatar){
        Random rand = new Random();
        float inflictedDamage;
        float currentHealth = avatar.getHealth();

        //Adjust damage based on the type of enemy
        if(this instanceof SmallMonster){
            inflictedDamage = rand.nextFloat(11, 21); // 10 - 20 damage if Small Monster
        } else if(this instanceof MediumMonster){
            inflictedDamage = rand.nextFloat(41, 51); // 40 - 50 damage if Medium Monster
        } else if(this instanceof BigMonster){
            inflictedDamage = rand.nextFloat(61, 71); // 60 - 70 damage if Big Monster
        }

        avatar.setHealth(currentHealth - inflictedDamage);
        System.out.println(getName() +" attack for " + inflictedDamage + " damage!");
    }    

    public void takeDamage(int damage, Avatar avatar, Enemies enemy){
        float health = enemy.getHealth();
        health-=damage;
        
        if(health <= 0){
            System.out.println(getName() + " has been defeated!");
        }else{
            System.out.println(getName() + " has taken " + damage + " damage!");
        }
        enemy.setHealth(health);
    }

    public void specialMove(){
        Random rand = new Random();
        int move = rand.nextInt(3);
        switch(move){
            case 0:
                if(this instanceof SmallMonster && rand.nextFloat() < 0.3){ // 30% chance to perform a debuffMove
                    debuffMove();
                } else if(this instanceof MediumMonster && rand.nextFloat() < 0.3){ // 30% chance to perform a magicMove
                    magicMove();
                } else if(this instanceof BigMonster && rand.nextFloat() < 0.3){ // 30% chance to perform a buffMove
                    buffMove();
                }
                break;
            case 1:
                attack();
                break;
            case 2:
                attack();
                break;
            default:
                break;
        }
    }

    private void debuffMove(Avatar avatar){
        float currentShield = avatar.getShield();
        float currentStrength = avatar.getStrength();
        float currentAgility = avatar.getAgility();
        
        avatar.setShield(currentShield - 2);
        avatar.setShield(currentStrength - 2);
        avatar.setAgility(currentAgility - 2);
        System.out.println(getName() + " has debuffed your stats!");
    }

    private void magicMove(Avatar avatar){
        Random rand = new Random();
        int move = rand.nextInt(3);
        float currentHealth = avatar.getHealth();
        switch(move){
            case 0:
                System.out.println(getName() + " has used Firebolt!");
                avatar.setHealth(currentHealth - 45);
                break;
            case 1:
                System.out.println(getName() + " has used Lightning bolt!");
                avatar.setHealth(currentHealth - 40);
                break;
            case 2: 
                System.out.println(getName() + " has used Iceblast!");
                avatar.setHealth(currentHealth - 40);
                break;
        }
    }

    private void buffMove(){
        float currentAgility = getAgility();
        float currentStrength = getStrength();
        float currentShield = getShield();

        setAgility(currentAgility + 5);
        setStrength(currentStrength + 5);
        setShield(currentShield + 5);

        System.out.println(getName() + " has boosted their stats!");
    }
}

class SmallMonster extends Enemies{
    public SmallMonster(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        super(Name, Health, Mana, Shield, Strength, Intelligence, Agility);
    }
}

class MediumMonster extends Enemies{
    public MediumMonster(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        super(Name, Health, Mana, Shield, Strength, Intelligence, Agility);
    }
}

class BigMonster extends Enemies{
    public BigMonster(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        super(Name, Health, Mana, Shield, Strength, Intelligence, Agility);
    }
}
>>>>>>> origin/Laviste
