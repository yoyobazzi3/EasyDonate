package StrategyPattern;
//The Strategy pattern is used to create a family of algorithms, encapsulate
// each one, and make them interchangeable. Strategy lets the algorithm vary
// independently from clients that use it.
public interface Strategy {
    public int doOperation(int num1, int num2);
}

