package org.computermentors.NyjelDukes;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new WordList("wordlist.txt"));
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0 && !game.isWon()){
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayOutcome();
    }
}
