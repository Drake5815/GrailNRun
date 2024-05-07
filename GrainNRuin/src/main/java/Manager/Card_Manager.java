/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Database.Cards;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Engilo Grave
 */
public class Card_Manager {
    private Database_Manager db_Manager = new Database_Manager("Cards");
    
    public Cards getRandomCard(){
        ArrayList<Document> relics = db_Manager.getListDocument("Status", "inactive");
        int count = db_Manager.getCount();
        Random rng = new Random();
        
        Document result = relics.get(rng.nextInt(count));
        ObjectId cardId = result.getObjectId("_id");

        db_Manager.updateDocument("_id", cardId, "Status", "active"); 

        Document relicDoc = db_Manager.getDocument("_id", cardId);
        
        if (relicDoc == null) {
            return null;
        } else{
            return new Cards(relicDoc);
        }
    }
    
    public void insertNewCard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter Health:");
        Double Health = sc.nextDouble();
        System.out.println("Enter Damage:");
        Double Damage = sc.nextDouble();
        System.out.println("Enter Mana Consumption:");
        Double ManaConsumption = sc.nextDouble();
        System.out.println("Enter Shield:");
        Double Shield = sc.nextDouble();
        System.out.println("Enter Strength:");
        int Str = sc.nextInt();
        System.out.println("Enter Intelligence:");
        int Int = sc.nextInt();
        System.out.println("Enter Agility:");
        int Agi = sc.nextInt();
        
        Cards temp = new Cards(name,Str,Int,Agi,Health,Shield,Damage,ManaConsumption);
        temp.addCard();
    }
}
