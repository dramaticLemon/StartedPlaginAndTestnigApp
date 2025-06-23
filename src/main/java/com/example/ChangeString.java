package com.example;

public class ChangeString {

    public String changer(Type typeChange, String string) {
        if (typeChange == Type.LOWER) {
            return changeEngineLowerCase(string);
        } else {
            return changeEngineUpperCase(string);
        }
    }

    private String changeEngineUpperCase(String string) {
        return string.toUpperCase();
    }

    private String changeEngineLowerCase(String string) {
        return string.toLowerCase();
    }
}
