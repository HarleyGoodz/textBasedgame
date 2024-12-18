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
public class storyThree {
    Tiamat objTia = new Tiamat("Tiamat",1000);
    Anzu objAnzu = new Anzu("Anzu",200);
    Urmahlullu objUrma = new Urmahlullu("Urmahlullu", 200);
    Humbaba objHum = new Humbaba("Humbaba", 200);
    
    
    
    public void wallThree(Player character){
        Scanner scanner = new Scanner(System.in);

    System.out.println("---------THE FINAL CHAPTER---------------");
    System.out.println("You have arrived at the final wall... A hellish journey awaits you.");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();


    System.out.println("----------------------------------------------");
    System.out.println("As you have exited the forest, a bright red sky welcomed you showing its immense power of darkness...");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    System.out.println("----------------------------------------------");
    System.out.println("As you took a couple of steps in that world, An anzu landed before you, interfering your journey and intends to"+ 
    " kill you....");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    System.out.println("----------------------------------------------");
    System.out.println("Prepare for Battle!");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();
        
        while (objAnzu.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objAnzu.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (character.useMana(10)) {
                            damage = character.skillOne(); // Random damage between 30 and 40
                            objAnzu.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objAnzu.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objAnzu.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objAnzu.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objAnzu.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objAnzu.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objAnzu.getName() + " prevails.");
                    break;
                } else if (objAnzu.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objAnzu.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

    System.out.println("--------------------VICTORY!--------------------------");
    System.out.println("You have successfully defended yourself, but it's not over yet!");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    System.out.println("----------------------------------------------");
    System.out.println("As two of the monsters charged infront of you, avenging their ally!");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    System.out.println("----------------------------------------------");
    System.out.println("Brace yourself! PREPARE FOR BATTLE 2!");
    System.out.println("Press 'Enter' to FIGHT");
    scanner.nextLine();

        
        
        while (objUrma.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objUrma.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (character.useMana(10)) {
                            damage = character.skillOne(); // Random damage between 30 and 40
                            objUrma.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objUrma.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objUrma.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objUrma.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objUrma.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objUrma.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objUrma.getName() + " prevails.");
                    break;
                } else if (objUrma.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objUrma.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        while (objHum.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objHum.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (character.useMana(10)) {
                            damage = character.skillOne(); // Random damage between 30 and 40
                            objHum.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objHum.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objHum.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objHum.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objHum.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objHum.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objHum.getName() + " prevails.");
                    break;
                } else if (objHum.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objHum.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        System.out.println("----------------------------------------------");
    System.out.println("After defeating those who attempted to trample your path, you managed to prevail on your adventure,\n"+
     "you travel accross the great mountains, seeking to defeat the 3 headed dragon...");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    System.out.println("----------------------------------------------");
    System.out.println("After climbing the top of the mountain, the three headed dragon roars showcasing its greatness and power.");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    objTia.Tiamat_Backstory();

        
         while (objTia.getHealth() > 0 && character.getHealth() > 0) {
            System.out.println(character.toString());
            System.out.println(objTia.toString());

            System.out.println("---------------------------------------");
            System.out.println("Choose your action:");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");

            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (character.useMana(10)) {
                            damage = character.skillOne(); // Random damage between 30 and 40
                            objTia.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objTia.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objTia.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objTia.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objTia.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objTia.skillOne();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objTia.skillTwo(); // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objTia.skillThree();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objTia.getName() + " prevails.");
                    break;
                } else if (objTia.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objTia.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        objTia.Tiamat_Defeat();
        
    }
}
