/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class Thorfinn extends Player{
    private int Health;
    private int Mana;
    private String Name;
    
    
    public Thorfinn(String Name, int Health, int Mana){
        this.Name = Name;
        this.Health = Health;
        this.Mana = Mana;
    }
    
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        System.out.println("Thorfinn uses Whirlwind Cleave! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        System.out.println("Thorfinn uses Seismic Strike! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        System.out.println("Thorfinn uses Blade Tempest! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
    }
    
    @Override
    public int oneHitDelete(){
        
        System.out.println("Thorfinn uses One Hit Delete! Deals ∞ damage.");
        
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
