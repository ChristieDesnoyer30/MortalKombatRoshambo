package com.detroitlabs.mortalkombatroshambo.Repository;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class RoshamboRepostioryTest {

    private RoshamboRepostiory roshamboRepostiory;

    @Before
    public void create(){
        roshamboRepostiory = new RoshamboRepostiory();
    }

    @Test
    public void findPlayersChoice() {
        //Act
        String rockResult = roshamboRepostiory.findPlayersChoice("rock");
        String paperResult = roshamboRepostiory.findPlayersChoice("paper");
        String scissorsResult = roshamboRepostiory.findPlayersChoice("scissors");

        //Assert
        assertThat(rockResult, equalTo("Rock"));
        assertThat(paperResult, equalTo("Paper"));
        assertThat(scissorsResult, equalTo("Scissors"));
    }

    @Test
    public void findComputerPlayerChoice() {
        //Act
        String rockResult = roshamboRepostiory.findComputerPlayerChoice(0);
        String paperResult = roshamboRepostiory.findComputerPlayerChoice(1);
        String scissorsResult = roshamboRepostiory.findComputerPlayerChoice(2);

        //Assert
        assertThat(rockResult, equalTo("Rock"));
        assertThat(paperResult, equalTo("Paper"));
        assertThat(scissorsResult, equalTo("Scissors"));
    }

    @Test
    public void findGameOutcome() {
        //Act
        String tieResult = roshamboRepostiory.findGameOutcome("Rock", "Rock");
        String winRockResult = roshamboRepostiory.findGameOutcome("Rock", "Scissors");
        String winPaperResult = roshamboRepostiory.findGameOutcome("Paper", "Rock");
        String winScissorsResult = roshamboRepostiory.findGameOutcome("Scissors", "Paper");
        String loseResult = roshamboRepostiory.findGameOutcome("Rock", "Paper");

        //Assert
        assertThat(tieResult, equalTo("Tie!"));
        assertThat(winRockResult, equalTo("Player Wins!!!"));
        assertThat(winPaperResult, equalTo("Player Wins!!!"));
        assertThat(winScissorsResult, equalTo("Player Wins!!!"));
        assertThat(loseResult, equalTo("Computer Wins..."));
    }
}