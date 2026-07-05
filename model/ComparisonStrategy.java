package model;

public interface ComparisonStrategy {
    boolean hasChanged(String oldContent, String newContent);
}
