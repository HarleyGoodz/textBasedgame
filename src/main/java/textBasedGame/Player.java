/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
public class Player {
    
    private String name;
    private int health;
    private int mana;

    public Player(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            System.out.println("Not enough mana!");
            return false;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0; 
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name + "'s Health: " + health + " | Mana: " + mana;
    }
}
    

