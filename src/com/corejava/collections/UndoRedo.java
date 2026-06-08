package com.corejava.collections;

import java.util.Stack;

public class UndoRedo {
    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();

    public static void perform(String action) {
        undoStack.push(action);
        redoStack.clear();
    }

    public static void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(undoStack.pop());
        }
    }

    public static void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(redoStack.pop());
        }
    }

    public static void main(String[] args) {
        perform("A");
        perform("B");
        perform("C");

        undo(); // removes C
        redo(); // adds C back

        System.out.println(undoStack); // [A, B, C]
    }
}