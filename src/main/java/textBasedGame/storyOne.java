package textBasedGame;

import java.util.Scanner;

public class storyOne {
    KrevMalak objKrev = new KrevMalak("Krev Malak",150);
    Kappa objKappa = new Kappa("Kappa", 100);
    Hyosube objHyo = new Hyosube("Hyosube", 100);
    Scanner scanner = new Scanner(System.in);
    
    
    

    public void wallOne(Player character, Inventory objIn){
        Scanner scanner = new Scanner(System.in);
        openShop objShop = new openShop(objIn);
        
        System.out.println("-----------------------------------------------");
        System.out.println("Prepare for battle as two of the demons appeared in your path, GET READY TO KILL!\n"
                + "\n press 'Enter' to continue");
        scanner.nextLine();
        
        while (objKappa.getHealth() > 0 && character.getHealth() > 0){
            System.out.println(character.toString());
            System.out.println(objKappa.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
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
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("You're still full in Health! ");
                                continue;
                            }
                            else{
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("You're out of Health Potions!");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("You're still full in Mana!");
                                continue;
                            }
                            else{
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("You're out of Mana Potions!");
                            continue;
                        }
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
                } else if (objKappa.getHealth() <= 0) {
                    System.out.println(character.getName() + " has defeated " + objKappa.getName() + "\n\n");
                    objIn.setGold((int) (Math.random() * (50 - 25 + 1)) + 25);
                    System.out.println(character.getName() + " has earned " + objIn.getGold() + " gold!");
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
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
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
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("You're still full in Health! ");
                                continue;
                            }
                            else{
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("You're out of Health Potions!");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("You're still full in Mana!");
                                continue;
                            }
                            else{
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("You're out of Mana Potions!");
                            continue;
                        }
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
                    System.out.println(character.getName() + " has defeated " + objHyo.getName() + "\n\n");
                    objIn.setGold((int) (Math.random() * (50 - 25 + 1)) + 25);
                    System.out.println(character.getName() + " has earned " + objIn.getGold() + " gold!");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        System.out.println("------------------------------------------");
        System.out.println("After killing the 2 demons that blocked your path... \n"
                + "you continued at your journey, smelling the scent of a godly power...."
                + "\nPress Enter to continue");
        scanner.nextLine();
        
        System.out.println("------------------ARRIVAL!-----------------------");
        System.out.println("You have finally arrived at the hellish domain of KREV MALAK!\n"
                + "press 'Enter' to continue");
        scanner.nextLine();
             
        objKrev.Krev_BackStory();
        objKrev.Krev_IncomingBattle();
    
        while (objKrev.getHealth() > 0 && character.getHealth() > 0) {
            System.out.println(character.toString());
            System.out.println(objKrev.toString());

            System.out.println("---------------------------------------");

            System.out.println("Choose your action:");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, 10 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");

            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
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
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("You're still full in Health! ");
                                continue;
                            }
                            else{
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("You're out of Health Potions!");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("You're still full in Mana!");
                                continue;
                            }
                            else{
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("You're out of Mana Potions!");
                            continue;
                        }
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
                    System.out.println(character.getName() + " has defeated " + objKrev.getName() + "\n\n");
                    objIn.setGold((int) (Math.random() * (250 - 100 + 1)) + 100);
                    System.out.println(character.getName() + " has earned " + objIn.getGold() + " gold!");
                    objKrev.Krev_Defeat();
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        // You can add additional logic here for the shop or continue the game
        objShop.Shop(scanner);
        
        System.out.println("Healing potions: " + objIn.getItemOneCount());
        System.out.println("Mana potions: " + objIn.getItemTwoCount());
    }
    
}