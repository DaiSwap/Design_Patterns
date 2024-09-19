package Excersize1.BehavioralDesignPattern.BehavioralStrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create strategies
        FileSaveStrategy htmlStrategy = new HtmlSaveStrategy();
        FileSaveStrategy textStrategy = new TextSaveStrategy();

        // Create FileSaver context with HTML strategy
        FileSaver fileSaver = new FileSaver(htmlStrategy);
        fileSaver.save("This is a test content");

        System.out.println();

        // Change strategy to plain text
        fileSaver.setStrategy(textStrategy);
        fileSaver.save("This is a test content");
    }
}
