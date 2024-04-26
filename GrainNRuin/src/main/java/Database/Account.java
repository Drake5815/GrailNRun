/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Manager.Database_Manager;
import java.util.Random;
import org.bson.Document;

/**
 *
 * @author Engilo Grave
 */
public class Account {
    
    private Database_Manager DB_Manager = new Database_Manager("user");
    private SaveState saveState;
    
    private String username;
    private String password;
    
    //Constructor
    public Account(){}
    //Constructor for newAccount / REGISTER
    public Account(String username, String password){
        this.username = username;
        this.password = password;
        this.Insert();
    }
    
    //Setters and Getters
    public void setUsername(String user){
        this.username = user;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public void setSaveState(SaveState saveState){
        this.saveState = saveState;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public SaveState getSaveState(){
        return this.saveState;
    }
    
    //INSERTING FROM DATABASE
    private void Insert(){
        DB_Manager.setAppendSingle("Username", this.username);
        DB_Manager.setAppendSingle("Password", this.password);
        if(saveState != null){
            DB_Manager.setAppendSingle("ger.setAppSave", saveState);
        }
        DB_Manager.Insert();
    }
    public boolean insertSaveState(String key, Object obj){
        try{
            DB_Manager.updateDocument("Username", this.username, key, obj); 
            return true;
        } catch(Exception e){
            System.out.println("System Error : " + e);
            return false;
        }
    }
    
    
    //Comparing From Database / LOG-IN
    public boolean Authenticate(){
        try{
            
            Document document = DB_Manager.getDocument("Username", this.username);
            String DB_Username = document.getString("Username");
            String DB_Password = document.getString("Password");
            
            return (this.username == null ? DB_Username == null : this.username.equals(DB_Username)) && this.password.equals(DB_Password);
            
        } catch(Exception e){
            System.out.println("System Error : " + e);
            return false;
        }
    }
    // Comparison
    public boolean checkAcc(){
        try{
            return DB_Manager.Exist("Username", this.username);
        } catch(Exception e){
            System.out.println("System Error : " + e);
        }
        return false;
    }
    
    
}