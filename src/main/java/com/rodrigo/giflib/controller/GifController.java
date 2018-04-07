package com.rodrigo.giflib.controller;

import com.rodrigo.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGiffs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String showGif(ModelMap modelMap) {

        Gif gif = new Gif("compiler-bot", LocalDate.now(), "username", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
