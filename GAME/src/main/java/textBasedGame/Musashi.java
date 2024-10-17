/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
import java.util.Random;
public class Musashi extends Player {
    Random ran = new Random();
    private String Name;
    private int Health;
    private int Mana;
    //private int Coins;
    
    public Musashi(String Name, int Health, int Mana){
        this.Name = Name;
        this.Health = Health;
        this.Mana = Mana;
        //this.Coins = Coins;
    }
    
    @Override
    public int skillOne(){
        int skillOneDamage = ran.nextInt(40);
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = ran.nextInt(45);
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = ran.nextInt(50);
        
        return skillThreeDamage;
    }
    
    
    @Override
    public int oneHitDelete(){
        
        return 1000;
    }
    
    @Override
    public boolean useMana(int amount){
        if(Mana >= amount){
            Mana -= amount;
            return true;
        }
        else{
            System.out.println("Not enough mana!");
            return false;
        }
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
        return Name + "'s Health: " + Health + " | " + "Mana: " + Mana;
    }
    
}
