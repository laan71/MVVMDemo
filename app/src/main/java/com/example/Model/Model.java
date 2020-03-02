package com.example.Model;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {

    private String text;

    public Model() {
        text = "Hello World";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null)
            return;

        this.text = text;

        super.setChanged();
        super.notifyObservers();
    }
}


