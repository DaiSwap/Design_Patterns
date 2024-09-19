package Excersize1.CreationalDesignPattern.CreationalSingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");
        logger1.log("Processing data...");

        Logger logger2 = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
        logger2.log("Application ended.");
    }
}
