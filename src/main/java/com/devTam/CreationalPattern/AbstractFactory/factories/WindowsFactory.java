package com.devTam.CreationalPattern.AbstractFactory.factories;

import com.devTam.CreationalPattern.AbstractFactory.button.Button;
import com.devTam.CreationalPattern.AbstractFactory.button.WindowsButton;
import com.devTam.CreationalPattern.AbstractFactory.checkboxes.Checkbox;
import com.devTam.CreationalPattern.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}