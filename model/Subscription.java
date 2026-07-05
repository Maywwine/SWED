// Mahyar Engel - 2026-06-01 - 1598159
package model;

import notification.Observer;

public class Subscription {
    private Website website;
    private NotificationPrefrences preferences;
    private boolean               active;
    private Observer              observer;

    public Subscription(Website website, NotificationPrefrences preferences, Observer observer) {
        this.website = website;
        this.preferences = preferences;
        this.observer = observer;
        this.active     = true;
    }

    public void notifyObserver() {
        if (observer != null) {
            
            observer.update(website.getURL());
        }
    } 

    public NotificationPrefrences getPreferences() { return preferences; }
    public Website  getWebsite()  { return website; }
    public boolean  isActive()    { return active;  }
    
    public void cancel() {
        this.active = false;
        System.out.println("Subscription cancelled for: " + website.getURL());
    }
}