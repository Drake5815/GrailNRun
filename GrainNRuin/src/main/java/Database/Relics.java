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
public class Relics {
    private ImageIcon img;
    
    private String name;
    private int Strength=0, Intelligence=0, Agility=0;
    
    private Database_Manager dbManager = new Database_Manager("Relics");
    
    public Relics(){}
    public Relics(String name, int Strength, int Intelligence, int Agility){
        this.name = name;
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Agility = Agility;
    }
    public Relics(Document relic){
        Document temp = relic.get("Relic", Document.class);
        this.name = temp.getString("name");
        this.Strength = temp.getInteger("Strength");
        this.Intelligence = temp.getInteger("Intelligence");
        this.Agility = temp.getInteger("Agility");
    }
    
    public void addRelic(){
        dbManager.setAppendSingle("Status", "inactive");
        dbManager.setAppendSingle("Relic", this);
        
        dbManager.Insert();
    }
}
