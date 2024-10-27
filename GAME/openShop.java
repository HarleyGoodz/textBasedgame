package textBasedGame;

import java.util.Scanner;

public class OpenShop {
    private static final int HEALING_POTION_COST = 100;
    private static final int MANA_POTION_COST = 100;

    public static int[] shop(Scanner scanner, int coins) {
        System.out.println("-------------------------------------------");
        System.out.println("After a fierce battle, you are now taking a break in the shop.");
        System.out.println("-------------------------------------------");
        System.out.println("You have " + coins + " coins.");
        System.out.println("Items available for purchase:");
        System.out.println("1. Healing Potion (Restores 50 HP) - " + HEALING_POTION_COST + " Gold");
        System.out.println("2. Mana Potion (Restores 50 Mana) - " + MANA_POTION_COST + " Gold");

        int healingPotions = 0;
        int manaPotions = 0;

        while (true) {
            try {
                System.out.print("Enter the number of the item you'd like to buy (or 0 to exit): ");
                int itemChoice = scanner.nextInt();

                if (itemChoice == 1 && coins >= HEALING_POTION_COST) {
                    coins -= HEALING_POTION_COST;  
                    healingPotions++;
                    System.out.println("You bought a Healing Potion!");
                } else if (itemChoice == 2 && coins >= MANA_POTION_COST) {
                    coins -= MANA_POTION_COST;  
                    manaPotions++;
                    System.out.println("You bought a Mana Potion!");
                } else if (itemChoice == 0) {
                    System.out.println("You have exited the shop.");
                    break;  
                } else {
                    System.out.println("Invalid choice or not enough coins! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  
            }
        }

        return new int[]{healingPotions, manaPotions}; 
    }
}
