package org.computermentors.NyjelDukes;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("champions");
        Prompter prompter = new Prompter(game);
        if(prompter.promptForGuess()){
            System.out.println("We have a hit!");
        } else {
            System.out.println("We have a miss!");
        }

    }
}
