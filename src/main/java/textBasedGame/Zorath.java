package textBasedGame;

import java.util.Scanner;
public class Zorath extends Enemy {
    private int health;
    private String name;

    public Zorath(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public void Zorath_backstory(Zorath zorath){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Zorath Valesk, the scum who killed Thorfinn's family\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("serving alongside Thorn Finland's father in their war against the demons.\n"
                + " However, Zorath’s hunger for power grew uncontrollably\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("he made a secret pact with a powerful demonic entity to overthrow the kingdom. \n"
                + "When Thorn's father discovered this betrayal\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Zorath ambushed and murdered him, escaping into the wilds to amass an army of his own.\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("And now... you have finally arrived at his domain,"
                + "full of rage, and anger."
                + "ready to fight, ready to kill....\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("you charged at Zorath starting a savage battle.... ready yourself.\n"
                + "press 'Enter' to FIGHT!!!");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
    }
    
    void Zorath_ending(Zorath zorath){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("As you stand over the fallen body of Zorath\n"
                + "with your sword dripping with blood\n"
                + "the once-powerful enemy, now a broken, gasping figure, lies at your feet. "
                + "\n press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("His chest heaves as he struggles to speak, but you feel no pity,\n"
                + "only the cold satisfaction of victory fulfilled.\n press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
   
        
        System.out.println("-----------------------------------------------");
        System.out.println("As you walk away from the battlefield, the wind carries the scent of blood and ash,\n"
                + " your journey is not over. as the final boss is closing in....\n"
                + "press 'Enter' to continue");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
    }

    @Override
    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - HP: " + health;
    }

    @Override
    public int skillOne() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int skillTwo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int skillThree() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}