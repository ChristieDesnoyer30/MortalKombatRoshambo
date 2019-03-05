package com.detroitlabs.mortalkombatroshambo.Model;

public class Player {

    private String name;
    private MortalKombatCharacter playersCharacterChoice;
    private int numberOfWins;

    public Player(String name, MortalKombatCharacter playersCharacterChoice) {
        this.name = name;
        this.playersCharacterChoice = playersCharacterChoice;
        this.numberOfWins = 0;
    }

    public Player(MortalKombatCharacter playersCharacterChoice) {
        this.name = "Joe Schmo";
        this.playersCharacterChoice = playersCharacterChoice;
        this.numberOfWins = 0;
    }

    public MortalKombatCharacter getPlayersCharacterChoice() {
        return playersCharacterChoice;
    }

    public void setPlayersCharacterChoice(MortalKombatCharacter playersCharacterChoice) {
        this.playersCharacterChoice = playersCharacterChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    @Override
    public String toString() {
        return "Player " + name +
                ", numberOfWins=" + numberOfWins +
                '}';
    }
}
