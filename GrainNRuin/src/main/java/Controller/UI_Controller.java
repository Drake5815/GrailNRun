/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.Avatar;
import Database.Cards;
import Database.Relics;
import Manager.Deck_Manager;
import Manager.Item_Manager;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Engilo Grave
 */
public class UI_Controller {
    
    private Deck_Manager deckManager = new Deck_Manager();
    private Item_Manager itemManager = new Item_Manager();
    
    private ArrayList<Cards> onDisplay = new ArrayList<>();
    private ArrayList<Cards> Deck = deckManager.getDeck();
    private Random rnd = new Random();
    
    private Avatar Character = new Avatar(10,10,0,5,5,5);
    
    /**
     *  - Set Cards in Deck should be 10
     *  - Deck size should be around 20->25
     *  - Relics handled should be around 3
     * 
     */
    
    //Instance of new .this ... 
    public UI_Controller(){}
    /**
     * @param Relic
     * Insert Relic and Check Relics
     */
    public void insertNewRelic(Relics Relic){
        this.Character.setStrength(this.Character.getStrength() + Relic.getStrength());
        this.Character.setIntelligence(this.Character.getIntelligence() + Relic.getIntelligence());
        this.Character.setAgility(this.Character.getAgility() + Relic.getAgility());
        this.itemManager.Insert(Relic);
    }
    //Insert deck
    /**
     * @param card
     * Insert Card and Check Card
     */
    public void insertNewCard(Cards card){
        this.deckManager.insertCard(card);
    }
    /**
     * onBattle Sequence
     */
    public ArrayList getSetCard(){
        return this.onDisplay;
    }
    public ArrayList Start(){
        int i=0;
        while(i<3){
            this.onDisplay.add(Deck.get(rnd.nextInt(Deck.size())));
        }
        return this.onDisplay;
    }
    public void PlayCard(Cards onPlay){
        this.onDisplay.remove(onPlay);
    }
    public void Draw(){
        this.onDisplay.add(Deck.get(rnd.nextInt(Deck.size())));
    }
    /**
     * 
     * @return Getters
     */
    public Avatar getCharaceter(){
        return this.Character;
    }
    public Deck_Manager Manager(){
        return this.deckManager;
    }
}
