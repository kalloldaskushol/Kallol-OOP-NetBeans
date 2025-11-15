package Practice_MID.WAP;

/**
 *
 * @author Kallol Das Kushol
 */
class ChatProfile {
    private String username;
    private String status;
    private int messageCount;

    ChatProfile(String username) {
        this.username = username;
        this.status = "Offline"; // default status
        this.messageCount = 0;
    }

    // sendMessage increases messageCount by 1
    public void sendMessage() {
        messageCount++;
    }

    // status setter with validation
    public void setStatus(String newStatus) {
        if (newStatus.equals("Online") || newStatus.equals("Busy") || newStatus.equals("Offline")) {
            this.status = newStatus;
        } else {
            System.out.println("Invalid status ignored!");
        }
    }

    // getter for status
    public String getStatus() {
        return status;
    }

    // getter for message count
    public int getMessageCount() {
        return messageCount;
    }
}

public class Self4 {
    public static void main(String[] args) {

        ChatProfile user = new ChatProfile("CaptainRoni");

        // set 2 valid statuses + 1 invalid
        user.setStatus("Online");   // valid
        user.setStatus("Busy");     // valid
        user.setStatus("Sleeping"); // invalid ❌ -> ignored

        // sendMessage() 5 times
        for (int i = 0; i < 5; i++) {
            user.sendMessage();
        }

        // print final status & message count
        System.out.println("Final Status: " + user.getStatus());
        System.out.println("Total Messages Sent: " + user.getMessageCount());
    }
}
