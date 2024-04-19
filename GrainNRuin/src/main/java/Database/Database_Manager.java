/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Engilo Grave
 */

enum DB{
    Account,
    SaveState,
    Avatar,
    Enemies,
    Cards,
    Relics
}

public class Database_Manager {
    
    private DB data;
    
    public Database_Manager(){}
    public Database_Manager(String _table){
        
    }
    
    public DB getData(){
        return this.data;
    }
    public void setData(DB data){
        this.data = data;
    }
    
    
}
