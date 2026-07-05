//Mahyar Engel - 2026-06-01- 1598159
package model;

import notification.CommunicationChannel;
import java.util.ArrayList;
import java.util.List;

import notification.Observer;
//import model.ComparisonStrategy;

public class User implements Observer {
    private String name;
    private List<Subscription> subscriptions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String websiteURL) {
        System.out.println("Notification for " + name + ": Update detected on " + websiteURL);
    }

    public void registerForUpdate(
            String url,
            int frequency,
            CommunicationChannel channel,
            ComparisonStrategy strategy) {

        Website website = new Website(url, strategy);

        NotificationPrefrences pref =
                new NotificationPrefrences(
                        frequency,
                        channel);

        Subscription sub =
                new Subscription(
                        website,
                        pref,
                        this);

        subscriptions.add(sub);

        System.out.println(
                "Subscription created for: "
                + website.getURL());
    }


    public void manageSub(
            int index,
            String action) {

        if (index < 0 ||
                index >= subscriptions.size()) {

            System.out.println(
                    "Subscription not found.");
            return;
        }

        if ("cancel".equals(action)) {
            subscriptions.get(index).cancel();
        }
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }
}