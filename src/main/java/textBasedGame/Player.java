/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
public abstract class Player {
    
    private String Name;
    private int Health;
    private int Mana;
    //private int Coins;
    
    public Player(String Name, int Health, int Mana){
        this.Name = Name;
        this.Health = Health;
        this.Mana = Mana;
    }
    
    public abstract int skillOne();
    public abstract int skillTwo();
    public abstract int skillThree();
    public abstract int oneHitDelete();
    
    public abstract void intro();
    
    public abstract void epilogue();

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

    public void takeDamage(int damage){
        Health -= damage;
        
        if(Health < 0)
            Health = 0;
    }

    public int getHealth(){
        return Health;
    }
    
    public String getName(){
        return Name;
    }
    
    public String toString(){
        return Name + "'s Health: " + Health + " | " + "Mana: " + Mana;
    }
      
}
    
