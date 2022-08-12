package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private boolean[] changeLetters;

    @Test
    void runMain_changeLetters_ArrayList() {
        MainTest runMain = new MainTest();
        ArrayList<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add("");
        assertArrayEquals(expectedOutPut, runMain.changeLetters);
    }

    private void assertArrayEquals(ArrayList<Object> expectedOutPut, boolean[] changeLetters) {
    }
}