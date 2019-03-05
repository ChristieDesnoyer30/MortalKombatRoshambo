package com.detroitlabs.mortalkombatroshambo.Repository;

import com.detroitlabs.mortalkombatroshambo.Model.MortalKombatCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MortalKombatRepositoryTest {

    MortalKombatRepository mortalKombatRepository;

    @Before
    public void create(){
        mortalKombatRepository = new MortalKombatRepository();
    }

    @Test
    public void findPlayersCharacter() {
        //Act
        MortalKombatCharacter character = mortalKombatRepository.findPlayersCharacter("Liu Kang");

        //Assert
        assertThat(character, equalTo(mortalKombatRepository.showAllMortalKombatCharacters().get(0)));
    }
}