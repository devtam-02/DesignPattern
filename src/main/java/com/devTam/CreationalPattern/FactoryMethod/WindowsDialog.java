package com.devTam.CreationalPattern.FactoryMethod;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
