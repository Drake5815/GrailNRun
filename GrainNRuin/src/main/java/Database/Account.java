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
    
    private SaveState ss1;
    private SaveState ss2;
    
    public Account(){}
    public Account(String username, String password){
        this.username = username;
        this.password = password;
        generateId();
    }
    
    public int getId(){
        return this.keyID;
    }
    private void generateId(){
        this.keyID = rnd.nextInt(100);
    }
}
