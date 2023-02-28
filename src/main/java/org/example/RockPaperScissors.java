package org.example;


//Create a rock paper scissors game between user and computer in java that is a best out of 1 in the main function using a switch statement.
public class RockPaperScissors {
    public static void main(String[] args) {
        int userChoice;
        int computerChoice = (int) (Math.random() * 3) + 1;
        System.out.println("Rock, Paper, Scissors");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("Enter your choice: ");
        userChoice = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        switch (userChoice) {
            case 1:
                System.out.println("You chose Rock");
                if (computerChoice == 1) {
                    System.out.println("Computer chose Rock");
                    System.out.println("It's a tie");
                } else if (computerChoice == 2) {
                    System.out.println("Computer chose Paper");
                    System.out.println("You lose");
                } else if (computerChoice == 3) {
                    System.out.println("Computer chose Scissors");
                    System.out.println("You win");
                }
                break;
            case 2:
                System.out.println("You chose Paper");
                if (computerChoice == 1) {
                    System.out.println("Computer chose Rock");
                    System.out.println("You win");
                } else if (computerChoice == 2) {
                    System.out.println("Computer chose Paper");
                    System.out.println("It's a tie");
                } else if (computerChoice == 3) {
                    System.out.println("Computer chose Scissors");
                    System.out.println("You lose");
                }
                break;
            case 3:
                System.out.println("You chose Scissors");
                if (computerChoice == 1) {
                    System.out.println("Computer chose Rock");
                    System.out.println("You lose");
                }
                if (computerChoice == 2) {
                    System.out.println("Computer chose Paper");
                    System.out.println("You win");
                }
                if (computerChoice == 3) {
                    System.out.println("Computer chose Scissors");
                    System.out.println("It's a tie");
                }
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
