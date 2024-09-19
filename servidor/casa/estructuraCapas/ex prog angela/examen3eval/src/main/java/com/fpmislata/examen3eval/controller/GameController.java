package com.fpmislata.examen3eval.controller;

import com.fpmislata.examen3eval.common.container.GameIOC;
import com.fpmislata.examen3eval.domain.entity.Character;
import com.fpmislata.examen3eval.domain.entity.Director;
import com.fpmislata.examen3eval.domain.entity.Game;
import com.fpmislata.examen3eval.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    public GameController() {
        this.gameService = GameIOC.getGameService();
    }

    @GetMapping("")
    public String findAll(Model model){
        model.addAttribute("gameList",gameService.findAll());
        return "gameList";
    }

    @GetMapping("/{game_code}")
    public String findByGameCode(Model model, @PathVariable String game_code){
        model.addAttribute("game",gameService.findByGameCode(game_code));
        return "gameDetail";
    }

    @PostMapping("")
    public String save(){
        Game game = new Game("MI3-2022","Return to Monkey Island",2022,"A new adventure of Guybrush Threepwood",
                new Director(1, null, null) );
        List<Character> characterList = List.of(new Character(1, null, null, null),new Character(2, null, null, null),new Character(3, null, null, null));
        game.setCharacterList(characterList);
        gameService.insert(game);
        return "redirect:/games";
    }
}
