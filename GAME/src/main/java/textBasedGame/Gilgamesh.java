/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class Gilgamesh extends Player{
    
    public Gilgamesh(String Name, int Health, int Mana){
        super(Name, Health, Mana);
    }
    
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        System.out.println("Gilgamesh uses Stellar Rift! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        System.out.println("Gilgamesh uses Astral Surge! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        System.out.println("Gilgamesh uses Celestial Binding! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
    }
    
    
    @Override
    public int oneHitDelete(){
        
        System.out.println("Gilgamesh uses ONE HIT DELETE! Deals ∞ damage.");
        
        return 1000;
    }
}
