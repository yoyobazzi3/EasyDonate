package DesignPatterns;

public class WebButton  implements Button{

    public  void render(){
        System.out.println("Render a button html style");
    }
    public void onClick(){
        System.out.println("Bind a web browser click event");
    }
}
