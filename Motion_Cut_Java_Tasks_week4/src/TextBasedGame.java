import java.util.Scanner;

public class TextBasedGame {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        do {
        	gameinit(scanner);
            System.out.println("---------------------------------------------------- ");
            System.out.println("Do you want to play again? (1 for yes, 0 for no): ");
            int playAgain = Validation(scanner, 0, 1);

            if (playAgain == 0) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        } while (true);
        
        scanner.close();//cleanup
    }
    // 3 Worm Holes 3 Right destinations
    //POST APOCALYPTIC EARTH
    //THE HUMAN CIVILIZATION LIVES IN THE ARTIFICIAL EARTH (ROTATING SPACE STATION)
    private static void gameinit(Scanner scanner) {
        System.out.println("-:- COSMIC QUEST -:-");    
        System.out.println("Welcome, Astronaut! You are stranded alone in space with 3 wormholes in front you.");
        System.out.println("Choose a WORMHOLE to explore ");
        System.out.println("1. Xenobiota");
        System.out.println("2. Quandry");
        System.out.println("3. Pantheon");
        int choice = Validation(scanner, 1, 3);

        switch (choice) {
            case 1:
                Xenobiota();
                break;
            case 2:
                Quandry();
                break;
            case 3:
                Pantheon();
                break;
            default:
                System.out.println("Invalid choice. Exiting the game.");
        }
    }
    private static int Validation(Scanner scanner, int min, int max) {//validation
        int choice;
        do {
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice < min || choice > max) {//condition
                System.out.println("Invalid choice. Please choose between " + min + " and " + max + ".");
            }
        } while (choice < min || choice > max);//repeat until valid input
        return choice;
    } 
    private static int Validation2(Scanner scanner, int one, int two, int three) {//same operation but with 3 valid inputs
        int choice;
        do {
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice!= one && choice != two && choice != three) {
                System.out.println("Invalid choice. Please choose between " + one + " and " + three + ".");
            }
        } while (choice!= one && choice != two && choice != three);
        return choice;
    } 

    //Worm hole 1 (contains 1 correct solution)
    private static void Xenobiota() {
        System.out.println("You enter the Wormhole Xenobiota and find a peaceful alien civilization.");
        System.out.println("They offer you advanced technology and knowledge. What do you do?");
        System.out.println("1. Accept their offer and form an alliance.");
        System.out.println("2. Decline their offer in an attempt to seize the Xenobiota's resources to build a new home.");
        int choice = Validation(new Scanner(System.in),1, 2);
        if (choice == 1) {
            System.out.println("Congratulations, you made an intergalactic alliance! The aliens share their knowledge and advancements with you.");
            System.out.println("You have two options:");
            System.out.println("1. Use the alien technology to terraform Earth.");
            System.out.println("2. Persuade the aliens to coexist with humans on Xenobiota");
            int subchoice = Validation(new Scanner(System.in),1,2);
            if (subchoice == 1) {
                System.out.println("You bring back the alien technology to Earth, solving global issues and help terraform Earth for a promising future.");
                System.out.println("You are celebrated as a hero!");
                System.out.println("Congratulations you WON");
            } else {
                System.out.println("The offer is strongly declined and you're urged to exit Xenobiota.");
                System.out.println("GAME OVER");
            }
        } else {
            System.out.println("You prepare for an all out war as the aliens warn you of an impending Cosmic threat.");
            System.out.println("You have two options:");
            System.out.println("1. Return to your Artificial Earth (Rotating Space staion) and prepare for the threat with the stolen alien tech from Xenobiota.");
            System.out.println("2. Convince other nations to join forces and face the Cosmic threat together.");
            int subChoice = Validation(new Scanner(System.in),1,2);
            if (subChoice == 1) {
                System.out.println("You return to Artificial Earth to prepare for the Cosmic threat, but unfortunately lose the battle. Better luck next time.");
                System.out.println("GAME OVER");
            } else {
                System.out.println("Sadly the manmade weaponries are not sufficient to undermine an army of intergalactic space warriors with superior arms.");
                System.out.println("GAME OVER");
            }
        }
    }
    
    //Worm hole 2 (contains 1 correct solution)
    private static void Quandry() {
        System.out.println("You step into the Wormhole Quandry and encounter a space-time anomaly.");
        System.out.println("It severely damages your space ship. What do you do?");
        System.out.println("1. Attempt to repair the ship.");
        System.out.println("2. Abandon the ship and use your space suit to navigate.");
        int choice = Validation(new Scanner(System.in),1,2);
        if (choice == 1) {
            System.out.println("You attempt to repair the ship, but the situation worsens.");
            System.out.println("You have two options:");
            System.out.println("1. Continue repairing the ship against all odds.");
            System.out.println("2. Engage stealth mode and initiate a distress signal.");
            System.out.println("3. Consult the Ship's AI to scan the area for potential solutions.");
            int subchoice = Validation2(new Scanner(System.in),1,2,3);
            if (subchoice == 1) {
                System.out.println("Despite the challenges, you successfully repair the ship. You continue your space journey!");
                System.out.println("You find a planet orbiting a binary star system in the habitable zone");
                System.out.println("Do you wish to explore the planet?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int ch = Validation(new Scanner(System.in),1,2);
                if(ch == 1) {
                	System.out.println("You get into the planet's lower orbit and land safely, but your ship is attacked by the indigenous and you're shortly eliminated.");
                	System.out.println("GAME OVER");
                }
                else {
                	System.out.println("While turning your ship around, you get caught in the strong gravitational force of the stars, and is torn apart. Better luck next time");
                	System.out.println("GAME OVER");
                }
            }
            else if (subchoice == 2) {
            	System.out.println("You wait and wait and wait, indefinitely but get no response back. You finally rest in solitaire all alone");
            	System.out.println("GAME OVER");
            }
            else{
                System.out.println("The Ship's AI picks up anonymous heat signatures and you follow the source.");
                System.out.println("You encounter a mysterious Cosmic humanoid entity. What do you do?");
                System.out.println("1. Attempt to communicate with the entity.");
                System.out.println("2. Avoid the entity and continue drifting.");
                int Echoice = Validation(new Scanner(System.in), 1,2);
                if (Echoice ==1) {
                    System.out.println("You communicate via actions and weirdly enough it decides to come forward and touch you");
                    System.out.println("You are bestowed with an enormous unprecedented extra dimensional knowledge that your mind crumbles");
                    System.out.println("You succumb to the overwhelming knowledge and cease to exist as your brain is incapable to process such exotic information. ");
                    System.out.println("GAME OVER");
                } else {
                    System.out.println("You avoid the entity, and drift all alone in the space helpless");
                    System.out.println("In the end, you encounter your conclusion and depart definitively.");
                    System.out.println("GAME OVER");
                }
            }
        } else {
            System.out.println("You abandon the damaged ship and use your space suit to navigate through space.");
            System.out.println("While drifting, you encounter a group of rogue space pirates. What do you do?");
            System.out.println("1. Try to negotiate with the space pirates.");
            System.out.println("2. Evade the space pirates and continue drifting.");
            int Pchoice = Validation(new Scanner(System.in),1,2);
            if (Pchoice == 1) {
                System.out.println("Your advanced ship impress the space pirates. They become your allies in return for your ship's powerful engine, and you embark on space adventures together!");
                System.out.println("They show you the ways of the Cosmos, and Ultimately help you find a Super Earth.");
                System.out.println("Congratulations you found a new HOME!");
            } else {
                System.out.println("Having skillfully dodged the space pirates, you find yourself in the treacherous grip of an asteroid belt."); 
                System.out.println("An unfortunate turn that may spell your ultimate demise.!");
                System.out.println("GAME OVER");
            }
        }
    }
    
    //Worm hole 3 (contains 1 correct solution)
    private static void Pantheon() {
        System.out.println("You venture into the Wormhole Pantheon and discover a deserted space station.");
        System.out.println("As you explore, you find an advanced luminous and sparkling ORB. What do you do?");
        System.out.println("1. Try to dissect the ORB, in an attempt to find an unlimited energy source");
        System.out.println("2. Bring the ORB back to Artificial Earth (rotating space station) for a better study.");
        int choice = Validation(new Scanner(System.in),1,2);
        if (choice == 1) {
            System.out.println("You examine the ORB with the help of the Ship's AI and are successful in finding an unlimited energy source");
            System.out.println("A device that uses nuclear fusion!. What do you do?");
            System.out.println("1. Integrate the new tech to your ship for further space cruise");
            System.out.println("2. Use it to amplify your distress signal to attract alien life forms");
            int subchoice = Validation(new Scanner(System.in),1,2);
            if (subchoice == 1) {
                System.out.println("Oncourse of you integrating the ORB in your advanced space ship.");
                System.out.println("You disrupt the equilibrium of the fusion reaction which causes a huge explosion, devouring anything in close vicinity.");
                System.out.println("GAME OVER");
            } else {
                System.out.println("The signal attracts unpleasant visitors, who were cruising around the Cosmos");
                System.out.println("They snatch you off your newly found tech, and the engine of your advanced space ship. Better luck next time");
                System.out.println("GAME OVER");
            }
        } else {
            System.out.println("Shortly after you enter the Pantheon wormhole, The ORB reacts negatively to the dark energy that helps maintain the wormhole's stability");
            System.out.println("The Ship is getting torn apart!!!!, Think fast!");
            System.out.println("1. Continue moving forward, with the risk of you not making it?");
            System.out.println("2. Turn back and exit the wormhole, think about a safe alternative");
            int wchoice = Validation(new Scanner(System.in),1,2);
            if (wchoice == 1) {
            	System.out.println("Despite all the odds of your survival, you eventually make it through the wormhole Pantheon");
            	System.out.println("Upon bringing back the ORB to Earth and performing extensive research and experimentations");
            	System.out.println("The ORB is proved to be the pinnacle of clean & unlimited energy source.");
            	System.out.println("Humans use it's energy to reside in Europa, one of Jupiter's moons");
            	System.out.println("Congratulations you are proclaimed as an intergalactic Hero!.");
            } else {
                System.out.println("You try to turn the ship around but get sucked into the walls of Pantheon. You crash land into a rogue planet");
                System.out.println("You sustain great injuries, coupled with extreme cold temperatures instantly claim your life and you drift in the cold dark space forever.");
                System.out.println("GAME OVER");
            }
        }
    }
}
