/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Manager.Database_Manager;
import java.util.HashMap;
import javax.swing.ImageIcon;
import org.bson.Document;

/**
 *
 * @author Engilo Grave
 */

public class Cards {
    private Database_Manager dbManager = new Database_Manager("Cards");
    
    private ImageIcon img;
    
    private String name;
    private double Health=0, Damage=0, ManaConsumption=0, Shield=0;
    private int Strength=0, Intelligence=0, Agility=0;
    
    public Cards(){}
    public Cards(String name, Double Damage, Double ManaConsumption){
        this.name=name;
        this.Damage=Damage;
        this.ManaConsumption=ManaConsumption;
    }
    public Cards(String name, int Strength, int Intelligence, int Agility){
        this.name = name;
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Agility = Agility;
        this.Damage = Damage;
        this.ManaConsumption = ManaConsumption;
    }
    public Cards(String name, double Health, double Shield, double Damage, double ManaConsumption){
        this.name = name;
        this.Health = Health;
        this.Shield = Shield;
        this.Damage = Damage;
        this.ManaConsumption = ManaConsumption;
    }
    public Cards(String name, int Strength, int Intelligence, int Agility, double HP, double Shield, double Dmg, double MC){
        this.name = name;
        
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Agility = Agility;
        
        this.Health = HP;
        this.Shield = Shield;
        
        this.Damage = Dmg;
        this.ManaConsumption = MC;
    }
    public Cards(Document cards){
        Document temp = cards.get("Card", Document.class);
            this.name = temp.getString("Name");
            this.Health = temp.getDouble("Health");
            this.Shield = temp.getDouble("Shield");
            this.Damage = temp.getDouble("Damage");
            this.ManaConsumption = temp.getDouble("Mana Consumption");
            this.Strength = temp.getInteger("Strength");
            this.Intelligence = temp.getInteger("Intelligence");
            this.Agility = temp.getInteger("Agility");
    }
    
    public void addCardOnDmg(){
        dbManager.setAppendSingle("Status", "inactive");
        Document Cards = new Document()
                .append("Name", this.name)
                .append("Damage", this.Damage)
                .append("Mana Consumption", this.ManaConsumption);
        dbManager.setAppendSingle("Card", Cards);
        
        dbManager.Insert();
    }
    public void addCardOnEffect(){
        dbManager.setAppendSingle("Status", "inactive");
        Document Cards = new Document()
                .append("Name", this.name)
                .append("Strength", this.Strength)
                .append("Intelligence", this.Intelligence)
                .append("Agility", this.Agility);
        dbManager.setAppendSingle("Card", Cards);
        
        dbManager.Insert();
    }
    public void addCard(){
        dbManager.setAppendSingle("Status", "inactive");
        Document Cards = new Document()
                .append("Name", this.name)
                .append("Health", this.Health)
                .append("Damage", this.Damage)
                .append("Mana Consumption", this.ManaConsumption)
                .append("Shield", this.Shield)
                .append("Strength", this.Strength)
                .append("Intelligence", this.Intelligence)
                .append("Agility", this.Agility);
        dbManager.setAppendSingle("Card", Cards);
        dbManager.Insert();
    }
    
    public void getImg(String name){
        switch(name){
            default -> System.out.print("No instance image of that certain relic");
        }
    }
    
    /**
     * Getters and Setters
     * @return 
     */
    public String getName(){
        return this.name;
    }
}
