/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class openShop {
    public void Shop(Scanner scanner, Inventory objIn) {
        System.out.println("-------------------------------------------");
        System.out.println("After a fierce battle, you are now taking a break in the shop.");
        System.out.println("-------------------------------------------");
        System.out.println("You have " + objIn.getGold() + " gold.");
        System.out.println("Items available for purchase:");
        System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
        System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");

        while (true) {
            try {
                System.out.print("Enter the number of the item you'd like to buy (or 0 to exit): ");
                int itemChoice = scanner.nextInt();

                if (itemChoice == 1 && objIn.getGold() >= 100) {
                    objIn.useGold(100);
                    System.out.println("You bought a Healing Potion!");
                    objIn.IncItemOneCount();
                } else if (itemChoice == 2 && objIn.getGold() >= 100) {
                    objIn.useGold(100);
                    System.out.println("You bought a Mana Potion!");
                    objIn.IncItemTwoCount();
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

    }
}




