package com.detroitlabs.mortalkombatroshambo.Repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Repository
public class RoshamboRepostiory {
    private static final List<String> ALL_ROSHAMBO_OPTIONS = Arrays.asList("Rock","Paper","Scissors");

    public String findPlayersChoice(String playersChoice){
        for (String choice : ALL_ROSHAMBO_OPTIONS){
            if (choice.equalsIgnoreCase(playersChoice)){
                return choice;
            }
        }

        return null;
    }

    public int generateRandomNumber(){
        Random random = new Random();
        int index = random.nextInt(ALL_ROSHAMBO_OPTIONS.size());

        return index;
    }

    public String findComputerPlayerChoice(int index){
        String choice = ALL_ROSHAMBO_OPTIONS.get(index);

        return choice;
    }

    public String findGameOutcome(String playerChoice, String computerChoice){
        String gameOutcome;
        String rock = ALL_ROSHAMBO_OPTIONS.get(0);
        String paper = ALL_ROSHAMBO_OPTIONS.get(1);
        String scissors = ALL_ROSHAMBO_OPTIONS.get(2);

        if(playerChoice.equals(computerChoice)){
            gameOutcome = "Tie!";
        } else if (playerChoice.equals(rock) && computerChoice.equals(scissors)){
            gameOutcome = "Player Wins!";
        } else if (playerChoice.equals(paper) && computerChoice.equals(rock)){
            gameOutcome = "Player Wins!";
        } else if (playerChoice.equals(scissors) && computerChoice.equals(paper)){
            gameOutcome = "Player Wins!";
        } else {
            gameOutcome = "Computer Wins...";
        }

        return gameOutcome;
    }
}

