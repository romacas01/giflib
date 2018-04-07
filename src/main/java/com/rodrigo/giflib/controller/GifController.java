package com.rodrigo.giflib.controller;

import com.rodrigo.giflib.data.GifRepository;
import com.rodrigo.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGiffs(ModelMap modelMap) {

        List<Gif> gifs = gifRepository.findAll();
        modelMap.put("gifs", gifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String showGif(@PathVariable String name, ModelMap modelMap) {

        Gif gif = gifRepository.findByname(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
