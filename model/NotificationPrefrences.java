//Mahyar Engel - 2026-06-01- 1598159
package model;

import notification.CommunicationChannel;

public class NotificationPrefrences {
    private int frequency;

    private CommunicationChannel channel;
 
    public NotificationPrefrences(int frequency, CommunicationChannel channel) {
        this.frequency = frequency;
        this.channel   = channel;
    }

    public int getFrequency() {
        return frequency;
    }
    public CommunicationChannel getChannel() { return channel; }
    public void setChannel(

      CommunicationChannel channel) {

    this.channel = channel;

    }
}
