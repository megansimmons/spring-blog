package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String guessNumber(){
        return "roll-dice";
    }
    public int random(){
        Random random = new Random();
        int number = random.nextInt(6) +1;
        return number;
    }
    @GetMapping("/roll-dice/{n}")
    public String result(@PathVariable int n, Model vmodel){
        vmodel.addAttribute("userGuess", n);
        vmodel.addAttribute("random", random());
        return "roll-result";
    }



}
