/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.util.Random;

/**
 *
 * @author Engilo Grave
 */
public class Account {
    
    Database_Manager DB_Manager = new Database_Manager();
    
    private String username;
    private String password;
    
    public Account(){}
    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void createAcc(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public Account getAccount(){
        
        
        
        return null;
    }
    
}
