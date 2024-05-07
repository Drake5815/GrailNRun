/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Database.Relics;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Engilo Grave
 */
public class Relic_Manager {
    private Database_Manager db_Manager = new Database_Manager("Relics");
    
    public Relic_Manager(){}
    
    public Relics getRndRelic(){
        ArrayList<Document> relics = db_Manager.getListDocument("Status", "inactive");
        int count = db_Manager.getCount();
        Random rnd = new Random();
        
        Document result = relics.get(rnd.nextInt(count));
        ObjectId relicId = result.getObjectId("_id");

        db_Manager.updateDocument("_id", relicId, "Status", "active"); 

        Document relicDoc = db_Manager.getDocument("_id", relicId);
        
        if (relicDoc == null) {
            return null;
        } else{
            return new Relics(relicDoc);
        }
    }
    
    public void insertNewRelic(){
        String name;
        int Str=0,Int=0,Agi=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter Strength:");
        Str = sc.nextInt(); sc.next();
        System.out.println("Enter Intelligence:");
        Int = sc.nextInt(); sc.next();
        System.out.println("Enter Agility:");
        Agi = sc.nextInt(); sc.next();
        
        Relics temp = new Relics(name,Str,Int,Agi);
        temp.addRelic();
    }
    
}