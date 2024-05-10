/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Controller.UI_Controller;
import Database.Cards;
import Database.Enemies;
import Database.Relics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Engilo Grave
 */
public class Level_Manager {
    private JPanel FightScene, RestScene, ShopScene;
    private UI_Controller avatar = new UI_Controller();
    private Enemies enemy = new Enemies();
    private Relic_Manager relics = new Relic_Manager();
    private Card_Manager card = new Card_Manager();
    
    private Random rnd = new Random();
     
    //Constructor
    public Level_Manager(){
        
    }
    
    public void FightScene(){
        int countTurn=0;
        
        float charAgi = this.avatar.getCharaceter().getAgility();
        float EnemyAgi = this.enemy.getAgility();
        
        if(countTurn == 0){
            if(charAgi > EnemyAgi){
                //Character goes first and set even numbers to char turn;
                
            } else {
                //Enemy goes first and set even number to enemy turn;
                
            }
        }
    }
    public void RestScene(){
        if (this.avatar.getCharaceter().getHealth() < 10){
            System.out.println("System Healing on progress");
        } else {
            System.out.println("Character already Max Health");
        }
    }
    public Relics getrndRelic(){
        return this.relics.getRndRelic();
    }
    public Cards getrndCards(){
        return this.card.getRandomCard();
    }
}
