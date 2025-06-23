package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyFirstJUnitTests {
    private final ChangeString changeString = new ChangeString();

    @Test
    @DisplayName("upper -> UPPER")
    void toUpper() {
        assertEquals("UPPER", changeString.changer(Type.UPPER, "upper"));
    }

    @Test
    @DisplayName("LOWER -> lower")
    void toLower() {
        assertEquals("lower", changeString.changer(Type.LOWER, "LOWER"));
    }

}
