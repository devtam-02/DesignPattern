package com.devTam.CreationalPattern.AbstractFactory.factories;

import com.devTam.CreationalPattern.AbstractFactory.button.Button;
import com.devTam.CreationalPattern.AbstractFactory.button.MacOSButton;
import com.devTam.CreationalPattern.AbstractFactory.checkboxes.Checkbox;
import com.devTam.CreationalPattern.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
