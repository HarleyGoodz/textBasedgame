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
public class Thorfinn extends Player {
   
    
    public Thorfinn(String Name, int Health, int Mana){
        super(Name, Health, Mana);
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
    
    public void thornfinn_Introduction(){
            Scanner scanner = new Scanner(System.in);
        
        System.out.println("------------------BACKSTORY-----------------------------");
        System.out.println("Thorn was once a man of peace, a master of the sword who valued family above all else.\n"
                + " His world shattered when his father's most trusted ally betrayed them, \n "
                + "press 'Enter' to continue....");
        scanner.nextLine();
  
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Consumed by rage, Thorn has spent years honing his skills, \n"
                + "turning himself into a walking weapon of vengeance. \n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("His only goal is to find and kill the betrayer who took everything from him,"
                + "and ending those spread evil.\n"
                + "But Thorn’s journey will lead him to realize that his rage, \n"
                + "while powerful, is not the only thing that can forge his destiny.\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
    }

    public void thorfinn_ending(Thorfinn thorn){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("As Thorfinn stands over the fallen body of his father’s betrayer, \n"
                + "sword dripping with blood, the moment he had envisioned for years finally arrives.\n"
                + "the once-powerful enemy, now a broken, gasping figure, lies at Thorn’s feet. "
                + "\n press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("His chest heaves as he struggles to speak, but Thorn feels no pity,\n"
                + "only the cold satisfaction of vengeance fulfilled.\n press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Is this what you wanted? the betrayer asks, his voice weak,\n"
                + " but cutting through the silence. After all these years... is your soul at peace?"
                + "\n press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("-----------------------------------------------");
        System.out.println("Thorfinn stares down, gripping his sword tightly. The rush of triumph he had anticipated feels hollow.\n"
                + "The rage that fueled him for so long begins to wane, leaving him with a strange emptiness.\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("The betrayer coughs, a bitter smile curling his lips. \n"
                + "I didn’t just take your family, Thorn. I took your peace. I made you into what you are now.\n"
                + "\n press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("The words hit Thorn harder than any blade ever could. He had become a weapon, yes, \n"
                + "but now, standing victorious, he realizes the cost. He had lost more than just his family. He had lost himself.\n"
                + " press 'Enter' to continue");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("With a grimace, Thorn drives his sword into the earth beside the betrayer, no longer needing it. \n"
                + "I came here to kill you, to end this"
                + " Thorfinn says, his voice low but steady. But now I see that killing you isn’t the end of my journey.\n"
                + "press 'Enter' to continue");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("As Thorn walks away from the battlefield, the wind carries the scent of blood and ash,\n"
                + " but something deeper stirs within him. He knows now that his journey is not over.\n"
                + "press 'Enter' to continue");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("He looks to the horizon, where the sun is just beginning to rise. A new dawn, a new chapter.\n"
                + " Thorn is no longer bound by the past. He is no longer a slave to rage. His destiny,\n"
                + " he realizes, will be forged not by the blood he sheds, but by the choices he makes from here on."
                + "\npress 'Enter' to end the journey....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        
        
        
        
        
        
        
    }
    
    
}

    