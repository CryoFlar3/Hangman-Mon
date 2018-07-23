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

        System.out.print("Enter a letter: ");
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        return isHit = game.applyGuess(guess);
    }
}
