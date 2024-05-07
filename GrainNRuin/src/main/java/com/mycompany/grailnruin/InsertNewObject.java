/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grailnruin;

import Database.Cards;
import Database.Relics;
import Manager.Card_Manager;
import Manager.Database_Manager;
import Manager.Deck_Manager;
import Manager.Relic_Manager;
import org.bson.Document;

/**
 *
 * @author Engilo Grave
 */
public class InsertNewObject {
    
    public static void main(String[] args){
        Deck_Manager deckMng = new Deck_Manager();
        
        deckMng.displayDeck();
    }
}
