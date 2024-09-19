package BehavioralDesignPattern.BehavioralStrategyDesignPattern;

public class HtmlSaveStrategy implements FileSaveStrategy {
    @Override
    public void saveFile(String content) {
        System.out.println("Saving content as HTML file.");
        // Simulate saving HTML file
        System.out.println("<html><body>" + content + "</body></html>");
    }
}
