/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Database.Cards;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Engilo Grave
 */
public class Deck_Manager {
    private ArrayList<Cards> Deck = new ArrayList<>();
    private Database_Manager dbManager = new Database_Manager("Cards");
    private int count=0,InsCount=0;
    
    public Deck_Manager(){
        startDeck();
    }
    private void startDeck(){
        ArrayList<Document> results = dbManager.getListDocument("Status", "active");
        for(Document k : results){
            if(k.isEmpty()){
                count++;
            } else {
                Deck.add(new Cards(k));
                InsCount++;
            }
        }
    }
    public void insertCard(Cards card){
        if(Deck.size() < 20){
            this.Deck.add(card);
        } else {
            System.out.println("Deck is Full");
        }
    }
    public ArrayList getDeck(){
        return this.Deck;
    }
    /**
     * Testing Area
     */
    public void displayDeck(){
        try{
            System.out.println("Cards:"); // More descriptive output
            if (Deck.isEmpty()) {
                System.out.println("(Empty)");
            } else {
                for (Cards card : Deck) {
                    // Assuming your Cards class has a way to get a displayable name
                    System.out.println("- " + card.getName());  

                    // Or, if you want to print the whole document:
                    // System.out.println("- " + card.getDocument().toJson());
                }
            }
        } catch(Exception e){
            System.out.print("System Error:" + e);
        }
    }
}
