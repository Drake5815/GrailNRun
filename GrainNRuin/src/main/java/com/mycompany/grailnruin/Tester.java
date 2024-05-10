/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grailnruin;

import Database.Cards;
import Manager.Card_Manager;

/**
 *
 * @author Engilo Grave
 */
public class Tester {
    public static void main(String[] args){
        Card_Manager card = new Card_Manager();
        
        Cards newCard = card.getRandomCard();
        
        System.out.println("Cards URL: " + newCard.getIcon());
    }
}
