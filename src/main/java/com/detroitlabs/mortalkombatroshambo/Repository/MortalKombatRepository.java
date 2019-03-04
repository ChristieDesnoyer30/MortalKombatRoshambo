package com.detroitlabs.mortalkombatroshambo.Repository;

import com.detroitlabs.mortalkombatroshambo.Model.MortalKombatCharacter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MortalKombatRepository {

    private static final List<MortalKombatCharacter> ALL_CHARACTERS = Arrays.asList(
            new MortalKombatCharacter("Liu Kang","Male"
                    ,"Earthrealm-Henan Province, China", "Earthrealm", "Zombie/Spirit"),
            new MortalKombatCharacter("Sonya Blade","Female","Earthrealm - Austin, TX"
                    ,"Earthrealm","Human"),

            new MortalKombatCharacter("Kano", "Male", "Earthrealm"
                    , "Outworld","Human"),
            new MortalKombatCharacter("Raiden", "Male"
                    ,"Heavens","Eartrealm","God"),
            new MortalKombatCharacter("Johnny Cage", "Male", "Earthrealm"
                    , "Earthrealm", "Human"),
            new MortalKombatCharacter("Sub-Zero", "Male", "Earthrealm - China"
                    , "Netherrealm","Wraith"),
            new MortalKombatCharacter("Scorpion","Male",  "Earthrealn - Japan"
                    , "Netherrealm","Human/Spectre"),
            new MortalKombatCharacter("Kitana","Female", "Edenia"
                    ,"Edenia","Edenian")
    );

    public List<MortalKombatCharacter> showAllMortalKombatCharacters(){

        return ALL_CHARACTERS;
    }




}
