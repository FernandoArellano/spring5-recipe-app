package guru.springframework.spring5jokesappv2.controller;


import guru.springframework.spring5jokesappv2.services.JokerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokerService jokerService;

    public JokeController(JokerService jokerService) {
        this.jokerService = jokerService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokerService.getJoke());
        return "index";
    }
}
