package com.rgbcontrollercr.rgblightcontrollerui;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private ColorPicker clpAdvance;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(clpAdvance.getValue());
        /*
        System.out.println("setting the first led to clpAdvance value then advancing to next pixel")
        ledStrip.setPixelColor(ledIndex, LedStrip.PixelColor.clpAdvance.getValue());
        // store RGB value @ var ledIndex at this point led index will be 0, so the first LED
        if (ledIndex <= ledStrip.pixels) { // ledIndex++; } else { ledIndex = 0; }
        ledStrip.render();
        delay(1000);
        */
        System.out.println("I am a working button!");

        // as a very basic implementation this should be able to set the value of the first LED then move to the next.
    }
}