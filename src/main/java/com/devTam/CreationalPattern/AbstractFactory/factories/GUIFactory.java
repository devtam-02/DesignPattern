package com.devTam.CreationalPattern.AbstractFactory.factories;

import com.devTam.CreationalPattern.AbstractFactory.button.Button;
import com.devTam.CreationalPattern.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
