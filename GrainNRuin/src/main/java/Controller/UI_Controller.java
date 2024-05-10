/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.Avatar;
import Manager.Deck_Manager;
import Manager.Item_Manager;
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
    
    /**
     * Operations in organized format
     *  - Set JLabel onScreen
     *  - Draw of Cards
     *  - Instance Start
     *  - function Attack on Cast Card
     *  - function Buff and Debuff of casted Card
     * 
     */
    
    public void setJLabel(JLabel character){
        Character.setJCharacter(character);
    }
    
    private void Draw(){
        
    }
    private void StartGame(){
        
    }
    private void onAttack(){
        
    }
    private void newBuff(){

    }
    private void newDebuff(){

    }
    
    
    
}
