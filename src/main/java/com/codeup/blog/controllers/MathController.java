package com.codeup.blog.controllers;

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


    /* Another way to write add method
    int: primitive data type, good for
    Integer: much larger functionality, good for playing with a number

    public String add(@PathVariable Integer number, @PathVariable Integer numberTwo){
        return String.valueOf(number + numberTwo);
    }*/


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

    /* If using double you may need to set return value to a certain number of decimal places


    public double divide(@PathVariable double number, @PathVariable double numberTwo){
        return number/numberTwo;
    }*/


/*    @GetMapping("roll-dice")
    public String guessNumber(){

    }*/

}
