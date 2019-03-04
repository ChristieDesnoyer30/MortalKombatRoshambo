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
}

