package com.example.mvc;

public class InteractionModel {
    // The index of the box that is under the cursor, or -1 if none
    private int cursorIndex;

    public InteractionModel() {
        // Initialize the cursor index to -1
        cursorIndex = -1;
    }

    public int getCursorIndex() {
        return cursorIndex;
    }


    public void setCursorIndex(int cursorIndex) {
        this.cursorIndex = cursorIndex;
    }
}

