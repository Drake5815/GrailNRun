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
    private int keyID=0;
    
    private int saveKeyID1 = 0;
    private int saveKeyID2 = 0;
    
    Database_Manager dbMngr = new Database_Manager();
    
    public Account(){}
    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void createAcc(String username, String password){
        this.username = username;
        this.password = password;
        this.keyID = generateRndId();
    }
    public void getAcc(String user, String pass){
         
    }
    
    public int getId(){
        //Return this class keyID for SaveState;
        return this.keyID;
    }
    private int generateRndId(){
        //Generate rnd original key for SaveState reference
        return rnd.nextInt(100);
    }
    
    private boolean checkOriginKey(){
        //Check for duplicates
        
        //Check table for same set of ID
           //if yes return false for duplicant
           //if no return true for original
        
        
        return false;
    }
}
