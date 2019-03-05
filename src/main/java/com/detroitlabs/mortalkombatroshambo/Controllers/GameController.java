package com.detroitlabs.mortalkombatroshambo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class GameController {

    @RequestMapping("game")
    public ModelAndView showGamePage(){
        ModelAndView mv = new ModelAndView("game");

        return mv;
    }
}
