/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Database.Cards;
import Database.Relics;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Engilo Grave
 */
public class Item_Manager {
    private ArrayList<Relics> relic = new ArrayList<>();
    
    private Database_Manager dbManager = new Database_Manager("Relics");
    
    public Item_Manager(){
        
    }
    public void insertRelic(Relics relics){
        this.relic.add(relics);
    }
//    public void insertCard(Cards cards){
//        this.card.add(cards);
//    }
    
}
