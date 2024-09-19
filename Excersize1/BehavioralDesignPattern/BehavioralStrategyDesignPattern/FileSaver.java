package Excersize1.BehavioralDesignPattern.BehavioralStrategyDesignPattern;

public class FileSaver {
    private FileSaveStrategy strategy;

    public FileSaver(FileSaveStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FileSaveStrategy strategy) {
        this.strategy = strategy;
    }

    public void save(String content) {
        strategy.saveFile(content);
    }
}
