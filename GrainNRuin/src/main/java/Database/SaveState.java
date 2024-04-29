/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Controller.UI_Controller;
import Manager.Level_Manager;

/**
 *
 * @author Engilo Grave
 */
public class SaveState {
    
    private Level_Manager lvlManager = new Level_Manager();
    private UI_Controller controller = new UI_Controller();
    
    private String Username;
    
    public SaveState(){}
    public SaveState(Level_Manager lvlManager, UI_Controller controller){
        this.lvlManager = lvlManager;
        this.controller = controller;
    }
    
    public void setLvlManager(Level_Manager lvlManager){
        this.lvlManager = lvlManager;
    }
    public void setUIController(UI_Controller controller){
        this.controller = controller;
    }
    public void setUsername(String username){
        this.Username = username;
    }
    public String getUsername(){
        return this.Username;
    }
    public Level_Manager getLevelManager(){
        return this.lvlManager;
    }
    public UI_Controller getController(){
        return this.controller;
    }
    
}
