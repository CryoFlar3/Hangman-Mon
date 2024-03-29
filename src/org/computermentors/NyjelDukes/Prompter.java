package org.computermentors.NyjelDukes;

import java.util.Scanner;

public class Prompter {
    Game game;

    public Prompter(Game game){
        this.game = game;
    }

    public boolean promptForGuess(){
        Scanner scanner = new Scanner(System.in);
        boolean isHit = false;
        boolean isAcceptable = false;

        do {
            System.out.print("Enter a letter: ");
            String guessInput = scanner.nextLine();

            try {
                isHit = game.applyGuess(guessInput);
                isAcceptable = true;
            } catch (IllegalArgumentException iae){
                System.out.printf("%s. Please try again.%n", iae.getMessage());
            }
        }while (!isAcceptable);

        return isHit;
    }

    public void displayProgress(){
        System.out.printf("You have %d tries remaining to solve: %s \n",
                game.getRemainingTries(), game.getCurrentProgress());
    }

    public void displayOutcome(){
        if(game.isWon()){
            System.out.println(game.getAnswer());
            System.out.printf("Congratulations! You won with %d tries left!",
                    game.getRemainingTries());
        } else {
            System.out.printf("Bummer. The correct answer was %s :(", game.getAnswer());
        }
    }

}

























