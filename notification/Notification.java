//Mahyar Engel - 2026-06-01- 1598159

package notification;

public class Notification {
    private String content;

    
     public void generate(String websiteUrl) {
         this.content = "Update detected on: " + websiteUrl;
        System.out.println("Notification generated: " + content);
    }
    public void deliver(CommunicationChannel channel) {
        if (channel.isAvailable()) {
            channel.send(this);
        } else {
            System.out.println("Communication channel is not available. Cannot deliver notification.");
        }
    }

    public String getContent() { return content; }
}
