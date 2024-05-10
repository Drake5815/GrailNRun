/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grailnruin;

import Database.Cards;
import Database.Relics;
import Manager.Card_Manager;
import Manager.Relic_Manager;

/**
 *
 * @author Engilo Grave
 */
public class InsertNewObject {
    
    public static void main(String[] args){
        Relic_Manager rlcManager = new Relic_Manager();
        Card_Manager crdManager = new Card_Manager();

        /**
         * Insert 12 new Relics
         *
         * Insert 40 new cards
         */
        //Loop to insert 12 new Relics
        for(int = 0; i < 12; i++){
            rlcManager.insertNewRelic();
        }
    }
}
