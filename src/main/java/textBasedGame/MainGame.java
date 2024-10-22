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
public class MainGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        storyOne objWallOne = new storyOne();
        storyTwo objWallTwo = new storyTwo();
        
        int choice = 0;
        
        boolean isEnabled = true;

        while(isEnabled){
            try {
                System.out.println("The Walls of the Fallen!");
                System.out.println("1. Start");
                System.out.println("2. Exit");
                System.out.print("Enter your choice!: ");
                choice = scan.nextInt();

                if (choice == 1) {
                    System.out.println("The game has started!\n");
                    System.out.println("---------------------------------------");
                    System.out.println();
                    scan.nextLine();  
                    isEnabled = false;  
                } else if (choice == 2) {
                    System.out.println("You have exited the game!");
                    return;  
                } else {
                    System.out.println("Please enter a valid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scan.nextLine();
            }
        }    
        isEnabled = true;
        while(isEnabled){
            try{
                System.out.println("Choose your character:");
                System.out.println("1. Musashi Miyamoto");
                System.out.println("2. Thorfinn");
                System.out.println("3. Gilgamesh");
        
                System.out.print("Enter choice: ");
                choice = scan.nextInt();
                
                isEnabled = false;
            }catch(Exception e){
                System.out.println("Invalid input! Please enter a number.");
                scan.nextLine();
            }
        }
        Player playerCharacter = null;

        switch (choice) {
            case 1:  
                playerCharacter = new Musashi("Musashi Miyamoto", 100, 100);
                playerCharacter.intro();
                
                break;
            case 2:
                playerCharacter = new Thorfinn("Thorfinn", 150, 100);
                playerCharacter.intro();
                
                break;
            case 3:
                playerCharacter = new Gilgamesh("Gilgamesh", 100, 200);
                playerCharacter.intro();
                
                break;
            default:
                System.out.println("Invalid choice.");
               
                return;
        }
        
        objWallOne.wallOne(playerCharacter);
        
        objWallTwo.wallTwo(playerCharacter);
    }
}
