package pl.sdacademy.designpatterns.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

    private static AppConnections instance;

    private List<String> connectedUsers;
    private long timeout;
    private int currentConnectionsNum;

    private AppConnections() {
        connectedUsers = new ArrayList<>();
        timeout = 0;
        currentConnectionsNum = 0;
    }

    public static AppConnections getInstance() {
        if (instance == null) {
            instance = new AppConnections();
        }

        return instance;
    }

    public void connectUser(final String username) {
        currentConnectionsNum++;
        connectedUsers.add(username);
    }

    public List<String> getConnectedUsers() {
        return connectedUsers;
    }

    public long getTimeout() {
        return timeout;
    }

    public int getCurrentConnectionsNum() {
        return currentConnectionsNum;
    }
}
