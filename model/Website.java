//Mahyar Engel - 2026-06-01- 1598159
package model;

public class Website {

    private String url;
    private String lastCheckedContent;
    private ComparisonStrategy strategy;

    public Website(String url, ComparisonStrategy strategy) {
        this.url = url;
        this.strategy = strategy;
        this.lastCheckedContent = "<html><body>Initial Version</body></html>";
    }

    public String getURL() {
        return url;
    }

    public boolean hasUpdate(String liveContent) {
        boolean changed = strategy.hasChanged(this.lastCheckedContent, liveContent);
        if (changed) {
            this.lastCheckedContent = liveContent;
        }
        return changed;
    }

}