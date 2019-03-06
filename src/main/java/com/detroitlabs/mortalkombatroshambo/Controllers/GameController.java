package com.detroitlabs.mortalkombatroshambo.Controllers;

import com.detroitlabs.mortalkombatroshambo.Model.MortalKombatCharacter;
import com.detroitlabs.mortalkombatroshambo.Model.Player;
import com.detroitlabs.mortalkombatroshambo.Repository.MortalKombatRepository;
import com.detroitlabs.mortalkombatroshambo.Repository.RoshamboRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class GameController {

    Player player;

    @Autowired
    RoshamboRepostiory roshamboRepostiory;

    @Autowired
    MortalKombatRepository mortalKombatRepository;

    @RequestMapping("createplayer")
    public ModelAndView showGamePage(@RequestParam("character") String characterName){
        ModelAndView mv = new ModelAndView("game");
        MortalKombatCharacter playersCharacter = mortalKombatRepository.findPlayersCharacter(characterName);
        MortalKombatCharacter cpuCharacter = mortalKombatRepository.findComputerPlayersCharacter(characterName);
        player = new Player(playersCharacter);
        mv.addObject("player", playersCharacter);
        mv.addObject("computer", cpuCharacter);
        return mv;
    }

    @RequestMapping("throwRoshambo")
    public ModelAndView gameResults(@RequestParam("throwChoice") String roshamboChoice){
        ModelAndView mv = new ModelAndView("results");
        String playerChoice = roshamboRepostiory.findPlayersChoice(roshamboChoice);
        int computerChoice = roshamboRepostiory.generateRandomNumber();
        String compChoice= roshamboRepostiory.findComputerPlayerChoice(computerChoice);
        String outcome = roshamboRepostiory.findGameOutcome(player, roshamboChoice,compChoice);
        int numberOfWins = player.getNumberOfWins();

       mv.addObject("player", playerChoice);
       mv.addObject("computer", compChoice);
       mv.addObject("result", outcome);
       mv.addObject("wins", numberOfWins);

        return mv;
    }

}
