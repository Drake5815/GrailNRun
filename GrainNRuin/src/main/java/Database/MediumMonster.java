/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Engilo Grave
 */
public class MediumMonster extends Enemies{
    public MediumMonster(){
        super("MediumMonster", 20,10,0,5,3,5);
    }
    public MediumMonster(String Name, float Health, float Mana, float Shield, int Strength, int Intelligence, int Agility){
        super(Name, Health, Mana, Shield, Strength, Intelligence, Agility);
    }
}
