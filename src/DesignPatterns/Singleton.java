package DesignPatterns;
/*
The Singleton pattern ensures that a class has only one instance and provides
a global point of access to that instance. It's often used for logging,
driver objects, caching, thread pools, and database connections.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){

        if (instance == null){
            instance = new Singleton()  ;

        }
        return instance;
    }

}
