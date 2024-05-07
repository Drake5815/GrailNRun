/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

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
    public ArrayList<Integer> Apply(Relics rel){
        this.relic.add(rel);
        
        ArrayList<Integer> stats = new ArrayList<>();
        stats.add(rel.getStrength());
        stats.add( rel.getIntelligence());
        stats.add( rel.getAgility());
        
        return stats;
    }
<<<<<<< HEAD
=======
    public void insertCard(Cards cards){
        this.card.add(cards);
    }
    
>>>>>>> 492f61da169ad28a619f86e57de971a65712076f
}
