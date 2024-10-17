/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class KrevMalak extends Enemy {
    private int Health;
    private String Name;
    
    public KrevMalak(String Name,int Health){
        this.Health = Health;
        this.Name = Name;
    }
    
    @Override
    public void takeDamage(int damage){
        Health -= damage;
        
        if(Health < 0)
            Health = 0;
    }
    
    @Override
    public int getHealth(){
        return Health;
    }
    
    @Override
    public String getName(){
        return Name;
    }
    
    @Override
    public String toString(){
        return Name + "'s Health: " + Health;
    }
    
}
