package textBasedGame;

import java.util.Scanner;

public class storyOne {
    KrevMalak objKrev = new KrevMalak("Krev Malak",150);
    Kappa objKappa = new Kappa("Kappa", 100);
    Hyosube objHyo = new Hyosube("Hyosube", 100);
    Scanner scanner = new Scanner(System.in);

    public void wallOne(Player character){
        while (objKappa.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objKappa.toString());
            
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
                            objKappa.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objKappa.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objKappa.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objKappa.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objKappa.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objKappa.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objKappa.getName() + " prevails.");
                    break;
                } else if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objKappa.getName() + "! Musashi Advances");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        
        while (objHyo.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objHyo.toString());
            
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
                            objHyo.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objHyo.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objHyo.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objHyo.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objHyo.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objHyo.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objHyo.getName() + " prevails.");
                    break;
                } else if (objHyo.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objHyo.getName() + "! Musashi Advances");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
             
    
        while (objKrev.getHealth() > 0 && character.getHealth() > 0) {
            System.out.println(character.toString());
            System.out.println(objKrev.toString());

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
                            objKrev.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            objKrev.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            damage = character.skillThree();// Random damage between 40 and 50
                            objKrev.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = character.oneHitDelete();
                        objKrev.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objKrev.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objKrev.skillOne();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objKrev.skillTwo(); // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objKrev.skillThree();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println(character.getName() + " has fallen. " + objKrev.getName() + " prevails.");
                    break;
                } else if (objKrev.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objKrev.getName() + "! He has earned his freedom.");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        // You can add additional logic here for the shop or continue the game
    }
    
}
