package BehavioralDesignPattern.BehavioralStrategyDesignPattern;

public class TextSaveStrategy implements FileSaveStrategy {
    @Override
    public void saveFile(String content) {
        System.out.println("Saving content as plain text file.");
        // Simulate saving plain text file
        System.out.println(content);
    }
}
