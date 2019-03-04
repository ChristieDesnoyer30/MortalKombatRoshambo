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
}