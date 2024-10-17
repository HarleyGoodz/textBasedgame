package textBasedGame;

import java.util.Scanner;

public class GAME{
    private Player player;
    private Enemy enemy;
    
    Scanner scanner = new Scanner(System.in);
    

    public GAME() {
        
        this.player = new Player("Musashi Miyamoto", 100, 100); 
        this.enemy = new Enemy("Krev Malak", 100); 
    }
    
    

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
        System.out.println("You begin as Musashi Miyamoto (The Cursed Assassin).");
        System.out.println("In a world consumed by chaos and darkness, where the line between life and death has long since blurred...");
        System.out.println("He embarks on a perilous journey, his fate bound by the weight of an unbroken curse.");
        System.out.println("Now, the battle approaches. Before him stands " + enemy.getName() + ", the God of Despair!");

        System.out.println("Press Enter to continue.");
        scanner.nextLine();

        turnBasedBattle();
    }

    private void turnBasedBattle() {
        while (enemy.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println(player);
            System.out.println(enemy);

            System.out.println("Choose your action:");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.print("Enter your choice: ");

            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (player.useMana(10)) {
                            damage = 30 + (int)(Math.random() * 11); // Random damage between 30 and 40
                            enemy.takeDamage(damage);
                            System.out.println("Musashi uses Soul Pierce! Deals " + damage + " damage.");
                        }
                        break;
                    case 2:
                        if (player.useMana(20)) {
                            damage = 35 + (int)(Math.random() * 11); // Random damage between 35 and 45
                            enemy.takeDamage(damage);
                            System.out.println("Musashi uses Lifeblood Rend! Deals " + damage + " damage.");
                        }
                        break;
                    case 3:
                        if (player.useMana(30)) {
                            damage = 40 + (int)(Math.random() * 11); // Random damage between 40 and 50
                            enemy.takeDamage(damage);
                            System.out.println("Musashi uses Demon Fang Strike! Deals " + damage + " damage.");
                        }
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (enemy.getHealth() > 0) {
                    int enemyDamage = (int) (Math.random() * 15) + 10;  // Random damage between 10 and 25
                    player.takeDamage(enemyDamage);
                    System.out.println(enemy.getName() + " strikes! Deals " + enemyDamage + " damage to Musashi.");
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (player.getHealth() <= 0) {
                    System.out.println("Musashi has fallen. " + enemy.getName() + " prevails.");
                    break;
                } else if (enemy.getHealth() <= 0) {
                    System.out.println("Musashi has defeated " + enemy.getName() + "! He has earned his freedom.");
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

    public static void main(String[] args) {
        GAME game = new GAME();
        game.start();
    }
}