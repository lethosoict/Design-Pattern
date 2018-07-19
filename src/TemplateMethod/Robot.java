package TemplateMethod;

/**
 * Created by Phoebus Gannicus on 7/19/2018.
 */
public class Robot {
    public Robot(){

    }

    public void go(){
        start();
        getParts();
        assemble();
        test();
        Stop();
    }

    public void start(){
        System.out.println("Starting ...");
    }

    public void getParts(){
        System.out.println("Getting a carburetor ...");
    }

    public void assemble(){
        System.out.println("Installing a carburetor ...");
    }

    public void test(){
        System.out.println("Revving the engine ...");
    }

    public void Stop(){
        System.out.println("Stopping ...");
    }
}
