/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grailnruin;

import Controller.UI_Controller;
import Database.Cards;
import Manager.Card_Manager;
import Manager.Deck_Manager;
import java.util.ArrayList;

/**
 *
 * @author Engilo Grave
 */
public class Tester {
    public static void main(String[] args){
        ArrayList<Cards> deck = new UI_Controller().getManager().getDeck();
        
        if(deck.get(0).getIcon() != null){
            System.out.println("Cards intergrated ");
        } else {
            System.out.println("Cards Missing ");
        }
        
        System.out.println("Cards URL: " + deck.get(0).getIcon());
    }
}
