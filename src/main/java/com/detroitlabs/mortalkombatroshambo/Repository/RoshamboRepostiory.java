package com.detroitlabs.mortalkombatroshambo.Repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

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
}

