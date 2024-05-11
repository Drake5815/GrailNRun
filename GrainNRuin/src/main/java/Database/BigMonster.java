/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Engilo Grave
 */
public class BigMonster extends Enemies{
    public BigMonster(){
        super("BigMonster", 100,20,0,10,10,10);
    }
    public BigMonster(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        super(Name, Health, Mana, Shield, Strength, Intelligence, Agility);
    }
}
