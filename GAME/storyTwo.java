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
public class storyTwo {
    Jormungandr objJorm = new Jormungandr("Jormungandr", 500);
    Draugar objDrau = new Draugar("Draugar", 100);
    Fossegrimen objFoss = new Fossegrimen("Fossegrimen", 100);
    Mare objMare = new Mare("Mare", 100);
    Scanner scanner = new Scanner(System.in);
    
    
    
    public void wallTwo(Player character){
        
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("-------------------A NEW JOURNEY HAS BEGUN!----------------------------");
        System.out.println("This is just the starting point of your adventure. Be wary of your surroundings as demons may appear\n"
                + "out of sight and might take your life!\n"
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("As you walk accross the dark forest, having no vision in sight, fogs are thick and you can hear your own breathing \n"
                + "because of the silence and eerie feeling of the forest!"
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("As you walk by... you can feel at any moment that you can get killed...\n"
                + "strange sounds are getting louder and louder"
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("------------------CONFRONTATION!-----------------------------");
        System.out.println("The demons screamed and charged at you, revealing their location!\n"
                + "3 of them appeared and sorrounded you!"
                + "\n press 'Enter' to FIGHT!!!");
        scanner.nextLine();
        
        
        
        while (objMare.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objMare.toString());
            
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
                            objMare.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objMare.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objMare.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objMare.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objMare.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objMare.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objMare.getName() + " prevails.");
                    break;
                } else if (objMare.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objMare.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        while (objDrau.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objDrau.toString());
            
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
                            objDrau.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objDrau.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objDrau.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objDrau.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objDrau.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objDrau.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objDrau.getName() + " prevails.");
                    break;
                } else if (objDrau.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objDrau.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        while (objFoss.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objFoss.toString());
            
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
                            objFoss.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objFoss.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objFoss.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objFoss.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objFoss.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objFoss.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objFoss.getName() + " prevails.");
                    break;
                } else if (objFoss.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objFoss.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("After defeating the demons that ambushed you,"
                + "\n you feel tired and lost in the forest..."
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("As you sat down and lay your head, wanting to take a break but suddenly\n"
                + "something weird is coming...."
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("------------------AMBUSHED!!!-----------------------------");
        System.out.println("The Earth began to rumble....\n"
                + "Tress began to fall...\n"
                + "an ear-splitting scream ripped through the darkness...\n"
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("As you looked up into the heavens...\n"
                + "A giant snake appeared!\n"
                + "The LEGENDARY Jormungandr!!\n"
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("The colossal serpent lunges forward, its jaws wide open, ready to engulf you in a monstrous,\n"
                + " bone-crushing strike!\n"
                + "\n press 'Enter' to DODGE!!!");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("You swiftly evade the serpent's vicious lunge, adrenaline surging through your veins like wildfire. \n"
                + " The air crackles with tension as you prepare for the clash of a lifetime\n"
                + "an epic battle between a colossal, legendary beast and a mere mortal daring to defy fate!\n"
                + "\n press 'Enter' to continue!!!");
        scanner.nextLine();
        
        System.out.println("-------------------PREPARE FOR BATTLE!!!---------------------------");
        System.out.println("Your draw your weapon, setting your heart to ablaze, eradicating the tiring feeling of the recent battle\n"
                + "you have faced!"
                + "\n press 'Enter' to FIGHT!!!!!");
        scanner.nextLine();
        
        while (objJorm.getHealth() > 0 && character.getHealth() > 0) {
            System.out.println(character.toString());
            System.out.println(objJorm.toString());


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
                            objJorm.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objJorm.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objJorm.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objJorm.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objJorm.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objJorm.skillOne();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objJorm.skillTwo(); // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objJorm.skillThree();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objJorm.getName() + " prevails.");
                    break;
                } else if (objJorm.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objJorm.getName() + "\n\n");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        objJorm.Serpent_ending();


    }
}
