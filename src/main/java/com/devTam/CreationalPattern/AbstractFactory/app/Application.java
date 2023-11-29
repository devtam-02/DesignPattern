package com.devTam.CreationalPattern.AbstractFactory.app;

import com.devTam.CreationalPattern.AbstractFactory.button.Button;
import com.devTam.CreationalPattern.AbstractFactory.checkboxes.Checkbox;
import com.devTam.CreationalPattern.AbstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
