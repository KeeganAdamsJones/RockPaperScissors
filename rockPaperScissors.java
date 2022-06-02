package rockpaperscissors;

/**
 /*
Keegan Jones
6/1/2022
Rock Paper Scissors



A program that is similar to the popular game titled “Rock-Paper-Scissors.”
The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 
being Paper, and 3 being Scissors. Then, the program is to prompt the user to 
enter a value of R, P, or S. Next, the program displays a clear readable message 
displaying both the computer’s selection, the user’s selection, and the results.
 */


import java.util.Scanner; //import scanner to recieve input

public class RockPaperScissors {

    public static void main(String[] args) {
        // 1. Computer picks a random number
        // 2. User will make selection or R,P,S or Q.
        // 3. Program will evaluate who won.
        
        
        //Greet player
        System.out.println("\n\nHello, Welcome to Rock, Paper, Scissors!\n\n");
        
        
        while (true){
          
            // Prompt the user to enter R for rock, P for paper, or S for scissors 
            System.out.print
                ("Please enter your selection: \n");        
            System.out.print
                ("\tR for rock, P for paper or S for scissors. (If you no longer wish to play select Q.)  \n\n");
           

            // New scanner object to take input selection from player
            Scanner input = new Scanner(System.in);
            String selection = input.next();

             
            //Validate the user input before the evaluation If structure
            if(selection.equalsIgnoreCase("Q")) {
               System.out.println("Thank you for playing.  Goodbye!");
               return;
            }

            if(!selection.equalsIgnoreCase("P") &&
               !selection.equalsIgnoreCase("S") && 
               !selection.equalsIgnoreCase("R")){
                System.out.println("You have made an invalid selection.");
                continue;
            }
            
            // Generate random single digit integer
            int number = (int)(Math.random() * 4);
            
            // ** Nested If structure to evaluate results **
            // Computer chose Rock - (computer generated random number)
            if (number == 1){ 
                if(selection.equalsIgnoreCase("R")){
                    System.out.println("\t\t\tYou both chose rock, you have a tie!\n\n");
                }
                else if(selection.equalsIgnoreCase("P")){
                    System.out.println("\t\t\tThe computer chose rock and you chose paper.\n"
                        + "\t\t\tPaper covers rock, you win!\n\n");
                }
                else if(selection.equalsIgnoreCase("S")){
                    System.out.println("\t\t\tThe computer chose rock and you chose scissors.\n"
                        + "\t\t\tRock crushes scissors, you lose.\n\n");
                }
            }
            
            // Computer chose Paper - (computer generated random number)
            else if (number == 2){
                if(selection.equalsIgnoreCase("R")){
                    System.out.println("\t\t\tThe computer chose paper and you chose rock.\n"
                        + "\t\t\tPaper covers rock, you lose.\n\n");
                }
                else if(selection.equalsIgnoreCase("P")){
                    System.out.println("\t\t\tYou both chose paper, you have a tie!\n");
                }
                else if(selection.equalsIgnoreCase("S")){
                    System.out.println("\t\t\tThe computer chose paper and your chose scissors.\n"
                        + "\t\t\tScissors cuts paper, you win!\n\n");
                }
            }
            
            // Computer chose Scissors - (computer generated random number)
            else if (number == 3){ 
                if(selection.equalsIgnoreCase("R")){
                    System.out.println("\t\t\tThe computer chose scissors and you chose rock.\n"
                        + "\t\t\tRock crushes scissors, you win!\n\n");
                }
                else if(selection.equalsIgnoreCase("P")){
                    System.out.println("\t\t\tThe computer chose scissors and you chose paper.\n"
                        + "\t\t\tScissors cut paper, you lose.\n\n");
                }
                else if(selection.equalsIgnoreCase("S")){
                    System.out.println("\t\t\tYou both chose scissors, you have a tie!\n"); 
                }
            }
            
        }
        
    }
    
}

