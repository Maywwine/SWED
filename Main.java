//Mahyar Engel - 2026-06-01- 1598159
import model.User;
import notification.CommunicationChannel;
import service.MonitoringService;
import model.HtmlComparisonStrategy;
import model.ComparisonStrategy;
 
public class Main {
    public static void main(String[] args) {
        CommunicationChannel email = new CommunicationChannel("EMAIL");
        CommunicationChannel sms   = new CommunicationChannel("SMS");

        ComparisonStrategy htmlStrategy = new HtmlComparisonStrategy();
 
        User user = new User("May");
        user.registerForUpdate("https://example.com",          30, email, htmlStrategy);
        user.registerForUpdate("https://news.softwareengineering.com", 60, sms, htmlStrategy);
 
        MonitoringService monitor = new MonitoringService();
 
        System.out.println("\n--- Checking for updates ---");
        monitor.checkForUpdate(user.getSubscriptions());
 
        System.out.println("\n--- Cancelling first subscription ---");
        user.manageSub(0, "cancel");
 
        System.out.println("\n--- Checking again ---");
        monitor.checkForUpdate(user.getSubscriptions());
    }
}