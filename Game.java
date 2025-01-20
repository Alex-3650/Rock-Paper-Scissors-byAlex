import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;



public class Game {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Rock-Paper-Scissors game!");
        System.out.println("Enter your choice: Rock,Paper or Scissors (type \"exit\" to quit)");
        String [] choices = {"Rock", "Paper", "Scissors"};

       while (true){
           System.out.print("Enter your choice: ");
           String playerChoice = scanner.nextLine();
           if (playerChoice.equals("exit")){
               System.out.printf("Thanks for playing!%nGoodbye!");
               break;
           }

          String computerChoice = choices[random.nextInt(3)];
           System.out.println("Computer chose: " + computerChoice);

           if (playerChoice.equals(computerChoice)){

               System.out.println("It is a draw!");

           }
           else if(
                   (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))

           ){
               System.out.println("You won!");
           }
           else {
               System.out.println("Computer won!");
           }
           System.out.println();

       }

    }
}