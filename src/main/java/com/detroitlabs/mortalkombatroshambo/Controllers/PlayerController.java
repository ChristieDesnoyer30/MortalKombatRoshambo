package com.detroitlabs.mortalkombatroshambo.Controllers;

import com.detroitlabs.mortalkombatroshambo.Repository.MortalKombatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayerController {

    @Autowired
    MortalKombatRepository mortalKombatRepository;

    @RequestMapping("/")
    public ModelAndView showHomePage(){
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("players", mortalKombatRepository.showAllMortalKombatCharacters());
        return mv;
    }
}
