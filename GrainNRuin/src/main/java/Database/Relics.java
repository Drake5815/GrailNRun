
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
    private String img = "G:\\GithubDesktop\\GIT_FinalProj\\GrailNRun\\GrainNRuin\\src\\main\\resources\\images\\" + this.name;
    
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
    public Relics(String name, int Strength, int Intelligence, int Agility, String img){
        this.name = name;
        this.Strength = Strength;
        this.Intelligence = Intelligence;
        this.Agility = Agility;
        this.img = img;
    }
    
    public String getIcon(){
        return this.img;
    }
    public int getStrength(){
        return this.Strength;
    }
    public int getIntelligence(){
        return this.Intelligence;
    }
    public int getAgility(){
        return this.Agility;
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
        Document Relic = new Document()
                .append("name", this.name)
                .append("Strength", this.Strength)
                .append("Intelligence", this.Intelligence)
                .append("Agility", this.Agility);
        dbManager.setAppendSingle("Relic", Relic);
        
        dbManager.Insert();
    }
    public void getImg(String name){
        switch(name){
            default -> System.out.print("No instance image of that certain relic");
        }
    }
}