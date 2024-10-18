package textBasedGame;

import java.util.Scanner;

public class GAME {
    Musashi objMush = new Musashi("Musashi Miyamoto", 100, 100);
    KrevMalak objKrev = new KrevMalak("Krev Malak", 100);

    Thorn thorn = new Thorn("Thorn Finland", 200, 200);

    Scanner scanner = new Scanner(System.in);
    int coins = 0;

    public void start() {
        while (true) {
            try {
                System.out.println("The Walls of the Fallen!");
                System.out.println("1. Start");
                System.out.println("2. Exit");
                System.out.print("Enter your choice!: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("The game has started!\n");
                    scanner.nextLine();  // Consume newline
                    introduction();
                    break;
                } else if (choice == 2) {
                    System.out.println("You have exited the game!");
                    return;
                } else {
                    System.out.println("Please enter a valid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private void introduction() {
        System.out.println("Your journey begins now....");
        System.out.println("------------------------------------------------------");
        System.out.println("You begin as Musashi Miyamoto (The Cursed Assassin).");
        System.out.println("------------------------------------------------------");
        System.out.println("In a world consumed by chaos and darkness, where the line between life and death has long since blurred...");
        System.out.println("He embarks on a perilous journey, his fate bound by the weight of an unbroken curse.");
        System.out.println("Now, the battle approaches. Before him stands " + objKrev.getName() + ", the God of Despair!");
        System.out.println("-----------------------------------------------");
        System.out.println("Press Enter to continue.");
        scanner.nextLine();

        turnBasedBattle();
    }

    private void turnBasedBattle() {
        while (objKrev.getHealth() > 0 && objMush.getHealth() > 0) {
            System.out.println("");
            System.out.println(objMush.toString());
            System.out.println(objKrev.toString());

            System.out.println("");
            System.out.println("---------------------------------------------");

            System.out.println("Choose your action:");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("---------------------------------------------");
            System.out.print("Enter your choice: ");

            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (objMush.useMana(10)) {
                            damage = objMush.skillOne(); // Random damage between 30 and 40
                            objKrev.takeDamage(damage);
                            System.out.println("---------------------------------------------------");
                            System.out.println("Musashi uses Soul Pierce! Deals " + damage + " damage.");
                        }
                        break;
                    case 2:
                        if (objMush.useMana(20)) {
                            damage = objMush.skillTwo(); // Random damage between 35 and 45
                            objKrev.takeDamage(damage);
                            System.out.println("Musashi uses Lifeblood Rend! Deals " + damage + " damage.");
                        }
                        break;
                    case 3:
                        if (objMush.useMana(30)) {
                            damage = objMush.skillThree(); // Random damage between 40 and 50
                            objKrev.takeDamage(damage);
                            System.out.println("Musashi uses Demon Fang Strike! Deals " + damage + " damage.");
                        }
                        break;
                    case 4:
                        damage = objMush.oneHitDelete();
                        objKrev.takeDamage(damage);
                        System.out.println("Musashi uses ONE HIT DELETE! Deals " + damage + " damage.");
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                if (objKrev.getHealth() > 0) {
                    int enemyDamage = (int) (Math.random() * 15) + 10;  // Random damage between 10 and 25
                    objMush.takeDamage(enemyDamage);
                    System.out.println(objKrev.getName() + " strikes! Deals " + enemyDamage + " damage to Musashi.");
                }

                System.out.println("------------------------------------");

                if (objKrev.getHealth() <= 0) {
                    System.out.println("Musashi has defeated " + objKrev.getName() + "! He has earned his freedom.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        int coinsEarned = 300 + (int)(Math.random() * 301);
        coins += coinsEarned;

        int[] potions = openShop.Shop(scanner, coins); // Capture the returned potions
        int healingPotions = potions[0]; // First element is healing potions
        int manaPotions = potions[1]; // Second element is mana potions

        // Pass the potions to the second battle
        System.out.println("Healing Potions: "+healingPotions);
        Battle2 battle2 = new Battle2();
        battle2.secondBattle(thorn, healingPotions, manaPotions);
    }

    public static void main(String[] args) {
        GAME game = new GAME();
        game.start();
    }
}
