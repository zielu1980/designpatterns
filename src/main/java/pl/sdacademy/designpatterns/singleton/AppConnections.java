package pl.sdacademy.designpatterns.singleton;


import java.util.ArrayList;
import java.util.List;

//LAZY
public class AppConnections {
  private static AppConnections instance;

  private List<String> connectedUsers;
  private int currentConnectionsNum;

  public static AppConnections getInstance() {
    if (instance == null) {
      // skoro jesteśmy tu to instancje dopiero tworzymy - 1.sze wywołanie
      instance = new AppConnections();
    }
    return instance;
  }

  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public void connectUser(final String username) {
    if (!connectedUsers.contains(username)) {
      connectedUsers.add(username);
    }
    currentConnectionsNum++;
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getCurrentConnectionsNum() {
    return currentConnectionsNum;
  }
}
