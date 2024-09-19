package com.fpmislata.examen3eval.controller;

import com.fpmislata.examen3eval.common.container.DirectorIOC;
import com.fpmislata.examen3eval.common.container.GameIOC;
import com.fpmislata.examen3eval.domain.service.DirectorService;
import com.fpmislata.examen3eval.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/directors")
public class DirectorController {
    private final DirectorService directorService;
    private final GameService gameService;
    public DirectorController() {
        this.directorService = DirectorIOC.getDirectorService();
        this.gameService = GameIOC.getGameService();
    }
    @GetMapping("")
    public String findAll(Model model){
        model.addAttribute("directorList",directorService.findAll());
        return "directorList";
    }
    @GetMapping("/{director_id}/games")
    public String findByDirectorId(Model model, @PathVariable int director_id){
        model.addAttribute("gameList",gameService.findByDirector(director_id));
        return "gameList";
    }

}
