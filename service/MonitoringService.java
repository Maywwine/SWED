package service;

import java.util.List;

import model.Subscription;



public class MonitoringService {

    public void checkForUpdate(List<Subscription> subscriptions) {

        for (Subscription sub : subscriptions) {

           // 1. Wir simulieren einen neuen Live-Inhalt, der gerade aus dem Internet "geladen" wurde
            String simulatedLiveContent = "<html><body>Version 2 (Updated Content)</body></html>";

            // 2. FEHLERBEHEBUNG: Wir übergeben den simulierten Inhalt an hasUpdate()
            if (sub.isActive() && sub.getWebsite().hasUpdate(simulatedLiveContent)) {
                sub.notifyObserver();
            }
        }
    }

}