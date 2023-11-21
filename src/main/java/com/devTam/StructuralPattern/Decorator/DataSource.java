package com.devTam.StructuralPattern.Decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
