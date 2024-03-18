package DesignPatterns;
/*
Factory Method Pattern
The Factory Method Pattern defines an interface for creating an object but lets subclasses
alter the type of objects that will be created. This pattern is used when a class cannot
anticipate the class of objects it must create.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }

    public abstract Button createButton();
}

