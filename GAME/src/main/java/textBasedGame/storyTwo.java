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
        while (objMare.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objMare.toString());
            
            System.out.println("Choose your action: ");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
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
                } else if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objMare.getName() + "! Musashi Advances");
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
            
            System.out.println("Choose your action: ");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
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
                    System.out.println(character.getName() + " has defeated " + objDrau.getName() + "! Musashi Advances");
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
            
            System.out.println("Choose your action: ");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
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
                    System.out.println(character.getName() + " has defeated " + objFoss.getName() + "! Musashi Advances");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        while (objJorm.getHealth() > 0 && character.getHealth() > 0) {
            System.out.println(character.toString());
            System.out.println(objJorm.toString());

            System.out.println("Choose your action:");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
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
                    System.out.println(character.getName() + " has defeated " + objJorm.getName() + "! He has earned his freedom.");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }


    }
}
