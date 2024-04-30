package com.example4;

public class UserInterface {

    private Button button;
    private ScrollBar scrollbar;

    public UserInterface(Button button, ScrollBar scrollbar) {
        this.button = button;
        this.scrollbar = scrollbar;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public ScrollBar getScrollbar() {
        return scrollbar;
    }

    public void setScrollbar(ScrollBar scrollbar) {
        this.scrollbar = scrollbar;
    }

    @Override
    public String toString() {
        return "UserInterface{" +
                "button=" + button +
                ", scrollbar=" + scrollbar +
                '}';
    }
}
