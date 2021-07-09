import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class GameOfDice {
    public static void main(String[] args){
        /*
        Begin
            Create a variable to hold the total score starting at 0
            Loop as many times as user wants or until total score = 100
                Randomly select two numbers 1 through 6
                Assign one number in variable 1
                Assign the second number in variable 2
                Create a conditional statement to check if one of the variables contains a 1
                    If true: create another condition to check if both variables contain a 1
                        If true: add 25 to total score
                        If false: add nothing to the total score (or do nothing)
                    If false: add the two variables into the total score
                Print out total score
                Prompt the user to ask if they want to continue rolling and end loop if they do not want to continue
            End loop
            Create a condition if total score = 100
                If true print: "You have scored over 100"
            Print "Thank you for playing"
         */
        Scanner keyboard = new Scanner(System.in);
        Random randomizer = new Random();
        int score = 0;
        String control = "yes";
        while (score <= 100 && control.equals("yes")){
            int dice1 = randomizer.nextInt(6) + 1;
            int dice2 = randomizer.nextInt(6) + 1;
            if (dice1 == 1 || dice2 == 1){
                if (dice1 == 1 && dice2 == 1){
                    score += 25;
                }
            }
            else{
                score += dice1 + dice2;
            }
            System.out.printf("Your rolls %d & %d\n", dice1, dice2);
            System.out.println("Score: " + score);
            System.out.print("Roll again (yes/no)? ");
            control = keyboard.next().toLowerCase();
            while (!control.equals("yes") && !control.equals("no")){
                System.out.print("Must enter yes or no: ");
                control = keyboard.next().toLowerCase();
            }
            System.out.print("\n");
        }
        if (score >= 100){
            System.out.println("You have scored 100 or more");
        }
        System.out.println("Thank you for playing!");
    }
}
