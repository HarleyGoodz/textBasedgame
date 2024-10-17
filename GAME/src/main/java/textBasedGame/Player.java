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
    private int Coins;
    
    public abstract int skillOne();
    public abstract int skillTwo();
    public abstract int skillThree();
    public abstract int oneHitDelete();

    public abstract boolean useMana(int amount);

    public abstract void takeDamage(int damage);

    public abstract int getHealth();
    
    public abstract String getName();
    
    public abstract String toString();
      
}
    

