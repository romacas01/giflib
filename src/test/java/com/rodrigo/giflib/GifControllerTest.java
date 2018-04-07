package com.rodrigo.giflib;

import com.rodrigo.giflib.controller.GifController;
import com.rodrigo.giflib.data.GifRepository;
import com.rodrigo.giflib.model.Gif;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import java.time.LocalDate;

import static org.hamcrest.core.IsInstanceOf.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GifControllerTest {

    @Mock
    GifRepository gifRepository;

    @InjectMocks
    GifController gifController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

//    @Test
//    public void testListGifs() {
//
//        Assert.assertEquals(gifController.listGiffs(), "home");
//    }

    @Test
    public void testShowgif() {

        Gif gif = new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", false);

        gifRepository = mock(GifRepository.class);

        when(gifRepository.findByname(anyString())).thenReturn(gif);

        ModelMap modelMap = new ModelMap();
        Assert.assertEquals(gifController.showGif("android-explosion", modelMap), "gif-details");
        Assert.assertTrue(modelMap.containsAttribute("gif"));
    }
}
