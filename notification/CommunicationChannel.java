//Mahyar Engel - 2026-06-01- 1598159
package notification;


public class CommunicationChannel {
    private String type;

    public CommunicationChannel(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void send(Notification notification) {
        // Implementation for sending the notification
        System.out.println("Sending notification through " + type);
    }

    public boolean isAvailable() {
        // Implementation to check if the communication channel is available
        return true; // Placeholder return value
    }
}
