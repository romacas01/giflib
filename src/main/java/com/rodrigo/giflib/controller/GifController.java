package com.rodrigo.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping("/")
    @ResponseBody
    public String listGiffs() {
        return "Listing all the gifs";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String showGif() {
        return "Displaying one gif";
    }
}
