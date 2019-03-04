package com.detroitlabs.mortalkombatroshambo.Model;

public class MortalKombatCharacter {

    private String characterName;
    private String gender;
    private String origin;
    private String resides;
    private String species;

    public String getImagePathName(){
        return  getCharacterName().toLowerCase().replace(" ", "");
    }

    public MortalKombatCharacter(String characterName, String gender, String origin
            , String resides, String species) {
        this.characterName = characterName;
        this.gender = gender;
        this.origin = origin;
        this.resides = resides;
        this.species = species;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getResides() {
        return resides;
    }

    public void setResides(String resides) {
        this.resides = resides;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
