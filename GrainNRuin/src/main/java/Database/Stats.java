/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Database;

/**
 *
 * @author Engilo Grave
 */
public interface Stats {
    public float getHealth();
    public float getMana();
    public float getShield();
    public int getStrength();
    public int getIntelligence();
    public int getAgility();
    
    public void setHealth(float Health);
    public void setMana(float Mana);
    public void setShield(float Shield);
    public void setStrength(int Strength);
    public void setIntelligence(int Intelligence);
    public void setAgility(int Agility);
}
