package com.rodrigo.giflib;

import com.rodrigo.giflib.controller.GifController;
import org.junit.Assert;
import org.junit.Test;

public class GifControllerTest {

    @Test
    public void testListGifs() {

        GifController gifController = new GifController();

        Assert.assertEquals(gifController.listGiffs(), "Listing all the gifs");
    }

    @Test
    public void testShowgif() {
        GifController gifController = new GifController();

        Assert.assertEquals(gifController.showGif(), "Displaying one gif");
    }
}
