package com.detroitlabs.mortalkombatroshambo.Model;

public class MortalKombatCharacter {

    private String characterName;
    private String description;

    public MortalKombatCharacter(String characterName, String description) {
        this.characterName = characterName;
        this.description = description;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "character name-'" + characterName + '\'' +
                ", description -'" + description;
    }
}
