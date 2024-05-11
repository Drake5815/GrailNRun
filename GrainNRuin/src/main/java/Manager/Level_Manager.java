/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Controller.UI_Controller;
import Database.BigMonster;
import Database.Cards;
import Database.Enemies;
import Database.MediumMonster;
import Database.Relics;
import Database.SmallMonster;
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
    public UI_Controller getAvatar(){
        return this.avatar;
    }
    public Enemies getEnemy(){
        Random rnd = new Random();
        int cnt = rnd.nextInt(1,3);
        
        Enemies sE = new SmallMonster();
        Enemies mE = new MediumMonster();
        Enemies bE = new BigMonster();
        
        return switch (cnt) {
            case 1 -> sE;
            case 2 -> mE;
            case 3 -> bE;
            default -> null;
        };
        
    }
}
