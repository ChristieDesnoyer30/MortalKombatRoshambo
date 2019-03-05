package com.detroitlabs.mortalkombatroshambo.Controllers;

import com.detroitlabs.mortalkombatroshambo.Repository.RoshamboRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class GameController {
    @Autowired
    RoshamboRepostiory roshamboRepostiory;

    @RequestMapping("createplayer")
    public ModelAndView showGamePage(@RequestParam("character") String characterName){
        ModelAndView mv = new ModelAndView("game");
        System.out.println(characterName);

        return mv;
    }

    @RequestMapping("throw")
    public ModelAndView gameResults(@RequestParam("throw") String roshamboChoice){
        ModelAndView mv = new ModelAndView("results");
        System.out.println(roshamboChoice);
        String playerChoice = roshamboRepostiory.findPlayersChoice(roshamboChoice);
        System.out.println(playerChoice);
        int computerChoice = roshamboRepostiory.generateRandomNumber();
       String compChoice= roshamboRepostiory.findComputerPlayerChoice(computerChoice);
        System.out.println(compChoice);
     String outcome = roshamboRepostiory.findGameOutcome(roshamboChoice,compChoice);
       System.out.println(outcome);

       mv.addObject("player", playerChoice);
       mv.addObject("computer", compChoice);
       mv.addObject("result", outcome);

        return mv;
    }




}
