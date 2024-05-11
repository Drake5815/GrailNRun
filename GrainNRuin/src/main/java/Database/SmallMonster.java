/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Engilo Grave
 */
public class SmallMonster extends Enemies {
    public SmallMonster(){
        super("SmallMonster", 10, 2, 0, 2, 0, 1);
    }
    public SmallMonster(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        super(Name, Health, Mana, Shield, Strength, Intelligence, Agility);
    }
}
