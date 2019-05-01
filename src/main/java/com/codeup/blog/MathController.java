package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number}/and/{numberTwo}")
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int numberTwo){
        return number + "+" + numberTwo + "=" + (number + numberTwo);
    }
    @GetMapping("/subtract/{number}/from/{numberTwo}")
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int numberTwo){
        return numberTwo + "-" + number + "=" + (numberTwo - number);
    }
    @GetMapping("/multiply/{number}/and/{numberTwo}")
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int numberTwo){
        return number + "x" + numberTwo + "=" + (number * numberTwo);
    }

    @GetMapping("/divide/{number}/by/{numberTwo}")
    @ResponseBody
    public String divide(@PathVariable int number, @PathVariable int numberTwo){
        return number + "/" + numberTwo + "=" + (number / numberTwo);
    }

}
