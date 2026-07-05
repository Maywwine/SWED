package model;

public class HtmlComparisonStrategy implements ComparisonStrategy {
    @Override
    public boolean hasChanged(String oldContent, String newContent) {
        // Wenn der Inhalt NICHT gleich ist, hat es sich geändert
        return !oldContent.equals(newContent);
    }
}