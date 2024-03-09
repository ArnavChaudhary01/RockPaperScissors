import java.util.Random;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock");
        System.out.println("Enter 1 for paper");
        System.out.println("Enter 2 for Scissor");

        System.out.print("Choose your number : ");
        int UserInput = sc.nextInt();

        Random randomNumber = new Random();
        int ComputerInput = randomNumber.nextInt(3);

        if(UserInput == 0){
            System.out.println("Your choice : Rock");
        }
        else if(UserInput == 1){
            System.out.println("Your choice : Paper");
        }
        else{
            System.out.println("Your choice : Scissors");
        }

        if(ComputerInput == 0){
            System.out.println("Computer choice : Rock");
        }
        else if(ComputerInput == 1){
            System.out.println("Computer choice : Paper");
        }
        else{
            System.out.println("Computer choice : Scissors");
        }

        if(UserInput == ComputerInput){
            System.out.println("Draw");
        }
        else if(UserInput == 0 && ComputerInput == 2 || UserInput == 1 && ComputerInput == 0 || UserInput == 2 && ComputerInput == 1){
            System.out.println("You Win!");
        }
        else{
            System.out.println("You Loose!");
        }
    }
}
