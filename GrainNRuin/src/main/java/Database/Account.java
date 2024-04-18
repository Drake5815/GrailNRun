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
    private String username;
    private String password;
    
    Random rnd = new Random();
    int keyID=0;
    
    public Account(){}
    public void newAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public int getId(){
        return this.keyID;
    }
    public void generateId(){
        this.keyID = rnd.nextInt(100);
    }
    
}
