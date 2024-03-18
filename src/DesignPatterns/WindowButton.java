package DesignPatterns;

public class WindowButton implements Button{
    public void render(){
        System.out.println("Render a button in a window style");
    }
    public void onClick(){
        System.out.println("Bind a native window click event");
    }

}
