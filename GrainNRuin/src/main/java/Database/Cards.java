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
    private int Strength=0, Intelligence=0, Agility=0;

    public Cards(String name, int Strength, int Intelligence, int Agility){
        this.name = name;
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Agility = Agility;
    }
    
    public Cards(Document card){
        Document temp = card.get("Card", Document.class);
        this.name = temp.getString("name");
        this.Strength = temp.getInteger("Strength");
        this.Intelligence = temp.getInteger("Intelligence");
        this.Agility = temp.getInteger("Agility");
    }
    
    public void addCard(){
        dbManager.setAppendSingle("Name", this.name);
        HashMap<String, Integer> stats = new HashMap<>();
        stats.put("Strength", this.Strength);
        stats.put("Intelligence", this.Intelligence);
        stats.put("Agility", this.Agility);
        dbManager.setAppendMapInteger("Stats", stats);
        
        dbManager.Insert();
    }
}