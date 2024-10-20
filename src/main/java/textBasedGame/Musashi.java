/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
import java.util.Scanner;
import java.util.Random;
public class Musashi extends Player {
    
    public Musashi(String Name, int Health, int Mana){
        super(Name, Health, Mana);
        //this.Coins = Coins;
    }
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        System.out.println("Musashi uses Soul Pierce! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    //private int Coins;
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        System.out.println("Musashi uses Lifeblood Rend! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        System.out.println("Musashi uses Demon Fang Strike! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
    }
    
    @Override
    public int oneHitDelete(){
        
        System.out.println("Musashi uses ONE HIT DELETE! Deals ∞ damage.");
        
        return 1000;
    }
    
    public void Musashi_intro() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------------BACKSTORY---------------------------");
        System.out.println("Once a proud warrior, Musashi fell into darkness when he became a puppet for the demonic realm. \n"
                + "Bound by a curse, every kill of a demon brings him closer to reclaiming his lost humanity,"
                + "\n press 'Enter to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("with each demon slain restoring a part of his fragmented body. He fights, not for glory, \n"
                + " but for the hope of breaking the curse that chains him to the underworld."
                + "\n press 'Enter to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("But as his body returns, so too does the madness lurking deep within,\n"
                + " forcing him to walk the line between redemption and damnation."
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("Musashi is in a journey to end this ugly curse, by killing all the demons that interferes on his path\n"
                + "restoring his lost humanity..."
                + "\n press 'Enter' to continue");
        scanner.nextLine();
    }
    
    public void Musashi_KrevMalak_Encounter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("After defeating the demons that distrubs Musashi's path, he now continues his journey/\n"
                + "regaining 25% of his humanity, but the sanity of the shadows are increasing..."
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        
        System.out.println("-----------------------------------------------");
        System.out.println(""
                + "\n press 'Enter' to continue");
        scanner.nextLine();
    }
    
    


    
    
    
    

   
    
}