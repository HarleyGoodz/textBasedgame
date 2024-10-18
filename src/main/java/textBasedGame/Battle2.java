package textBasedGame;

import java.util.Scanner;

public class Battle2 {
    
    private int healingPotions = 0; // Track healing potions
    private int manaPotions = 0;

    public void secondBattle(Thorn thorn,int healingPotions, int manaPotions) {
         this.healingPotions = healingPotions; // Initialize potions
        this.manaPotions = manaPotions;// Use Thorn instead of Player
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("A new chapter approaches....\n press 'Enter' to continue....");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------");
        System.out.println("You are now playing the story line of 'Thorn Finland ' The Vengeful SwordMaster\n "
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
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
        System.out.println(" His only goal is to find and kill the betrayer who took everything from him. \n"
                + "But Thorn’s journey will lead him to realize that his rage, \n"
                + "while powerful, is not the only thing that can forge his destiny.\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("and that betrayer is.... Zorath Valesk, The Betrayer\n"
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
        System.out.println("And now... Thorn has finally arrived at his domain,"
                + "full of rage, and anger."
                + "ready to fight, ready to kill....\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Thorn charges at Zorath starting a savage battle.... ready yourself.\n"
                + "press 'Enter' to FIGHT!!!");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        
        Zorath villain = new Zorath("Zarkon Valesk, the Traitor", 200);
        Minions minion1 = new Minions("Shadow Minion 1", 100);
        Minions minion2 = new Minions("Shadow Minion 2", 100);

        Enemy[] enemies = { villain, minion1, minion2 };

        

        // Battle loop
        while (villain.getHealth() > 0 || minion1.getHealth() > 0 || minion2.getHealth() > 0) {
            // Display player and enemy stats
            System.out.println("-------------------------------------------------");
            System.out.println(thorn);  // Show Thorn's stats
            for (Enemy enemy : enemies) {
                if (enemy.getHealth() > 0) {
                    System.out.println(enemy);
                }
            }

            // Player's action: attack or use inventory
            int actionChoice = 0; // Initialize with an invalid choice
            while (actionChoice < 1 || actionChoice > 3) { // Now options are 1-3
                try {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Choose your action:");
                    System.out.println("1. Attack");
                    System.out.println("2. Use Mana Potion");
                    System.out.println("3. Use Healing Potion");
                    System.out.print("Enter your choice: ");
                    actionChoice = scanner.nextInt();

                    if (actionChoice < 1 || actionChoice > 3) {
                        System.out.println("-------------------------------------------------");
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.nextLine(); // Clear the buffer
                }
            }

            // Handle player actions
            if (actionChoice == 1) {
                // Attack logic
                int skillChoice = -1; // Initialize with an invalid choice
                while (skillChoice < 1 || skillChoice > 3) {
                    try {
                        System.out.println("Choose your skill:");
                        System.out.println("1. Whirlwind Cleave (30-40 damage, 10 mana)");
                        System.out.println("2. Seismic Strike (35-45 damage, 20 mana)");
                        System.out.println("3. Blade Tempest (40-50 damage, 30 mana)");
                        skillChoice = scanner.nextInt();

                        if (skillChoice < 1 || skillChoice > 3) {
                            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter a number.");
                        scanner.nextLine(); // Clear the buffer
                    }
                }

                // Choose the enemy to attack
                int targetChoice = -1; // Initialize with an invalid choice
                while (targetChoice < 0 || targetChoice >= enemies.length) {
                    try {
                        System.out.println("Choose the enemy to attack:");
                        for (int i = 0; i < enemies.length; i++) {
                            if (enemies[i].getHealth() > 0) {
                                System.out.println((i + 1) + ". " + enemies[i].getName());
                            }
                        }
                        targetChoice = scanner.nextInt() - 1; // Convert to 0-based index

                        if (targetChoice < 0 || targetChoice >= enemies.length || enemies[targetChoice].getHealth() <= 0) {
                            System.out.println("Invalid target choice. Please choose a living enemy.");
                            targetChoice = -1; // Reset for the next loop
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        scanner.nextLine(); // Clear the buffer
                    }
                }

                // Calculate damage based on skill
                int damage = 0;
                if (skillChoice == 1 && thorn.useMana(10)) {  // Thorn's mana usage
                    damage = 30 + (int)(Math.random() * 11);  // 30-40 damage
                } else if (skillChoice == 2 && thorn.useMana(20)) {
                    damage = 35 + (int)(Math.random() * 11);  // 35-45 damage
                } else if (skillChoice == 3 && thorn.useMana(30)) {
                    damage = 40 + (int)(Math.random() * 11);  // 40-50 damage
                } else {
                    System.out.println("Not enough mana or invalid skill! No damage dealt.");
                    continue;  // Skip to the next iteration of the battle loop
                }

                enemies[targetChoice].takeDamage(damage);
                System.out.println("-------------------------------------------------");
                System.out.println("Thorn attacked " + enemies[targetChoice].getName() + " for " + damage + " damage.");
            } else if (actionChoice == 2) {
                // Use mana potion
                if (manaPotions > 0) {
                    System.out.println("You used a Mana Potion! Restores 50 Mana.");
                    thorn.restoreMana(50); // Assume you have a restoreMana method
                    manaPotions--; // Decrease mana potions count
                } else {
                    System.out.println("You have no Mana Potions left!");
                }
            } else if (actionChoice == 3) {
                // Use healing potion
                if (healingPotions > 0) {
                    System.out.println("You used a Healing Potion! Restores 50 HP.");
                    thorn.restoreHealth(50); // Assume you have a restoreHealth method
                    healingPotions--; // Decrease healing potions count
                } else {
                    System.out.println("You have no Healing Potions left!");
                }
            }

            // Enemies attack Thorn
            for (Enemy enemy : enemies) {
                if (enemy.getHealth() > 0) {
                    int enemyDamage = (int)(Math.random() * 15) + 10;  // Random damage 10-25
                    thorn.takeDamage(enemyDamage);
                    System.out.println("-------------------------------------------------");
                    System.out.println(enemy.getName() + " strikes you for " + enemyDamage + " damage.");
                }
            }

            // Check if Thorn is dead
            if (thorn.getHealth() <= 0) {
                System.out.println("-------------------------------------------------");
                System.out.println("You have fallen in battle.");
                return;  // Exit the method if Thorn is dead
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("You have defeated Zarkon and his minions!");
    }

    
}
