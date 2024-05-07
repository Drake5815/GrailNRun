/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.Avatar;
import Database.Relics;
import Manager.Deck_Manager;
import Manager.Item_Manager;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Engilo Grave
 */
public class UI_Controller {
    
    private Deck_Manager deckMng = new Deck_Manager();
    private Item_Manager Relics = new Item_Manager();
    
    private Avatar Character = new Avatar(10,10,0,5,5,5);
    
    /**
     *  - Set Cards in Deck should be 12
     *  - Deck size should be around 20->25
     *  - Relics handled should be around 3->5
     * 
     */
    
    //Instance of new .this ... 
    public UI_Controller(){}
    public Avatar getCharacter(){
        return this.Character;
    }
    /**
     * Operations in organized format
     *  - Set JLabel onScreen
     *  - Draw of Cards
     *  - Instance Start
     *  - function Attack on Cast Card
     *  - function Buff and Debuff of casted Card
     * 
     */
    
    // When Recieving the Relic this makes the update to change to Character
    public void updateRelicToAvatarChanges(Relics rels){
        ArrayList<Integer> updateStats = Relics.Insert(rels);
        this.Character.setStrength(this.Character.getStrength()+updateStats.get(0));
        this.Character.setIntelligence(this.Character.getIntelligence()+updateStats.get(1));
        this.Character.setAgility(this.Character.getAgility()+updateStats.get(2));
    }
}
